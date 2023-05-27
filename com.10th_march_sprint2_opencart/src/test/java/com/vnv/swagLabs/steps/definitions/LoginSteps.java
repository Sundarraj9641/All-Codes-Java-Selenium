package com.vnv.swagLabs.steps.definitions;

import com.vnv.swagLabs.runner.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    public static LoginPage login = new LoginPage();

    @Given("User is on Login Page of SwagLabs application")
    public void userIsOnLoginPageOfSwagLabsApplication() throws Exception  {
        login.launchApplication();
        
    }

    @When("I enter the {string} as {string} on Login Page of SwagLabs application")
    public void iEnterTheAsOnLoginPageOfSwagLabsApplication(String field, String input) throws Exception {
    	
        login.enterInput(field,input);
        Thread.sleep(3000);
    }

    @And("I Click on the {string} button on Login Page of SwagLabs application")
    public void iClickOnTheButtonOnLoginPageOfSwagLabsApplication(String button) {
       login.clickButton(button);
    }


}
