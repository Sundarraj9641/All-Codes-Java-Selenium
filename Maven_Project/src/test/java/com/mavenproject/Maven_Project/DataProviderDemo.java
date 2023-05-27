package com.mavenproject.Maven_Project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	WebDriver driver;
	
	//data provider
	@DataProvider(name = "Sundarraj")
	
	
	//creating two dimensional array to store the credentials
	public static Object[][] credential(){  //credential -- is a method name
		return new Object[][] {
			{"Admin", "admin123"},  //user name and password
			{"admin", "admin143"},
			{"ADMIN", "admin134"},
			
		};
	}
	
	@DataProvider(name = "Prem")  //another data provider
	public static Object[][] credential2(){
		return new Object[][] {
			{"user", "Admin123"},
			{"User", "Admin143"},
			{"USER", "Admin134"},
			
		};
	}
	
	@Test(dataProvider="Sundarraj")  //select which data provider you want to execute 
	
	public void login_OrangeHrm(String username, String password) throws InterruptedException {
		//passing the parameter
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		WebElement username1 = driver.findElement(By.name("username"));

		username1.sendKeys(username);
		Thread.sleep(2000);
		//password
		WebElement password1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

		password1.sendKeys(password);

		//login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		login.click();
		
		driver.quit();
		
		
	}
	
}

