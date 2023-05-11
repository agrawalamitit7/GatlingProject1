
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulation extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://j2store.net")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("Accept-Encoding", "gzip, deflate, br");
    headers_0.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_0.put("Cache-Control", "max-age=0");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "same-origin");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    headers_0.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_0.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_1.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_15 = new HashMap<>();
    headers_15.put("Origin", "https://j2store.net");
    headers_15.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_15.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_15.put("sec-ch-ua-mobile", "?0");
    headers_15.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_23 = new HashMap<>();
    headers_23.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_23.put("Accept-Encoding", "gzip, deflate, br");
    headers_23.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_23.put("Sec-Fetch-Dest", "document");
    headers_23.put("Sec-Fetch-Mode", "navigate");
    headers_23.put("Sec-Fetch-Site", "same-origin");
    headers_23.put("Sec-Fetch-User", "?1");
    headers_23.put("Upgrade-Insecure-Requests", "1");
    headers_23.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_23.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_23.put("sec-ch-ua-mobile", "?0");
    headers_23.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_45 = new HashMap<>();
    headers_45.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_45.put("Accept-Encoding", "gzip, deflate, br");
    headers_45.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_45.put("Cache-Control", "no-cache, no-store, must-revalidate");
    headers_45.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_45.put("Expires", "0");
    headers_45.put("Origin", "https://j2store.net");
    headers_45.put("Pragma", "no-cache");
    headers_45.put("Sec-Fetch-Dest", "empty");
    headers_45.put("Sec-Fetch-Mode", "cors");
    headers_45.put("Sec-Fetch-Site", "same-origin");
    headers_45.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_45.put("X-Requested-With", "XMLHttpRequest");
    headers_45.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_45.put("sec-ch-ua-mobile", "?0");
    headers_45.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_46 = new HashMap<>();
    headers_46.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_46.put("Accept-Encoding", "gzip, deflate, br");
    headers_46.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_46.put("Cache-Control", "no-cache, no-store, must-revalidate");
    headers_46.put("Content-Type", "application/json; charset=utf-8");
    headers_46.put("Expires", "0");
    headers_46.put("Pragma", "no-cache");
    headers_46.put("Sec-Fetch-Dest", "empty");
    headers_46.put("Sec-Fetch-Mode", "cors");
    headers_46.put("Sec-Fetch-Site", "same-origin");
    headers_46.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_46.put("X-Requested-With", "XMLHttpRequest");
    headers_46.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_46.put("sec-ch-ua-mobile", "?0");
    headers_46.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_65 = new HashMap<>();
    headers_65.put("Accept", "text/css,*/*;q=0.1");
    headers_65.put("Accept-Encoding", "gzip, deflate, br");
    headers_65.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_65.put("Sec-Fetch-Dest", "style");
    headers_65.put("Sec-Fetch-Mode", "no-cors");
    headers_65.put("Sec-Fetch-Site", "same-origin");
    headers_65.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_65.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_65.put("sec-ch-ua-mobile", "?0");
    headers_65.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_67 = new HashMap<>();
    headers_67.put("Accept", "*/*");
    headers_67.put("Accept-Encoding", "gzip, deflate, br");
    headers_67.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_67.put("Sec-Fetch-Dest", "script");
    headers_67.put("Sec-Fetch-Mode", "no-cors");
    headers_67.put("Sec-Fetch-Site", "same-origin");
    headers_67.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_67.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_67.put("sec-ch-ua-mobile", "?0");
    headers_67.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_73 = new HashMap<>();
    headers_73.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_73.put("Accept-Encoding", "gzip, deflate, br");
    headers_73.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_73.put("Sec-Fetch-Dest", "image");
    headers_73.put("Sec-Fetch-Mode", "no-cors");
    headers_73.put("Sec-Fetch-Site", "same-origin");
    headers_73.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_73.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_73.put("sec-ch-ua-mobile", "?0");
    headers_73.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_74 = new HashMap<>();
    headers_74.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_74.put("Accept-Encoding", "gzip, deflate, br");
    headers_74.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_74.put("Sec-Fetch-Dest", "empty");
    headers_74.put("Sec-Fetch-Mode", "cors");
    headers_74.put("Sec-Fetch-Site", "same-origin");
    headers_74.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_74.put("X-Requested-With", "XMLHttpRequest");
    headers_74.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_74.put("sec-ch-ua-mobile", "?0");
    headers_74.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_83 = new HashMap<>();
    headers_83.put("Accept", "*/*");
    headers_83.put("Accept-Encoding", "gzip, deflate, br");
    headers_83.put("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_83.put("Cache-Control", "no-cache, no-store, must-revalidate");
    headers_83.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_83.put("Expires", "0");
    headers_83.put("Origin", "https://j2store.net");
    headers_83.put("Pragma", "no-cache");
    headers_83.put("Sec-Fetch-Dest", "empty");
    headers_83.put("Sec-Fetch-Mode", "cors");
    headers_83.put("Sec-Fetch-Site", "same-origin");
    headers_83.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
    headers_83.put("X-Requested-With", "XMLHttpRequest");
    headers_83.put("sec-ch-ua", "Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99");
    headers_83.put("sec-ch-ua-mobile", "?0");
    headers_83.put("sec-ch-ua-platform", "Windows");
    
    String uri2 = "https://fonts.gstatic.com/s/sourcesanspro/v21";
    
    String uri3 = "https://fonts.googleapis.com/css";

    ScenarioBuilder scn = scenario("RecordedSimulation")
      .exec(
        http("request_0")
          .get("/demo/index.php/shop")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get("/demo/t3-assets/js/js-4a638-24065.js")
              .headers(headers_1),
            http("request_2")
              .get("/demo/images/themeparrot/category_images/Shopping.jpg")
              .headers(headers_1),
            http("request_3")
              .get("/demo/images/themeparrot/blenders/blenders_02.png")
              .headers(headers_1),
            http("request_4")
              .get("/demo/images/themeparrot/t-shirt/t-shirt_01.png")
              .headers(headers_1),
            http("request_5")
              .get("/demo/images/themeparrot/leggings/leggins_01.png")
              .headers(headers_1),
            http("request_6")
              .get("/demo/images/themeparrot/pots/pots_and_pans_01.png")
              .headers(headers_1),
            http("request_7")
              .get("/demo/images/themeparrot/product_image_07.png")
              .headers(headers_1),
            http("request_8")
              .get("/demo/images/themeparrot/blenders/blenders_01.png")
              .headers(headers_1),
            http("request_9")
              .get("/demo/images/themeparrot/blenders/blenders_03.png")
              .headers(headers_1),
            http("request_10")
              .get("/demo/images/themeparrot/blenders/blenders_05.png")
              .headers(headers_1),
            http("request_11")
              .get("/demo/images/themeparrot/t-shirt/t-shirt_05.png")
              .headers(headers_1),
            http("request_12")
              .get("/demo/images/themeparrot/bed/bed1.png")
              .headers(headers_1),
            http("request_13")
              .get("/demo/images/themeparrot/toaster/toaster_04.png")
              .headers(headers_1),
            http("request_14")
              .get("/demo/media/system/css/system.css")
              .headers(headers_1),
            http("request_15")
              .get("/demo/plugins/system/t3/base-bs3/fonts/font-awesome/font/fontawesome-webfont.woff?v=3.2.1")
              .headers(headers_15),
            http("request_16")
              .get("/demo/templates/shoplook/fonts/font-awesome/fonts/fontawesome-webfont.woff2?v=4.5.0")
              .headers(headers_15),
            http("request_17")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ik4zwlxdu.woff2")
              .headers(headers_15),
            http("request_18")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNq7lqDY.woff2")
              .headers(headers_15),
            http("request_19")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7l.woff2")
              .headers(headers_15),
            http("request_20")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdu.woff2")
              .headers(headers_15),
            http("request_21")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwlxdu.woff2")
              .headers(headers_15),
            http("request_22")
              .get("/demo/templates/shoplook/favicon.ico")
          )
      )
      .pause(14)
      .exec(
        http("request_23")
          .get("/demo/index.php/shop?filter_catid=&search=blender&sortby=&pricefrom=0&priceto=1000")
          .headers(headers_23)
          .resources(
            http("request_24")
              .get("/demo/t3-assets/js/js-4a638-24065.js")
              .headers(headers_1),
            http("request_25")
              .get("/demo/images/themeparrot/category_images/Shopping.jpg")
              .headers(headers_1),
            http("request_26")
              .get("/demo/images/themeparrot/blenders/blenders_02.png")
              .headers(headers_1),
            http("request_27")
              .get("/demo/images/themeparrot/blenders/blenders_01.png")
              .headers(headers_1),
            http("request_28")
              .get("/demo/images/themeparrot/blenders/blenders_03.png")
              .headers(headers_1),
            http("request_29")
              .get("/demo/images/themeparrot/blenders/blenders_05.png")
              .headers(headers_1),
            http("request_30")
              .get("/demo/images/themeparrot/bed/bed1.png")
              .headers(headers_1),
            http("request_31")
              .get("/demo/images/themeparrot/toaster/toaster_04.png")
              .headers(headers_1),
            http("request_32")
              .get("/demo/t3-assets/css/css-8034a-24061.css"),
            http("request_33")
              .get(uri3 + "?family=Source+Sans+Pro:300,400,600,700,900"),
            http("request_34")
              .get("/demo/t3-assets/css/css-a99e1-24061.css"),
            http("request_35")
              .get("/demo/t3-assets/css/css-f1642-24064.css"),
            http("request_36")
              .get("/demo/t3-assets/css/css-824e1-24064.css"),
            http("request_37")
              .get("/demo/media/system/css/system.css")
              .headers(headers_1),
            http("request_38")
              .get("/demo/plugins/system/t3/base-bs3/fonts/font-awesome/font/fontawesome-webfont.woff?v=3.2.1")
              .headers(headers_15),
            http("request_39")
              .get("/demo/templates/shoplook/fonts/font-awesome/fonts/fontawesome-webfont.woff2?v=4.5.0")
              .headers(headers_15),
            http("request_40")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ik4zwlxdu.woff2")
              .headers(headers_15),
            http("request_41")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNq7lqDY.woff2")
              .headers(headers_15),
            http("request_42")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7l.woff2")
              .headers(headers_15),
            http("request_43")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdu.woff2")
              .headers(headers_15),
            http("request_44")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwlxdu.woff2")
              .headers(headers_15)
          )
      )
      .pause(7)
      .exec(
        http("request_45")
          .post("/demo/index.php/cart/addItem")
          .headers(headers_45)
          .formParam("product_id", "60")
          .formParam("option", "com_j2store")
          .formParam("view", "carts")
          .formParam("task", "addItem")
          .formParam("ajax", "1")
          .formParam("4e5651793c35efd5863f1e3b8e9b7e8c", "1")
          .formParam("return", "aHR0cHM6Ly9qMnN0b3JlLm5ldC9kZW1vL2luZGV4LnBocC9zaG9wP2ZpbHRlcl9jYXRpZD0mc2VhcmNoPWJsZW5kZXImc29ydGJ5PSZwcmljZWZyb209MCZwcmljZXRvPTEwMDA=")
          .resources(
            http("request_46")
              .get("/demo/index.php/cart/ajaxmini?_=1683096887197")
              .headers(headers_46),
            http("request_47")
              .get("/demo/index.php/cart/ajaxmini?_=1683096887198")
              .headers(headers_46)
          )
      )
      .pause(23)
      .exec(
        http("request_48")
          .get("/demo/index.php/cart")
          .headers(headers_23)
          .resources(
            http("request_49")
              .get("/demo/images/themeparrot/category_images/Shopping.jpg")
              .headers(headers_1),
            http("request_50")
              .get("/demo/images/themeparrot/blenders/blenders_02.png")
              .headers(headers_1),
            http("request_51")
              .get("/demo/images/themeparrot/blenders/blenders_03.png")
              .headers(headers_1),
            http("request_52")
              .get("/demo/images/themeparrot/bed/bed1.png")
              .headers(headers_1),
            http("request_53")
              .get("/demo/images/themeparrot/toaster/toaster_04.png")
              .headers(headers_1),
            http("request_54")
              .get("/demo/t3-assets/css/css-8034a-24061.css"),
            http("request_55")
              .get("/demo/t3-assets/css/css-824e1-24064.css"),
            http("request_56")
              .get(uri3 + "?family=Source+Sans+Pro:300,400,600,700,900"),
            http("request_57")
              .get("/demo/media/system/css/system.css")
              .headers(headers_1),
            http("request_58")
              .get("/demo/plugins/system/t3/base-bs3/fonts/font-awesome/font/fontawesome-webfont.woff?v=3.2.1")
              .headers(headers_15),
            http("request_59")
              .get("/demo/templates/shoplook/fonts/font-awesome/fonts/fontawesome-webfont.woff2?v=4.5.0")
              .headers(headers_15),
            http("request_60")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ik4zwlxdu.woff2")
              .headers(headers_15),
            http("request_61")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNq7lqDY.woff2")
              .headers(headers_15),
            http("request_62")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7l.woff2")
              .headers(headers_15),
            http("request_63")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdu.woff2")
              .headers(headers_15),
            http("request_64")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwlxdu.woff2")
              .headers(headers_15),
            http("request_65")
              .get("/demo/t3-assets/css/css-1a510-24064.css")
              .headers(headers_65),
            http("request_66")
              .get("/demo/t3-assets/css/css-4a215-24062.css")
              .headers(headers_65),
            http("request_67")
              .get("/demo/t3-assets/js/js-c1f7c-24065.js")
              .headers(headers_67),
            http("request_68")
              .get("/demo/images/themeparrot/blenders/blenders_02.png"),
            http("request_69")
              .get("/demo/images/themeparrot/blenders/blenders_03.png"),
            http("request_70")
              .get("/demo/images/themeparrot/category_images/Shopping.jpg"),
            http("request_71")
              .get("/demo/images/themeparrot/bed/bed1.png"),
            http("request_72")
              .get("/demo/images/themeparrot/toaster/toaster_04.png"),
            http("request_73")
              .get("/demo/media/j2store/images/loader.gif")
              .headers(headers_73),
            http("request_74")
              .get("/demo/index.php/cart?option=com_j2store&view=carts&task=getCountry&country_id=4")
              .headers(headers_74)
          )
      )
      .pause(50)
      .exec(
        http("request_75")
          .get("/demo/index.php/checkout")
          .headers(headers_23)
          .resources(
            http("request_76")
              .get("/demo/media/system/css/system.css"),
            http("request_77")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwlxdu.woff2"),
            http("request_78")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7l.woff2"),
            http("request_79")
              .get("/demo/templates/shoplook/fonts/font-awesome/fonts/fontawesome-webfont.woff2?v=4.5.0"),
            http("request_80")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3ik4zwlxdu.woff2"),
            http("request_81")
              .get(uri2 + "/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNq7lqDY.woff2"),
            http("request_82")
              .get(uri2 + "/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdu.woff2"),
            http("request_83")
              .post("/demo/index.php/checkout")
              .headers(headers_83)
              .formParam("option", "com_j2store")
              .formParam("view", "checkout")
              .formParam("task", "login")
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
