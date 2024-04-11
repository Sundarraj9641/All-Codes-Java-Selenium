package com.asianpaints.coloursandtextures.stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exterior
{
	@When("User clicks Exterior Textures  tab")
	public void userClicksExteriorTexturesTab() 
	{
		System.out.println("User clicks Exterior Textures  tab");
		Browser.exteriorPgObj.exterior();
	}

	@Then("Exterior Texture page is displayed")
	public void exteriorTexturePageIsDisplayed()
	{
		System.out.println("Exterior Texture page is displayed");
	}

	@Given("User is on Exterior Textures Page")
	public void userIsOnExteriorTexturesPage()
	{
		System.out.println("User is on Exterior Textures Page");
	}

	@When("User clicks on the Exteriorproduct")
	public void userClicksOnTheExteriorProduct() 
	{
		System.out.println("User clicks on the Exteriorproduct");
		Browser.exteriorPgObj.exteriorProd();
	}

	@Then("Exterior Product page is displayed")
	public void exteriorProductPageIsDisplayed() 
	{
		System.out.println("Exterior Product page is displayed");
	}

	@Given("User is on Exterior Product Page")
	public void userIsOnExteriorProductPage()
	{
		System.out.println("");
	}
}
