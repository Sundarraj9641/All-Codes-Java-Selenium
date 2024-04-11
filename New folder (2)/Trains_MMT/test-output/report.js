$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Trains.feature");
formatter.feature({
  "name": "Booking_Trains",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Booking"
    }
  ]
});
formatter.scenario({
  "name": "Redirect to trains page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Tag1"
    }
  ]
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Trains_Stepdefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Trains page",
  "keyword": "When "
});
formatter.match({
  "location": "Trains_Stepdefinition.user_clicks_on_Trains_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in Trains page",
  "keyword": "Then "
});
formatter.match({
  "location": "Trains_Stepdefinition.user_should_be_in_Trains_page()"
});
formatter.result({
  "status": "passed"
});
});