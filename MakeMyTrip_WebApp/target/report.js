$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Registration.feature");
formatter.feature({
  "name": "Registration on the Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Successful login on the Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Successfull_Login"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_the_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter the Valid Details",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_Enter_the_Valid_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the Home Page of the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.navigate_to_the_Home_Page_of_the_Application()"
});
formatter.result({
  "status": "passed"
});
});