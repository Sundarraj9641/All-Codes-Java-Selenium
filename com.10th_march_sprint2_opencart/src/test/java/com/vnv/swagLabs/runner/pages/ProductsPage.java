package com.vnv.swagLabs.runner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vnv.swagLabs.runner.utils.SetupDriver;

public class ProductsPage {

    WebDriver driver = SetupDriver.driver;

    public static final String PAGE_HEADER = "PRODUCTS";
    public static final String PRODUCTS_LIST = "//div[@class='inventory_item_name' and text()='";

   // public static final By PAGE_HEADER_XPATH = By.xpath("//span[@class='title']");
    public static final By BUTTON_ADD_TO_CART = By.xpath("//button[text()='Add to cart']");
    public static final By ICON_SHOPPING_CART = By.xpath("//div[@class='shopping_cart_container']/a");


//    public boolean verifyPage() {
//        return driver.findElement(PAGE_HEADER_XPATH).getText().equals(PAGE_HEADER);
//    }

    public void selectProduct(String product) {
        driver.findElement(By.xpath(PRODUCTS_LIST + product + "']"));
    }

     public void clickButton(String button) {
          switch (button) {
               case "Add to cart":
                    driver.findElement(BUTTON_ADD_TO_CART).click();
                    break;
               case "Shopping Cart":
                    driver.findElement(ICON_SHOPPING_CART).click();
                    break;
               default:
                    System.out.println("Unexpected value: " + button);
          }
     }


}
