package com.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driversetup.SetUpDriver;
import com.pagefactory.LoginPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	LoginPageFactory lpf;
	
	@Given("user is on login page")
	public void user_is_on_the_Login_Page() throws InterruptedException {
		driver=SetUpDriver.chromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		lpf=new LoginPageFactory(driver);
		lpf=PageFactory.initElements(driver, LoginPageFactory.class);
		lpf.loginButton();
		lpf.email("zacibuto@socam.me");
		lpf.continue_button();
		lpf.password("Sundar@1234");
	    
	}

	@When("user Enter the Valid Details")
	public void user_Enter_the_Valid_Details() {
		System.out.println("Hello World");
	}

	@When("click on continue")
	public void click_on_continue() {
		System.out.println("Hello World");
	}

	@Then("navigate to the Home Page of the Application")
	public void navigate_to_the_Home_Page_of_the_Application() {
		System.out.println("Hello World");
		
	}

}
