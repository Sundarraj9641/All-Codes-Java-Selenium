package com.asianpaints.coloursandtextures.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.asianpaints.coloursandtextures.pageObjects.Colours;
import com.asianpaints.coloursandtextures.pageObjects.Contractor;
import com.asianpaints.coloursandtextures.pageObjects.Exterior_Texture;
import com.asianpaints.coloursandtextures.pageObjects.Interior_Texture;
import com.asianpaints.coloursandtextures.pageObjects.Paint_Budget;
import com.asianpaints.coloursandtextures.pageObjects.Paint_Selector;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;



public class Browser {
	public static WebDriver driver;
	static ChromeOptions options;
	static Contractor conPgObj;
	static Colours colourPgObj;
	static Exterior_Texture exteriorPgObj;
	static Interior_Texture interiorPgObj;
	static Paint_Budget paintBudgetObj;
	static Paint_Selector paintSelectorgObj;
	
	@Before
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
//		conPgObj =PageFactory.initElements(driver,Contractor.class );
//		colourPgObj =PageFactory.initElements(driver,Colours.class );
//		exteriorPgObj =PageFactory.initElements(driver,Exterior_Texture.class );
//		interiorPgObj =PageFactory.initElements(driver,Interior_Texture.class );
//		paintBudgetObj =PageFactory.initElements(driver,Paint_Budget.class );
//		paintSelectorgObj =PageFactory.initElements(driver,Paint_Selector.class );
	}

	@Given("User is on Home Page")
	public void userIsOnHomePage() throws InterruptedException
	{
		System.out.println("User is on Home Page");
		driver = new ChromeDriver(options);
		conPgObj =PageFactory.initElements(driver,Contractor.class );
		colourPgObj =PageFactory.initElements(driver,Colours.class );
		exteriorPgObj =PageFactory.initElements(driver,Exterior_Texture.class );
		interiorPgObj =PageFactory.initElements(driver,Interior_Texture.class );
		paintBudgetObj =PageFactory.initElements(driver,Paint_Budget.class );
		paintSelectorgObj =PageFactory.initElements(driver,Paint_Selector.class );
		String url= "https://www.asianpaints.com/products/paints-and-textures.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(5000);
		colourPgObj.iUnderstand.click();
		Thread.sleep(1000);
	}

}

