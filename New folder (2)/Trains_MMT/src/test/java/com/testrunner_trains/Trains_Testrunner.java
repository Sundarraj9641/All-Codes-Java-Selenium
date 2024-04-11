package com.testrunner_trains;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features ="src\\test\\resources\\Features", //path of the feature file
		glue= {"com.step_definition_trains"},	//package name of step definition file
		tags = "@Tag1",  //tags want to run
		//tags = {"@Round_trip ,@Invalid_FromStation,@Invalid_Infants,@Student_Fare,@FLights_Not_Found,@Armed_Forces,@Student_Fare"}
		plugin = {"pretty","html:target/CucumberReports/CucumberReport.html"}
		)

public class Trains_Testrunner extends AbstractTestNGCucumberTests {

}
