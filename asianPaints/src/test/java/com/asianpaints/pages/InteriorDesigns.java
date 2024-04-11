package com.asianpaints.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class InteriorDesigns 
{
	static WebDriverWait wait;
	Actions act;
	@FindBy(xpath="//*[@id=\"headerNav\"]/div[1]/ul/li[5]/a[2]/span[1]")
	WebElement home;
	@FindBy(xpath="//*[@id=\"HOMEDECOR\"]/div[2]/div/div/div[4]/ul/li[1]/a")
	WebElement interiorDesign;
	@FindBy(xpath="//*[@id=\"enquire-name\"]")
	WebElement name;
	@FindBy(xpath="//*[@id=\"enquire-email\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"enquire-mobile\"]")
	WebElement mobile;
	@FindBy(xpath="//*[@id=\"enquire-pincode\"]")
	WebElement Pincode;
	@FindBy(xpath="//*[@id=\"pdp-request-call-back-form\"]/div[2]/div[2]/button")
	WebElement BookFreeSitevisit;
	
	private WebDriver driver;	
    public  InteriorDesigns(WebDriver driver)
    {
	  this.driver=driver; 
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
    public void interiorDesign() throws InterruptedException{		
		act.moveToElement(home).build().perform();
		interiorDesign.click();
		Thread.sleep(2000);	
    }
    public void enterName(String name1) throws InterruptedException{
//    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(name));
    	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
    	jsExecutor.executeScript("arguments[0].click();", name);
    	name.clear();
    	name.sendKeys(name1);
    	Thread.sleep(2000);
    }
    public void Email(String email) throws InterruptedException{
    	Email.clear();
    	Email.sendKeys(email);
    	Thread.sleep(2000);	
     }
    public void mobile(String Mobile) throws InterruptedException{
    	mobile.clear();
    	mobile.sendKeys(Mobile);
    	Thread.sleep(2000);
    }
     public void Pincode(String pincode) throws InterruptedException{
    	 Pincode.clear();
    	 Pincode.sendKeys(pincode);
         Thread.sleep(2000);
    }
     public void BookFreeSitevisit() throws InterruptedException{
    	 BookFreeSitevisit.click();
         Thread.sleep(2000);
     }        
}
