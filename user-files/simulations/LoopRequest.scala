package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class LoopRequest extends Simulation {

  val httpConf = http.baseUrl("https://reqres.in/")
    .header("Accept", value = "application/json")
    .header("content-type", value = "application/json")

def getAllUsersRequest()={
  repeat(3){
    exec(http("get all users request")
      .get("api/users?page=2")
    .check(status.is(200)))
  }
}

  def getAUsersRequest() = {
    repeat(2) {
      exec(http("get single user request")
        .get("api/users/2")
      .check(status.is(200)))

    }
  }

def addUser()={
  repeat(2){
    exec(http("add user request")
    .post("api/users")
    .body(RawFileBody("./user-files/resources/bodies/AddUser.json")).asJson
    .check(status.is(201)))

  }
}

  val scn=scenario("user request scenario")
    .exec(getAllUsersRequest())
    .pause(2)
    .exec(addUser())
    .pause(2)
    .exec(getAUsersRequest())



  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
}
