
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ParabankParaSoftAccountScala extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://parabank.parasoft.com")
    .inferHtmlResources()
  
  private val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Cache-Control" -> "max-age=0",
  		"Origin" -> "https://parabank.parasoft.com",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_1 = Map(
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_19 = Map(
  		"Accept" -> "application/json, text/plain, */*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_20 = Map(
  		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Sec-Fetch-Dest" -> "image",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_21 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_42 = Map(
  		"Accept" -> "application/json, text/plain, */*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Content-Type" -> "application/json;charset=UTF-8",
  		"Origin" -> "https://parabank.parasoft.com",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )


  private val scn = scenario("ParabankParaSoftAccountScala")
    .exec(
      http("LoginRequest")
        .post("/parabank/login.htm")
        .headers(headers_0)
        .formParam("username", "amit0707")
        .formParam("password", "amit0707")
        .resources(
          http("request_1")
            .get("/parabank/webjars/angularjs/1.8.2/angular.min.js")
            .headers(headers_1),
          http("request_2")
            .get("/parabank/images/clear.gif")
            .headers(headers_1),
          http("request_3")
            .get("/parabank/images/logo.gif")
            .headers(headers_1),
          http("request_4")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_1),
          http("request_5")
            .get("/parabank/images/topbg.gif")
            .headers(headers_1),
          http("request_6")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_1),
          http("request_7")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_1),
          http("request_8")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_1),
          http("request_9")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_1),
          http("request_10")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_1),
          http("request_11")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_1),
          http("request_12")
            .get("/parabank/images/bullet2-normal.gif")
            .headers(headers_1),
          http("request_13")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_1),
          http("request_14")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_1),
          http("request_15")
            .get("/parabank/images/header-customer.jpg"),
          http("request_16")
            .get("/parabank/images/gradhead.png"),
          http("request_17")
            .get("/parabank/images/gradback.png"),
          http("request_18")
            .get("/parabank/images/bullet2-hover.gif"),
          http("GetAccount")
            .get("/parabank/services_proxy/bank/customers/14099/accounts")
            .headers(headers_19)
        )
    )
    .pause(6)
    .exec(
      http("request_20")
        .get("/parabank/images/gradhover.png")
        .headers(headers_20)
    )
    .pause(38)
    .exec(
      http("request_21")
        .get("/parabank/openaccount.htm")
        .headers(headers_21)
        .resources(
          http("request_22")
            .get("/parabank/webjars/angularjs/1.8.2/angular.min.js")
            .headers(headers_1),
          http("request_23")
            .get("/parabank/images/clear.gif")
            .headers(headers_1),
          http("request_24")
            .get("/parabank/images/logo.gif")
            .headers(headers_1),
          http("request_25")
            .get("/parabank/images/main-bg.gif"),
          http("request_26")
            .get("/parabank/images/topbg.gif"),
          http("request_27")
            .get("/parabank/images/header-customer.jpg")
            .headers(headers_1),
          http("request_28")
            .get("/parabank/images/bullet-hover.gif"),
          http("request_29")
            .get("/parabank/images/bullet-normal.gif"),
          http("request_30")
            .get("/parabank/images/home-normal.gif"),
          http("request_31")
            .get("/parabank/images/aboutus-normal.gif"),
          http("request_32")
            .get("/parabank/images/contact-normal.gif"),
          http("request_33")
            .get("/parabank/images/bodybg.gif"),
          http("request_34")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_35")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_36")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_37")
            .get("/parabank/images/sky-color-bg.gif"),
          http("request_38")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_1),
          http("request_39")
            .get("/parabank/images/footerbg.gif"),
          http("request_40")
            .get("/parabank/images/bullet2-hover.gif"),
          http("CreateRequest")
            .get("/parabank/services_proxy/bank/customers/14099/accounts")
            .headers(headers_19)
        )
    )
    .pause(13)
    .exec(
      http("request_42")
        .post("/parabank/services_proxy/bank/createAccount?customerId=14099&newAccountType=0&fromAccountId=16119")
        .headers(headers_42)
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
