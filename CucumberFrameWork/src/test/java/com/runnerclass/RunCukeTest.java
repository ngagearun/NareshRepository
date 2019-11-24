package com.runnerclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( 
 			features = "CucumberFrameWork/src/test/resources/com/features", 
 			glue={"stepDefinations"},
 			plugin = {"pretty","html:target/LoginReport","json:target/cucumber-json/cucumber.json"},
 			tags={"@regressiontesting"},
 			monochrome=true
 						 
 			) 


public class RunCukeTest {
	
	
}
