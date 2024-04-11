package com.asianpaints.coloursandtextures.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;

import com.asianpaints.coloursandtextures.pageObjects.Colours;
import com.asianpaints.coloursandtextures.pageObjects.Contractor;
import com.asianpaints.coloursandtextures.pageObjects.Exterior_Texture;
import com.asianpaints.coloursandtextures.pageObjects.Interior_Texture;
import com.asianpaints.coloursandtextures.pageObjects.Paint_Budget;
import com.asianpaints.coloursandtextures.pageObjects.Paint_Selector;

public class Colour2200
{
	public static WebDriver driver;
	public static Contractor conPgObj;
	public static Colours colourPgObj;
	public static Exterior_Texture exteriorPgObj;
	public static Interior_Texture interiorPgObj;
	public static Paint_Budget paintBudgetObj;
	public static Paint_Selector paintSelectorgObj;

	@When("User hovers over Paints and Texture Tab")
	public void userHoversOverPaintsAndTextureTab() throws InterruptedException 
	{
		System.out.println("User hovers over Paints and Texture Tab");
		Actions action=new Actions(Browser.driver);
		action.moveToElement(Browser.colourPgObj.getPaintAndTextureWE()).perform();
		Thread.sleep(3000);
	}

	@Then("Paints and Texture Drop down is displayed")
	public void paintsAndTextureDropdownIsDisplayed() 
	{
		System.out.println("Paints and Texture Drop down is displayed");
	}

	@Given("User is on Paints and Texture Drop Down List")
	public void userIsOnPaintsAndTextureDropDownList() 
	{
		System.out.println("User is on Paints and Texture Drop Down List");
	}

	@When("User clicks Colours tab")
	public void userClicksColoursTab() throws InterruptedException 
	{
		System.out.println("User clicks 2200 Colours tab");
		Browser.colourPgObj.colour_2200();
		Thread.sleep(1000);
	}

	@Then("Colour page is displayed")
	public void colourPageIsDisplayed() {
		System.out.println(" Colour page is displayed");
	}

	@Given("User is on Colours Page")
	public void userIsOnColoursPage()
	{
		System.out.println("User is on {int} Colours Page");
	}

	@When("User clicks Enquire Now  tab")
	public void userClicksEnquireNowTab()
	{
		System.out.println("User clicks Enquire Now  tab");
		Browser.colourPgObj.enquireNowButton();
	}

	@Then("Enquire Now form is displayed")
	public void enquireNowformIsDisplayed()
	{
		System.out.println("Enquire Now form is displayed");
	}

	@Given("User is on Enquire Now form")
	public void userIsOnEnquireNowform() 
	{
		System.out.println("User is on Enquire Now form");
	}

	@When("User enters Name (.+)")
	public void userEntersName(String name) throws InterruptedException 
	{
		System.out.println("User enters Name");
		Browser.colourPgObj.enterName(name);
		Thread.sleep(2000);
	}

	@When("User enters Email (.+)")
	public void userEntersEmailID(String emailid)throws InterruptedException 
	{
		System.out.println("User enters Email ID");
		Browser.colourPgObj.enterEmail(emailid);
		Thread.sleep(2000);
	}

	@When("User enters Mobilenumber (.+)")
	public void userEntersMobileNumber(String mobilenum)throws InterruptedException 
	{
		System.out.println("User enters Mobile Number");
		Browser.colourPgObj.enterMobile(mobilenum);
		Thread.sleep(2000);
	}

	@When("User enters Pincode (.+)")
	public void userEntersPincode(String pincode)throws InterruptedException 
	{
		System.out.println("User enters Pincode");
		Browser.colourPgObj.enterPincode(pincode);
		Thread.sleep(2000);
	}

	@When("User clicks on Enquire Tab")
	public void userClicksOnEnquireTab()throws InterruptedException 
	{
		System.out.println("User clicks on Enquire Tab");
		Browser.colourPgObj.paintEnquireButton();
		Thread.sleep(2000);
	}

	@Then("Succesful Completion page is displayed")
	public void succesfulCompletionPageIsDisplayed() throws InterruptedException
	{
		System.out.println("Succesful Completion page is displayed");
		Thread.sleep(3000);
		Browser.colourPgObj.colourClear();
	}

	@Then("Unsuccesful Error Message is displayed")
	public void unsuccesfulErrorMessageIsDisplayed() 
	{
		System.out.println("Unsuccesful Error Message is displayed");
		System.out.println(Browser.colourPgObj.colourNameErrorMsg());
		System.out.println(Browser.colourPgObj.colourEmailErrorMsg());
		System.out.println(Browser.colourPgObj.colourMobileErrorMsg());
		System.out.println(Browser.colourPgObj.colourPinErrorMsg());
		boolean isEnquireNameDisplayed = Browser.colourPgObj.colourNameErrorMsg.isDisplayed();
		assertTrue(isEnquireNameDisplayed);
		boolean isEnquireEmailDisplayed = Browser.colourPgObj.colourEmailErrorMsg.isDisplayed();
		assertTrue(isEnquireEmailDisplayed);
		boolean isEnquireMobileDisplayed = Browser.colourPgObj.colourMobileErrorMsg.isDisplayed();
		assertTrue(isEnquireMobileDisplayed);
		boolean isEnquirePinCodeDisplayed = Browser.colourPgObj.colourpinErrorMsg.isDisplayed();
		assertTrue(isEnquirePinCodeDisplayed);
		Browser.colourPgObj.colourClear();	
	}

	@When("User clicks on the Colours product")
	public void userClicksOnTheColoursProduct() 
	{
		System.out.println("User clicks on the  Colours product");
	}

	@Then("Colours Product page is displayed")
	public void coloursProductPageIsDisplayed()
	{
		System.out.println(" Colours Product page is displayed");
	}
	@Given("User is on Colours Product Page")
	public void userIsOnColoursProductPage() 
	{
		System.out.println("");
	}

	@Then("Close the Browser")
	public void closeTheBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		Browser.driver.close();
	}
}
