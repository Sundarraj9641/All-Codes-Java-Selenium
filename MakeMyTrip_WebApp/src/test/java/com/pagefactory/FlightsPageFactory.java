package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPageFactory {

	WebDriver driver;
	static WebDriverWait wait;
	
	//One Way
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]/span")
	WebElement oneway_button;

	@FindBy(how=How.ID, using="fromCity")
	WebElement from;

	@FindBy(how=How.XPATH, using="//*[@id=\"react-autowhatever-1-section-1-item-1\"]")
	WebElement from_city;

	@FindBy(how=How.ID, using="toCity")
	WebElement to;

	@FindBy(how=How.XPATH, using="//*[@id=\"react-autowhatever-1-section-1-item-0\"]")
	WebElement to_city;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]")
	WebElement date;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")
	WebElement traveller_class;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[2]")
	WebElement adult;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/ul[2]/li[2]")
	WebElement travelling_class;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[2]/button")
	WebElement apply_button;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	WebElement search_button;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p")
	WebElement text_about_available_fights;
	
	//-------------------------------------------------------------------------------------------------------------------
	
	//Round Trip
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")
	WebElement roundTrip_button;

	@FindBy(how=How.ID, using="fromCity")
	WebElement from_roundtrip;

	@FindBy(how=How.XPATH, using="//*[@id=\"react-autowhatever-1-section-0-item-5\"]")
	WebElement from_city_roundTrip;

	@FindBy(how=How.ID, using="toCity")
	WebElement to_roundtrip;

	@FindBy(how=How.XPATH, using="//*[@id=\"react-autowhatever-1-section-1-item-7\"]")
	WebElement to_city_roundtrip;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]")
	WebElement to_date_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[4]")
	WebElement return_date_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")
	WebElement traveller_class_roundtrip;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[4]")
	WebElement adult_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/div/div[1]/ul/li[2]")
	WebElement child_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/ul[2]/li[4]")
	WebElement travelling_class_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[2]/button")
	WebElement apply_button_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	WebElement search_button_roundtrip;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p")
	WebElement text_about_available_fights_roundTrip;
	

	//----------------------------------------------------------------------------------------------
	
	//One Way
	public FlightsPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void oneWay() {
		if(!oneway_button.isSelected()) {
			oneway_button.click();
		}
	}

	public void from() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(from));
		from.click();
		wait.until(ExpectedConditions.elementToBeClickable(from_city));
		from_city.click();
	}

	public void to() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(to));
		to.click();
		wait.until(ExpectedConditions.elementToBeClickable(to_city));
		to_city.click();
	}

	public void date() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();

	}
	public void travellerClass() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(traveller_class));
		traveller_class.click();

	}
	
	public void adult() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(adult));
		adult.click();

	}
	
	public void travellingClass() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travelling_class));
		travelling_class.click();

	}
	
	public void applyButton() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(apply_button));
		apply_button.click();

	}
	
	public void searchButton() {
//		wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(search_button));
		search_button.click();

	}
	
	public void availableFlights() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(text_about_available_fights));
		String Available_flights = text_about_available_fights.getText();
		System.out.println(Available_flights);
		driver.quit();

	}
	
	//-------------------------------------------------------------------------------------------
	
	
	//Round Trip
	public void roundTrip() {
		if(!roundTrip_button.isSelected()) {
			roundTrip_button.click();
		}
	}

	public void roundTrip_from() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(from_roundtrip));
		from_roundtrip.click();
		wait.until(ExpectedConditions.elementToBeClickable(from_city_roundTrip));
		from_city_roundTrip.click();
	}

	public void roundTrip_to() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(to_roundtrip));
		to_roundtrip.click();
		wait.until(ExpectedConditions.elementToBeClickable(to_city_roundtrip));
		to_city_roundtrip.click();
	}

	public void roundTrip_to_date() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(to_date_roundtrip));
		to_date_roundtrip.click();

	}
	
	public void roundTrip_return_date() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(return_date_roundtrip));
		return_date_roundtrip.click();

	}
	public void roundTrip_travellerClass() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travelling_class_roundtrip));
		travelling_class_roundtrip.click();

	}
	
	public void roundTrip_adult() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(adult_roundtrip));
		adult_roundtrip.click();

	}
	
	public void roundTrip_child() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(child_roundtrip));
		child_roundtrip.click();

	}
	
	
	public void roundTrip_travellingClass() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travelling_class_roundtrip));
		travelling_class_roundtrip.click();

	}
	
	public void roundTrip_applyButton() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		apply_button_roundtrip.click();

	}
	
	public void roundTrip_searchButton() {
//		wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(search_button));
		search_button_roundtrip.click();

	}
	
	public void roundTrip_availableFlights() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(text_about_available_fights_roundTrip));
		String Available_flights_RoundTrip = text_about_available_fights_roundTrip.getText();
		System.out.println(Available_flights_RoundTrip);
		driver.quit();

	}
	
	//---------------------------------------------------------------------------------------------------

}
