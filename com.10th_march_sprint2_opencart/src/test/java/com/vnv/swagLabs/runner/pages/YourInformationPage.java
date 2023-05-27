package com.vnv.swagLabs.runner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vnv.swagLabs.runner.utils.SetupDriver;

public class YourInformationPage {

    WebDriver driver = SetupDriver.driver;

    public static final String PAGE_HEADER = "CHECKOUT: YOUR INFORMATION";

    public static final By PAGE_HEADER_XPATH = By.xpath("//span[@class='title']");
    //input[@name='firstName']
    //input[@name='lastName']
    //input[@name='postalCode']

    //input[@id='continue']


}
