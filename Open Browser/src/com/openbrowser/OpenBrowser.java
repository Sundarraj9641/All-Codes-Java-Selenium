package com.openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Open Browser\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.asianpaints.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]/span")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"loginMobile\"]")).sendKeys("9876543212");
		
		driver.findElement(By.xpath("//*[@class=\"ctaText modal__variant-login--submit\"]")).click();
	}
}
