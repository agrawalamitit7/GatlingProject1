package computerdatabase

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetUserSimulation extends Simulation {

  //protocol setup
  val httpConf=http.baseUrl("https://reqres.in")
    .header("content-type",value="application/json")
    .header("Accept",value="application/json")

  //scenario defination
  val scn=scenario("Get User")
    .exec(http("getUserList")
    .get("/api/users/2")
    .check(status is 200))

  //load simulation design
  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)

}
