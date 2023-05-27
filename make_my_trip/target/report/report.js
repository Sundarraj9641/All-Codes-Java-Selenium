$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/MakeMyTrip.feature");
formatter.feature({
  "name": "MakeMyTrip",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@makemytrip"
    }
  ]
});
formatter.scenario({
  "name": "Successful login with all valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@makemytrip"
    },
    {
      "name": "@succesful_login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "MakeMyTrip.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all valid data",
  "keyword": "When "
});
formatter.match({
  "location": "MakeMyTrip.user_enters_all_valid_data()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cli data-cy\u003d\"account\" class\u003d\"makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"\u003e...\u003c/li\u003e is not clickable at point (998, 26). Other element would receive the click: \u003csection data-cy\u003d\"CommonModal_2\" class\u003d\"modalMain tcnFooter \"\u003e...\u003c/section\u003e\n  (Session info: chrome\u003d113.0.5672.127)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIN76001689\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\SUMAHALI\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58132}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 1baac30b3f4591d3c8dafee6f8e934da\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.step_definition.MakeMyTrip.user_enters_all_valid_data(MakeMyTrip.java:50)\r\n\tat ✽.user enters all valid data(Feature/MakeMyTrip.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "navigate to booking page",
  "keyword": "Then "
});
formatter.match({
  "location": "MakeMyTrip.navigate_to_booking_page()"
});
formatter.result({
  "status": "skipped"
});
});