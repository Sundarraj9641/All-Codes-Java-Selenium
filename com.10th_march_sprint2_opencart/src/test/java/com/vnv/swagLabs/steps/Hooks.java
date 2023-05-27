package com.vnv.swagLabs.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before(order=0)
    public static void launch(Scenario scenario) {
    	 System.out.println("====start of Scenario=======");
        System.out.println("Scenario: =====>" +scenario.getName());
    }

    @After(order=0)
    public static void teardown(Scenario scenario) {
        System.out.println("Status:==== " +scenario.getStatus());
        System.out.println("====End of Scenario=====");
    }
   
}
