$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Flights.feature");
formatter.feature({
  "name": "Booking flight",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Flights"
    }
  ]
});
formatter.scenario({
  "name": "Booking the flight under one way",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@one_way"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flights.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 112\nCurrent browser version is 114.0.5735.90 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LIN76001689\u0027, ip: \u002710.219.50.209\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: driver.version: SetUpDriver\nremote stacktrace: Backtrace:\n\tGetHandleVerifier [0x0046DCE3+50899]\n\t(No symbol) [0x003FE111]\n\t(No symbol) [0x00305588]\n\t(No symbol) [0x0032570C]\n\t(No symbol) [0x00321471]\n\t(No symbol) [0x0031F479]\n\t(No symbol) [0x00351FFE]\n\t(No symbol) [0x00351CEC]\n\t(No symbol) [0x0034B6F6]\n\t(No symbol) [0x00327708]\n\t(No symbol) [0x0032886D]\n\tGetHandleVerifier [0x006D3EAE+2566302]\n\tGetHandleVerifier [0x007092B1+2784417]\n\tGetHandleVerifier [0x0070327C+2759788]\n\tGetHandleVerifier [0x00505740+672048]\n\t(No symbol) [0x00408872]\n\t(No symbol) [0x004041C8]\n\t(No symbol) [0x004042AB]\n\t(No symbol) [0x003F71B7]\n\tBaseThreadInitThunk [0x75A36BA9+25]\n\tRtlGetFullPathName_UEx [0x76F48F9F+1215]\n\tRtlGetFullPathName_UEx [0x76F48F6D+1165]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:122)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:212)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:130)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\r\n\tat com.driversetup.SetUpDriver.chromeDriver(SetUpDriver.java:28)\r\n\tat com.step_definitions.Flights.user_is_on_the_flight_booking_page(Flights.java:26)\r\n\tat ✽.user is on the flight booking page(src/test/resources/Features/Flights.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flights.user_click_on_one_way_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flights.user_enter_the_from_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flights.user_enter_the_to_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flights.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the details of passengers",
  "keyword": "When "
});
formatter.match({
  "location": "Flights.user_enter_the_details_of_passengers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Flights.click_on_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is able to see the available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "Flights.user_is_able_to_see_the_available_flights()"
});
formatter.result({
  "status": "skipped"
});
});