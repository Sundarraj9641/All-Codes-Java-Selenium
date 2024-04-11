package com.pagefactory_trains;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trains_pagefactory {
	WebDriver driver;
	static WebDriverWait wait;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/div/a/span[1]")
	WebElement train;
	
	public Trains_pagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Trains() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(train));
		train.click();
	}

}