package com.asianpaints.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class ViewStore
{
	Actions act;
	@FindBy(xpath="//a[@data-target='#HOMEDECOR']")
	WebElement homeDecor;
	@FindBy(xpath="//a[@href='https://www.asianpaints.com/home-decor/bath.html']")
	WebElement web;
	@FindBy(xpath="//p[@id='Ahmedabad']")
	WebElement city;
	@FindBy(xpath="//*[@id=\"citystore-js\"]/div/div/div/div[2]/div/a")
	WebElement viewStore;
	
	private WebDriver driver;
	public  ViewStore(WebDriver driver){
		
		  this.driver=driver; 
			PageFactory.initElements(driver,this);
			act=new Actions(driver);
	}
	public void HomeDecor() throws InterruptedException{		
		act.moveToElement(homeDecor).perform();
		Thread.sleep(2000);	
	}
	public void Web() throws InterruptedException{
		act.moveToElement(web).perform();
		web.click();
		Thread.sleep(2000);	
	}
	public void City() throws InterruptedException{
		city.click();
		Thread.sleep(5000);
	}
	public void viewStore() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)", "");
		viewStore.click();
		Thread.sleep(5000);
	}
}
