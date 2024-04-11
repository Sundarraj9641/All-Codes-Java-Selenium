package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageFactory {
	
	WebDriver driver;
	static WebDriverWait wait;
	@FindBy(how=How.XPATH, using="//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")
	WebElement Login_Button;
	
	@FindBy(how=How.NAME, using="username")
	WebElement Email;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")
	WebElement Continue_Button;
	
	@FindBy(how=How.NAME, using="password")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")
	WebElement Log_In_Button;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/div[1]/div/span")
	WebElement Cross_button;
	
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginButton() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Login_Button));
		Login_Button.click();
	}
	
	public void email(String email) {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Email));
		Email.sendKeys(email);
	}
	
	public void continue_button() {
		wait.until(ExpectedConditions.elementToBeClickable(Continue_Button));
		Continue_Button.click();
	}
	
	public void password(String pwd) {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Password));
		Password.sendKeys(pwd);
	}
	
	public void login_Button() {
		Log_In_Button.click();
	}
	
	public void cross_Button() {
		if(Cross_button.isDisplayed()) {
		Cross_button.click();
		}
	}
	

	

}
