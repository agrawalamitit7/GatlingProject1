package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration.DurationInt


class CheckPauseTimeAndResponse extends Simulation {

  //http conf
  val httpConf = http.baseUrl("https://reqres.in/")
    .header("Accept", value = "application/json")
    .header("content-type", value = "application/json")

  //scenario
  val scn=scenario("user api calls")

    .exec(http("list all users")
      .get("api/users?page=2")
      .check(status.is(200)))

    .pause(5) //it will pause script for 5 sec between request

    .exec(http("single user api")
      .get("api/users/2")
    .check(status.in(200 to 210)))

    .pause(1,10) //it will pause script between request randomly for 1 to 10 sec

    .exec(http("single user not found api")
      .get("api/users/23")
      .check(status.not(400),status.not(500)))

    .pause(3000.milliseconds)

  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
}
