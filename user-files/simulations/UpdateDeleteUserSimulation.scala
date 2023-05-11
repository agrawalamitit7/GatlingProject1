package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration.DurationInt

class UpdateDeleteUserSimulation extends Simulation{

  val httpConf=http.baseUrl("https://reqres.in/")
    .header("Accept",value="application/json")
    .header("content-type",value="application/json")

  val scn = scenario("Update And Delete User scenario")

    //updating user
    .exec(http("Update specific user")
      .put("api/users/2")
      .body(RawFileBody("./user-files/resources/bodies/UpdateUser.json")).asJson
      .check(status.in(200 to 210)))

    .pause(3)

    //deleting user
    .exec(http("Delete specific user")
    .delete("api/users/2")
    .check(status.in(200 to 204)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
}
