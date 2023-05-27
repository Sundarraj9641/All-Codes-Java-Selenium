package com.vnv.swagLabs.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import com.vnv.swagLabs.runner.utils.SetupDriver;

@CucumberOptions(
		strict = true, 
      features = {"src/test/resources/swagLabs"}, 
    		  plugin = {"json:target/cucumber.json", 
    					"html:target", 
    					//"junit:target/Cucumber.xml",
    					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    					},
      glue = {"com.vnv.swagLabs.steps"},
    monochrome = true,
    tags = {"@Login"}
	  // tags = {"@checkout"}
	 //   tags = {"@Products_SwagLabs"}
		)




public class SwagLabsRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)

	public Object[][] scenarios() {
		return super.scenarios();
	}

	@AfterSuite
	public void teardown() throws Exception {
		SetupDriver.teardown();
		
	}
}
