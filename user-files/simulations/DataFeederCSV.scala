package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class DataFeederCSV extends Simulation {

  val httpConf = http.baseUrl("https://gorest.co.in/")
    .header("Authorization", value = "Bearer 171eef1b743856751be6710285f0befc0ca828eaf6849645533e6340bb088a12")

  val csvFeeder=csv("./user-files/resources/data/getUser.csv").circular

  def getAUser()={
    repeat(7){

      feed(csvFeeder)
        .exec(http("Get single user request")
        .get("public/v2/users/${userid}")
        .check(jsonPath("$.name").is("${name}"))
        .check(status.in(200,304)))

        .pause(2)
    }

  }



  val scn=scenario("CSV Feeder test").exec(getAUser())

  setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)

  //println(jsonPath("$.name"))

}
