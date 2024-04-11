package com.cucumber2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magicbrics {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.magicbricks.com/pg-home/home");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='m-close']")).click();
		String str = driver.findElement(By.xpath("//*[@id=\"slide_pg-location\"]/div[2]/div[1]")).getText();
		System.out.println(str);
	}

}
