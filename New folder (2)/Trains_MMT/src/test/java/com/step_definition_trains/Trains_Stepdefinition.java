package com.step_definition_trains;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driversetup_trains.SetUpDriver1_trains;
import com.pagefactory_trains.Trains_pagefactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trains_Stepdefinition {
	WebDriver driver;
	Trains_pagefactory rtpf;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    driver = SetUpDriver1_trains.chromeDriver();
	    driver.get("https://www.makemytrip.com/");
	}

	@When("user clicks on Trains page")
	public void user_clicks_on_Trains_page() {
	   rtpf = new Trains_pagefactory(driver);
	   rtpf = PageFactory.initElements(driver, Trains_pagefactory.class);
	   rtpf.Trains();
	}

	@Then("user should be in Trains page")
	public void user_should_be_in_Trains_page() {
	    System.out.println("its working");
	}
	
}
