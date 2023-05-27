package com.step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MakeMyTrip {
	WebDriver driver;
	ChromeOptions options;
	
	@Before
	public void open_browser() {
		
		System.out.println("Welcome to Make My Trip");
		
		String userProfile ="C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome\\User Data";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\make_my_trip\\Driver\\chromedriver.exe");

		options = new ChromeOptions();
        options.addArguments("--user-data-dir="+userProfile);
        options.addArguments("--profile-directory=Default");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("User in the Home Page");
	}

	@When("user enters all valid data")
	public void user_enters_all_valid_data() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement login_button = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]"));
	    login_button.click();
	    
	    //sagarprem217@gmail.com
	    //dopevey970@cutefier.com
	    //zacibuto@socam.me
	    Thread.sleep(2000);
	    WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	    username.sendKeys("zacibuto@socam.me");
	    
	    Thread.sleep(3000);
	    WebElement continue_button = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button"));
	    continue_button.click();
	    
	    //Premchinnu@2205
	    //Sundarraj@1234
	    //Sundar@1234
	    Thread.sleep(2000);
	    WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	    password.sendKeys("Sundar@1234");
	    
	    Thread.sleep(2000);
	    WebElement login_button1 = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button"));
	    login_button1.click();
	    
	    Thread.sleep(2000);
	    WebElement add_mobile = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/div[1]/div/span"));
	    if(add_mobile.isDisplayed()) {
	    	add_mobile.click();
	    }
	}

	@Then("navigate to booking page")
	public void navigate_to_booking_page() {
		String title1 = driver.getTitle();
		System.out.println(title1);
		//driver.close();
	}
}
