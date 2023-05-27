package com.vnv.swagLabs.runner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vnv.swagLabs.runner.utils.SetupDriver;

public class LoginPage {

    WebDriver driver = SetupDriver.chromeDriver();
   // =================================
// // swaglabs
//    public static final By USERNAME = By.id("user-name");
//    public static final By PASSWORD = By.id("password");
//    public static final By LOGIN_BUTTON = By.id("login-button");
  //  ========================
    
    // rediff 
    
    public static final By USERNAME = By.id("login1");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.name("proceed");
//==========================
    
    //freecrm
//    public static final  By LOGIN_LINK=By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a");
//    public static final By USERNAME = By.name("email");
//  public static final By PASSWORD = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input");
//  public static final By LOGIN_BUTTON = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
    
  
  public void launchApplication() throws Exception {
      //  driver.get("https://www.saucedemo.com/");
        
        	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	//driver.get("https://freecrm.in/");
    	Thread.sleep(3000);
    }

    public void enterInput(String field, String input) throws Exception {
    //	driver.findElement(LOGIN_LINK).click();// freecrm
    	Thread.sleep(5000);
        switch (field) {
            case "UserName":
                driver.findElement(USERNAME).sendKeys(input);
                break;
            case "Password":
                driver.findElement(PASSWORD).sendKeys(input);
                break;
            default:
               System.out.println("Unexpected value: " + field);
        }
    }

    public void clickButton(String button){
        if(button.equals("Login")) {
            driver.findElement(LOGIN_BUTTON).click();
        }
       
      
    }


}
