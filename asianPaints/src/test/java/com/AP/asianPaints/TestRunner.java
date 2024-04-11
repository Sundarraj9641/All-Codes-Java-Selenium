package com.AP.asianPaints;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
				 glue={"com.asianpaints.steps"}, 
				 tags="@tag1",
				 plugin={"pretty","html:target/cucumber-report3.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
