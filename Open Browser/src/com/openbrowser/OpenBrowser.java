package com.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Open Browser\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chromedriver.chromium.org/downloads");

	}

}
