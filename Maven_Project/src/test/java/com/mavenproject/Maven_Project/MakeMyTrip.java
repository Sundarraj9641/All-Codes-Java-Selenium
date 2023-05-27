package com.mavenproject.Maven_Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeMyTrip {
	
	WebDriver driver;
	
	@BeforeTest
	public void open_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sagarprem217@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
		Set<String> win = driver.getWindowHandles();
		
		Iterator<String> it = win.iterator();
		
		String main= it.next();
		String child = it.next();
		
		System.out.println("Windows : " + win.size());
        driver.findElement(By.id("password")).sendKeys("Premchinnu@2205");//Premchinnu@2205
                       Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
                       Thread.sleep(1000);
//     driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/div[1]/div/span")).click();
//                    Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void my_profile() {
		
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div[1]/p"));
		Actions a = new Actions(driver);
		a.moveToElement(profile).build().perform(); 
	}
}