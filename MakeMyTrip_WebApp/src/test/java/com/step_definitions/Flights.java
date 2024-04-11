package com.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.driversetup.SetUpDriver;
import com.pagefactory.FlightsPageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flights {
	
	WebDriver driver;
    FlightsPageFactory fpg;
    
    //one way
	@Given("user is on the flight booking page")
	public void user_is_on_the_flight_booking_page() {
		driver=SetUpDriver.chromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\MakeMyTrip_WebApp\\src\\test\\resources\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	
	}

	@When("user click on one way button")
	public void user_click_on_one_way_button() {
	   fpg= new FlightsPageFactory(driver);
	   fpg=PageFactory.initElements(driver, FlightsPageFactory.class);
	   fpg.oneWay();
	}

	@When("user select the from city")
	public void user_enter_the_from_city() {
	    fpg.from();
	}

	@When("user select the to city")
	public void user_enter_the_to_city() {
	    fpg.to();
	}

	@When("user select the date of traveling")
	public void user_select_the_date_of_traveling() {
	    fpg.date();
	    
	}

	@When("user enter the details of passengers")
	public void user_enter_the_details_of_passengers() {
		fpg.travellerClass();
		fpg.adult();
		fpg.travellingClass();
		fpg.applyButton();
	}

	@And("click on search")
	public void click_on_search() throws InterruptedException {
	    fpg.searchButton();
//	    Thread.sleep(6000);
//	    driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:11d41cde-d072-4468-b60d-2d1070c6d0e6:8_0\"]")).click();
	}

	@Then("user is able to see the available flights")
	public void user_is_able_to_see_the_available_flights() {
	    fpg.availableFlights();
	    
	}
	
	//------------------------------------------------------------------------------------------------------
	
	//Round Trip
	@Given("user is on the flight booking page in roundTrip")
	public void user_is_on_the_flight_booking_page_roundTrip() {
		driver=SetUpDriver.chromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\MakeMyTrip_WebApp\\src\\test\\resources\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	
	}

	@When("user click on Round trip button in roundTrip")
	public void user_click_on_round_trip_button_roundTrip() {
	   fpg= new FlightsPageFactory(driver);
	   fpg=PageFactory.initElements(driver, FlightsPageFactory.class);
	   fpg.roundTrip();
	}

	@When("user select the from city in roundTrip")
	public void user_enter_the_from_city_roundTrip() {
	    fpg.roundTrip_from();
	}

	@When("user select the to city in roundTrip")
	public void user_enter_the_to_city_roundTrip() {
	    fpg.roundTrip_to();
	}

	@When("user select the date of traveling in roundTrip")
	public void user_select_the_date_of_traveling_roundTrip() {
	    fpg.roundTrip_to_date();
	    fpg.roundTrip_return_date();
	    
	}

	@When("user enter the details of passengers in roundTrip")
	public void user_enter_the_details_of_passengers_roundTrip() {
		fpg.roundTrip_travellerClass();
		fpg.roundTrip_adult();
		fpg.roundTrip_child();
		fpg.roundTrip_travellingClass();
		fpg.roundTrip_applyButton();
	}

	@And("click on search in roundTrip")
	public void click_on_search_roundTrip() throws InterruptedException {
	    fpg.roundTrip_searchButton();
	    
	}

	@Then("user is able to see the available flights in roundTrip")
	public void user_is_able_to_see_the_available_flights_roundTrip() {
	    fpg.roundTrip_availableFlights();
	}
	
	//------------------------------------------------------------------------------------------------

}
