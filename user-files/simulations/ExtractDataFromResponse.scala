package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ExtractDataFromResponse extends Simulation {

  val httpConf = http.baseUrl("https://gorest.co.in/")
    .header("Authorization",value="Bearer 56ac16c81399e38d4f77ea3efa5044ba6997d468a2d134feca9a5bde10ae44b2")

  val scn=scenario("Check correlation and extract data")
    .exec(http("Get all user")
    .get("public/v2/users")
    .check(jsonPath("$[0].id").saveAs("userid")))

    //get a specific user based on id
    .exec(http("Get specific user")
    .get("public/v2/users/${userid}")
      .check(jsonPath("$.id").is("1374017"))
      .check(jsonPath("$.name").is("Jaimini Prajapat LLD1"))
      .check(jsonPath("$.email").is("prajapat_jaimini_lld@corkery-wilkinson.test")))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
}
