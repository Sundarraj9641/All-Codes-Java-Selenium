package com.asianpaints.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	Actions act1;
    @FindBy(xpath="//a[@class='iconLinks iconLinks__profile profile-js-handle']")
    WebElement login;
    @FindBy(xpath="//input[@name='MOBILE_NUMBER']")
    WebElement mobNo;    
    @FindBy(xpath="//button[@class='ctaText modal__variant-login--submit']")
    WebElement submit;
    @FindBy(how=How.ID,using="loginOtp")
    WebElement otp;
    @FindBy(xpath="//button[@class='ctaText validate-login  modal__variant-login--submit']")
    WebElement logIn;
    @FindBy(xpath = "//*[@id=\"__st_fancy_popup\"]/iframe")
    WebElement frame1;
    @FindBy(xpath = "//input[@id='__st_bpn_no']")
    WebElement popupOne;
    @FindBy(xpath = "//*[@id=\"preview-notification-frame\"]")
    WebElement frame2;
    @FindBy(xpath = "//*[@id=\"NC_CLOSE_ICON\"]")
    WebElement popupTwo;  
    
    
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        act1=new Actions(driver);
    }
   
    public void loginButton() throws InterruptedException  
    {           
    	Thread.sleep(2000);
        act1.moveToElement(login).click().build().perform();
        Thread.sleep(2000);
        //Thread.sleep(1000);
        driver.switchTo().frame(frame2);
        Thread.sleep(1000);
        act1.moveToElement(popupTwo).click().build().perform();
        driver.switchTo().defaultContent();
    }
      public void enterMobile(String string) throws InterruptedException
      {    
    	  Thread.sleep(2000);
          act1.moveToElement(mobNo).click().sendKeys(string);
          Thread.sleep(2000);
          driver.switchTo().frame(frame1);
          Thread.sleep(1000);
          act1.moveToElement(popupOne).click().build().perform();
          driver.switchTo().defaultContent();

      }
      public void submitButton() throws InterruptedException
      {    
          act1.moveToElement(submit).click().build().perform();
          Thread.sleep(2000);
      }
      public void submitButton2() throws InterruptedException
      {
          act1.moveToElement(otp).click().build().perform();
          Thread.sleep(10000);
          act1.moveToElement(logIn).click().build().perform();
          Thread.sleep(3000);
      }
}
