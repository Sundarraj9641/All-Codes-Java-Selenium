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
  "location": "Browser.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hovers over Paints and Texture Tab",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_hovers_over_Paints_and_Texture_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Paints and Texture Drop down is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.paints_and_Texture_Drop_down_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Colours Page Navigation",
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
  "location": "Colour2200.user_is_on_Paints_and_Texture_Drop_Down_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Colours tab",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_clicks_Colours_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Colour page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.colour_page_is_displayed()"
});
formatter.result({
  "status": "passed"
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
  "location": "Colour2200.user_is_on_Colours_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Enquire Now  tab",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_clicks_Enquire_Now_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enquire Now form is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.enquire_Now_form_is_displayed()"
});
formatter.result({
  "status": "passed"
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
  "location": "Colour2200.user_is_on_Enquire_Now_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulm",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_enters_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email rahul@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Email_ID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Mobilenumber 98389392292",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Mobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Pincode 123",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Pincode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_clicks_on_Enquire_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Succesful Completion page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.succesful_Completion_page_is_displayed()"
});
formatter.result({
  "status": "passed"
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
  "location": "Colour2200.user_is_on_Enquire_Now_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulmW",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_enters_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email rahuWl@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Email_ID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Mobilenumber 938389392292",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Mobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Pincode 12333",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Pincode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_clicks_on_Enquire_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Succesful Completion page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.succesful_Completion_page_is_displayed()"
});
formatter.result({
  "status": "passed"
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
  "location": "Colour2200.user_is_on_Enquire_Now_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulm",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_enters_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email rahul@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Email_ID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Mobilenumber 98389392292",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Mobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Pincode 123",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Pincode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_clicks_on_Enquire_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Unsuccesful Error Message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.unsuccesful_Error_Message_is_displayed()"
});
formatter.result({
  "status": "passed"
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
  "location": "Colour2200.user_is_on_Enquire_Now_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name rahulmW",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_enters_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email rahuWl@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Email_ID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Mobilenumber 938389392292",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Mobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Pincode 12333",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_enters_Pincode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Enquire Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Colour2200.user_clicks_on_Enquire_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Unsuccesful Error Message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.unsuccesful_Error_Message_is_displayed()"
});
formatter.result({
  "status": "passed"
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
  "location": "Colour2200.user_is_on_Colours_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Colours product",
  "keyword": "When "
});
formatter.match({
  "location": "Colour2200.user_clicks_on_the_Colours_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Colours Product page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Colour2200.colours_Product_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});