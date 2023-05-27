package com.demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShop {
	WebDriver driver;

	@BeforeTest
	public void launch_browser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demowebshop.tricentis.com/");
	}
	/*
	@Test(priority=1)
	public void register() throws InterruptedException {
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.linkText("Register"));

		WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		gender.click();

		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		first_name.sendKeys("Sundar");

		WebElement last_name = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		last_name.sendKeys("Raj");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.sendKeys("sundarraj78965@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.sendKeys("Sundarraj@1234");
		
		WebElement con_password = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		con_password.sendKeys("Sundarraj@1234");
		
		WebElement register_button = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
		register_button.click();
	} */


	@Test(priority=2, enabled=true)
	public void login_valid_credentials() {

		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		Email.sendKeys("sundarraj54321@gmail.com");

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		Password.sendKeys("Sundarraj@12345");

		WebElement LogInButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		LogInButton.click();
	}

	@Test(priority=3, enabled = true)
	public void search_order() {
		WebElement search_store = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		search_store.sendKeys("computer");
		
		WebElement Search_button = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		Search_button.click();
		
		WebElement click_item = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/h2/a"));
		click_item.click();
		
		
	}
	
	@Test(priority=4, enabled=true)
	public void add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		WebElement processor = driver.findElement(By.xpath("//*[@id=\"product_attribute_72_5_18_65\"]"));
		processor.click();
		
		WebElement ram = driver.findElement(By.xpath("//*[@id=\"product_attribute_72_6_19_91\"]"));
		ram.click();
		
		WebElement hdd = driver.findElement(By.xpath("//*[@id=\"product_attribute_72_3_20_58\"]"));
		hdd.click();
		
		WebElement software = driver.findElement(By.xpath("//*[@id=\"product_attribute_72_8_30_94\"]"));
		software.click();
		
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"addtocart_72_EnteredQuantity\"]"));
		quantity.clear();
		quantity.sendKeys("2");
		
		WebElement add_button = driver.findElement(By.id("add-to-cart-button-72"));
		add_button.click();
			
		
	}
	@Test(priority=5, enabled=true)
	public void order() throws InterruptedException {
		WebElement shopping_cart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
		shopping_cart.click();
		
		WebElement select_pro = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input"));
		select_pro.click();
		
		WebElement country = driver.findElement(By.name("CountryId"));
		country.click();
		
	    Select s1 = new Select(country);
	    s1.selectByVisibleText("India");
	    
	    WebElement zipcode = driver.findElement(By.id("ZipPostalCode"));
	    zipcode.sendKeys("643401");
	    
	    WebElement estimate = driver.findElement(By.name("estimateshipping"));
	    estimate.click();
	    
	    WebElement checkbox = driver.findElement(By.name("termsofservice"));
	    checkbox.click();
	    
	    WebElement check_out = driver.findElement(By.name("checkout"));
	    check_out.click();
	    
	    //billing address
	    WebElement country_billing = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]"));
	    country_billing.click();
	    
	    Thread.sleep(2000);
	    Select s2 = new Select(country_billing);
	    s2.selectByVisibleText("India");
	    
	    Thread.sleep(2000);
	    WebElement city = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
	    city.sendKeys("Chennai");
	    
	    WebElement add1 = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
	    add1.sendKeys("Sipcot IT park, Siruseri");
	    
	    WebElement zipcode_bill = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]"));
	    zipcode_bill.sendKeys("643401");
	    
	    WebElement phone = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]"));
	    phone.sendKeys("9876543212");
	    
	    WebElement continue_billing = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
	    continue_billing.click();
	    
	    Thread.sleep(2000);
	    //shipping address
	    WebElement continue_shipping = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
	    continue_shipping.click();
	    
	    Thread.sleep(2000);
	    //shipping method
	    WebElement next_air = driver.findElement(By.name("shippingoption"));
	    next_air.click();
	    
	    WebElement continue_method = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
	    continue_method.click();
	    
	    Thread.sleep(2000);
	    //payment method
	    WebElement cod = driver.findElement(By.xpath("//*[@id=\"paymentmethod_0\"]"));
	    cod.click();
	    
	    WebElement continue_payment = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
	    continue_payment.click();
	    
	    Thread.sleep(2000);
	    //payment information
	    WebElement info = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
	    info.click();
	    
	    Thread.sleep(2000);
	    //confirm order
	    WebElement confirm = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
	    confirm.click();
	    
	    Thread.sleep(2000);
	    //view order details
	    WebElement view = driver.findElement(By.linkText("Click here for order details."));
	   
	    
	    
		
		
	}

}
