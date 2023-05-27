$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/swagLabs/login.feature");
formatter.feature({
  "name": "Validate Login functionality of Swag Labs application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login into SwagLabs application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Login Page of SwagLabs application",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter the \"UserName\" as \"\u003cusername\u003e\" on Login Page of SwagLabs application",
  "keyword": "When "
});
formatter.step({
  "name": "I enter the \"Password\" as \"\u003cpassword\u003e\" on Login Page of SwagLabs application",
  "keyword": "When "
});
formatter.step({
  "name": "I Click on the \"Login\" button on Login Page of SwagLabs application",
  "keyword": "And "
});
formatter.step({
  "name": "User should navigate to the Products page of SwagLabs application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "pravinsingh918@gmail.com",
        "singh"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login into SwagLabs application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Login Page of SwagLabs application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vnv.swagLabs.steps.definitions.LoginSteps.userIsOnLoginPageOfSwagLabsApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the \"UserName\" as \"pravinsingh918@gmail.com\" on Login Page of SwagLabs application",
  "keyword": "When "
});
formatter.match({
  "location": "com.vnv.swagLabs.steps.definitions.LoginSteps.iEnterTheAsOnLoginPageOfSwagLabsApplication(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the \"Password\" as \"singh\" on Login Page of SwagLabs application",
  "keyword": "When "
});
formatter.match({
  "location": "com.vnv.swagLabs.steps.definitions.LoginSteps.iEnterTheAsOnLoginPageOfSwagLabsApplication(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on the \"Login\" button on Login Page of SwagLabs application",
  "keyword": "And "
});
formatter.match({
  "location": "com.vnv.swagLabs.steps.definitions.LoginSteps.iClickOnTheButtonOnLoginPageOfSwagLabsApplication(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the Products page of SwagLabs application",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vnv.swagLabs.steps.definitions.ProductsSteps.userShouldNavigateToThePageOfSwagLabsApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});