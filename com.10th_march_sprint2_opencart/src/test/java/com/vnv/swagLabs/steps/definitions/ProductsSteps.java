package com.vnv.swagLabs.steps.definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;

import com.vnv.swagLabs.runner.pages.ProductsPage;

public class ProductsSteps {

    public static ProductsPage products = new ProductsPage();

    @Then("User should navigate to the Products page of SwagLabs application")
    public void userShouldNavigateToThePageOfSwagLabsApplication() {
       // Assert.assertTrue(products.verifyPage(), "User doesn't navigate to products page");
    }


}
