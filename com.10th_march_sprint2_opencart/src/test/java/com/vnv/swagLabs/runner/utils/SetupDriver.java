package com.vnv.swagLabs.runner.utils;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupDriver {

    public static WebDriver driver;

    public static WebDriver chromeDriver() {
    	 System.out.println("Launching Chrome Browser");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
       
        return driver;
    }

    public static WebDriver edgeDriver() {
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Launching Edge Browser");
        return driver;
    }

    public static void teardown() throws Exception {
    	System.out.println("i m in teardown");
    	Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
