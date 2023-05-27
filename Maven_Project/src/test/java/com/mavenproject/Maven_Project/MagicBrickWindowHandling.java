package com.mavenproject.Maven_Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class MagicBrickWindowHandling {
	WebDriver driver;

	@BeforeTest
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.magicbricks.com/");
	}
	
	@Test
	public void magicbrick() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement rent = driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(rent).build().perform();
		driver.findElement(By.linkText("Owner Properties")).click();
		
		Thread.sleep(2000);
		String title_1=driver.getTitle();
		System.out.println("Title :" + title_1 );
		
		
		Set<String> window = driver.getWindowHandles();
		
		List<String> win = new ArrayList<String>(window);
		
		//Iterator<String> it = window.iterator();
		System.out.println("Number of Windows : " + window.size());
	
		String main_page = win.get(0);
		String owner_prop = win.get(1);

		driver.switchTo().window(main_page);
		
		
		
		
		
		Thread.sleep(2000);
		WebElement sell = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/a"));
		Actions a = new Actions(driver);
		a.moveToElement(sell).build().perform();
		
		
		driver.findElement(By.linkText("My Dashboard")).click();
		Thread.sleep(4000);
		
		
	
		
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"emailOrMobile\"]"));
		String dash =driver.getWindowHandle();
		driver.switchTo().window(dash);
		email.sendKeys("sundarraj1234@gmail.com");
		
		
		
		
		

	}

}
