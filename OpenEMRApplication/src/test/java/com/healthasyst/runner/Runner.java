package com.healthasyst.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Feature/"} 
		,glue = {"com.healthasyst.stepdefinition"} 
		,publish= true
		,monochrome =true
		//monochrome will remove unwanted data in the console
		,dryRun = true 
			//dry will check if all the step definitions in the feature are mapped or not.By default it will be false. 
		//we have to set it to false to run the code or else it will just check if all step definitions are given or not and wont run the chrome
		//,tags = " @valid or @invalid "//this is to specify which scenario to run for the whole feature document. tags can have and and or combination
		,tags = "@patient"
		
		)

@RunWith(Cucumber.class)
public class Runner {

}
