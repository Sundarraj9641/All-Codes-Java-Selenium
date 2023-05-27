package com.vnv.swagLabs.runner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vnv.swagLabs.runner.utils.SetupDriver;

public class YourCartPage {

    WebDriver driver = SetupDriver.driver;

    public static final String PAGE_HEADER = "YOUR CART";

    public static final By PAGE_HEADER_XPATH = By.xpath("//span[@class='title']");
    public static final By PRODUCTS_NAME = By.xpath("//div[@class='inventory_item_name']");
    public static final By BUTTON_CHECKOUT = By.xpath("//button[@id='checkout']");


    public boolean verifyPage() {
        return driver.findElement(PAGE_HEADER_XPATH).getText().equals(PAGE_HEADER);
    }


}
