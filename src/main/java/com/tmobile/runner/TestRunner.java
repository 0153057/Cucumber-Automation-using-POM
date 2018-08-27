package com.tmobile.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "Users/Kaamya/workspace/Demo/AutomationCucumber/src/main/java/com/tmobile/features/catSearch.feature,dogSearch.feature,eleSearch.feature", //the path of the feature files
		features = {"classpath:catSearch", "classpath:dogSearch","classpath:eleSearch"},
		glue={"com/tmobile/stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //verify step is not defined in step definition file
		dryRun = true //mapping is proper between feature file and step definition 
		)

public class TestRunner {

}
