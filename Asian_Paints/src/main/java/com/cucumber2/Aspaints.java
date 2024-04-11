package com.cucumber2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Aspaints {
	public static WebDriver driver;
	static ChromeOptions options;

	public static void main(String[] args) throws Exception {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","c://driver/chromedriver.exe");
		// driver=new ChromeDriver();
		options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		String url= "https://www.asianpaints.com/products/wall-coverings.html";


		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div[1]/div/button")).click();
		String url99="//a[@href='https://www.asianpaints.com/products/wall-coverings/designer-collection.html']";
		String text="SEE MORE";

		WebElement see_more=driver.findElement(By.partialLinkText(text));
		Actions act=new Actions(driver);
		act.moveToElement(see_more).build().perform();
		act.click(see_more).build().perform();
		
		//act.click().build().perform();
		Thread.sleep(3000);
		String dtr = driver.getCurrentUrl();
		System.out.println(dtr);
		
		
		
		
		
		

	}
}
