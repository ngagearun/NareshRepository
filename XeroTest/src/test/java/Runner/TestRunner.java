package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith; 




@RunWith(Cucumber.class)
@CucumberOptions( 
 			features = "C:/Users/Lenovo/Downloads/xeroworkspace/XeroTest/src/main/java/Features", 
 			glue={"stepDefinitions"},
 			plugin = {"pretty","html:target/LoginReport","json:target/cucumber-json/cucumber.json"},
 			monochrome=true
 						 
 			) 

public class TestRunner {

	
	
	
	
	
	

}
