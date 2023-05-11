package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SearchGoogleRequestSimulation extends Simulation{

//  val httpConf = http.baseUrl("https://reqres.in")
//    .header("content-type", value = "application/json")
//    .header("Accept", value = "application/json")

  val scn = scenario("Get User")
    .exec(http("getUserList")
      .get("http://www.google.fr")
      .queryParam("query", "gatling")
      .queryParam("source", "mobile")
      .header("Accept-Language", "fr")
      .check(status is 200))

  setUp(scn.inject(atOnceUsers(1)))
    //.protocols(httpConf)


}
