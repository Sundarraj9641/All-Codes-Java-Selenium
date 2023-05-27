package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		plugin = {"json:target/cucumber.json"},
		features = "Feature"//path of feature file
		,glue={"com.step_definition"}//package name 
		,tags= {"@succesful_login"}
		
		)
public class TestRunner {

}
