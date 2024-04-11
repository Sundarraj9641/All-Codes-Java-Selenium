package com.asianpaints.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseStep 
{
	public static WebDriver driver;
	public static ChromeOptions options;
	public static void setupDriver()
	{
			String userProfile = "C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome";
	        System.out.println("Launching Chrome Browser"); 
	       System.setProperty("Webdriver.chrome.driver","C:\\Users\\SUMAHALI\\eclipse-workspace\\asianPaints\\Driver\\chromedriver.exe");	 
	        options = new ChromeOptions();
	        options.addArguments("--user-data-dir="+userProfile);
	        options.addArguments("--profile-directory=Default");
	        options.addArguments("--start-maximized");
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("--disable-notifications");
	        driver = new ChromeDriver(options);
	        driver.get("https://www.asianpaints.com/");
	        driver.manage().window().maximize();
	        
	    }

}
