$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/2200colour.feature");
formatter.feature({
  "name": "Colours",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@2200_Colour"
    }
  ]
});
formatter.scenario({
  "name": "Display of Paints and Texture Drop Down List",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@Drop_down_list1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Browser.userIsOnHomePage()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 112\nCurrent browser version is 114.0.5735.90 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-UU2F52V\u0027, ip: \u0027192.168.0.100\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.3\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tGetHandleVerifier [0x0036DCE3+50899]\n\t(No symbol) [0x002FE111]\n\t(No symbol) [0x00205588]\n\t(No symbol) [0x0022570C]\n\t(No symbol) [0x00221471]\n\t(No symbol) [0x0021F479]\n\t(No symbol) [0x00251FFE]\n\t(No symbol) [0x00251CEC]\n\t(No symbol) [0x0024B6F6]\n\t(No symbol) [0x00227708]\n\t(No symbol) [0x0022886D]\n\tGetHandleVerifier [0x005D3EAE+2566302]\n\tGetHandleVerifier [0x006092B1+2784417]\n\tGetHandleVerifier [0x0060327C+2759788]\n\tGetHandleVerifier [0x00405740+672048]\n\t(No symbol) [0x00308872]\n\t(No symbol) [0x003041C8]\n\t(No symbol) [0x003042AB]\n\t(No symbol) [0x002F71B7]\n\tBaseThreadInitThunk [0x77477D59+25]\n\tRtlInitializeExceptionChain [0x7770B74B+107]\n\tRtlClearBits [0x7770B6CF+191]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Browser.userIsOnHomePage(Browser.java:51)\r\n\tat ✽.User is on Home Page(features/2200colour.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User hovers over Paints and Texture Tab",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userHoversOverPaintsAndTextureTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Paints and Texture Drop down is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.paintsAndTextureDropdownIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Ctiolours Page Navigaon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@2200Colour_page_navigation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Paints and Texture Drop Down List",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnPaintsAndTextureDropDownList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Colours tab",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userClicksColoursTab()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.asianpaints.coloursandtextures.pageObjects.Colours.colour_2200()\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.colourPgObj\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.userClicksColoursTab(Colour2200.java:59)\r\n\tat ✽.User clicks Colours tab(features/2200colour.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Colour page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.colourPageIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Enquire Now Form Navigation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@Enquire"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Colours Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnColoursPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Enquire Now  tab",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userClicksEnquireNowTab()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.asianpaints.coloursandtextures.pageObjects.Colours.enquireNowButton()\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.colourPgObj\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.userClicksEnquireNowTab(Colour2200.java:78)\r\n\tat ✽.User clicks Enquire Now  tab(features/2200colour.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enquire Now form is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.enquireNowformIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Succesful Enquiry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Succesful_Enquiry"
    }
  ]
});
formatter.step({
  "name": "User is on Enquire Now form",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters Name \u003cName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Email \u003cEmail_ID\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Mobilenumber \u003cMobile_Number\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Pincode \u003cPincode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.step({
  "name": "Succesful Completion page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email_ID",
        "Mobile_Number",
        "Pincode"
      ]
    },
    {
      "cells": [
        "rahulm",
        "dharshana.ravichandran7513@gmail.com",
        "9994460184",
        "123"
      ]
    },
    {
      "cells": [
        "rahulmW",
        "dharshana.18ee@kct.ac.in",
        "6369501003",
        "12333"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Succesful Enquiry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@Succesful_Enquiry"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Enquire Now form",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnEnquireNowform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulm",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userEntersName(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.asianpaints.coloursandtextures.pageObjects.Colours.enterName(String)\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.colourPgObj\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.userEntersName(Colour2200.java:97)\r\n\tat ✽.User enters Name rahulm(features/2200colour.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Email dharshana.ravichandran7513@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersEmailID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Mobilenumber 9994460184",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersMobileNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Pincode 123",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersPincode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userClicksOnEnquireTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Succesful Completion page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.succesfulCompletionPageIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Succesful Enquiry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@Succesful_Enquiry"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Enquire Now form",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnEnquireNowform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulmW",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userEntersName(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.asianpaints.coloursandtextures.pageObjects.Colours.enterName(String)\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.colourPgObj\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.userEntersName(Colour2200.java:97)\r\n\tat ✽.User enters Name rahulmW(features/2200colour.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Email dharshana.18ee@kct.ac.in",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersEmailID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Mobilenumber 6369501003",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersMobileNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Pincode 12333",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersPincode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userClicksOnEnquireTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Succesful Completion page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.succesfulCompletionPageIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Unsuccesful Enquiry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Unsuccesful_Enquiry"
    }
  ]
});
formatter.step({
  "name": "User is on Enquire Now form",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters Name \u003cName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Email \u003cEmail_ID\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Mobilenumber \u003cMobile_Number\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Pincode \u003cPincode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.step({
  "name": "Unsuccesful Error Message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email_ID",
        "Mobile_Number",
        "Pincode"
      ]
    },
    {
      "cells": [
        "rahulm",
        "rahul@gmail.com",
        "98389392292",
        "123"
      ]
    },
    {
      "cells": [
        "rahulmW",
        "rahuWl@gmail.com",
        "938389392292",
        "12333"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Unsuccesful Enquiry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@Unsuccesful_Enquiry"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Enquire Now form",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnEnquireNowform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulm",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userEntersName(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.asianpaints.coloursandtextures.pageObjects.Colours.enterName(String)\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.colourPgObj\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.userEntersName(Colour2200.java:97)\r\n\tat ✽.User enters Name rahulm(features/2200colour.feature:40)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Email rahul@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersEmailID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Mobilenumber 98389392292",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersMobileNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Pincode 123",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersPincode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userClicksOnEnquireTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Unsuccesful Error Message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.unsuccesfulErrorMessageIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Unsuccesful Enquiry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@Unsuccesful_Enquiry"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Enquire Now form",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnEnquireNowform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulmW",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userEntersName(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.asianpaints.coloursandtextures.pageObjects.Colours.enterName(String)\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.colourPgObj\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.userEntersName(Colour2200.java:97)\r\n\tat ✽.User enters Name rahulmW(features/2200colour.feature:40)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Email rahuWl@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersEmailID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Mobilenumber 938389392292",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersMobileNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters Pincode 12333",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userEntersPincode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.userClicksOnEnquireTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Unsuccesful Error Message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.unsuccesfulErrorMessageIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Colours Product Page Navigation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@ProductNavigation_1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Colours Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnColoursPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Colours product",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.userClicksOnTheColoursProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Colours Product page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.coloursProductPageIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To close the browser after completion of the feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2200_Colour"
    },
    {
      "name": "@close_browser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Colours Product Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Colour2200.userIsOnColoursProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.closeTheBrowser()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.close()\" because \"com.asianpaints.coloursandtextures.stepDefinitions.Browser.driver\" is null\r\n\tat com.asianpaints.coloursandtextures.stepDefinitions.Colour2200.closeTheBrowser(Colour2200.java:181)\r\n\tat ✽.Close the Browser(features/2200colour.feature:61)\r\n",
  "status": "failed"
});
});