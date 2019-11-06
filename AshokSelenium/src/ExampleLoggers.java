import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExampleLoggers {	
	
 
	private static WebDriver driver;
 
	private static Logger Log = Logger.getLogger(ExampleLoggers.class.getName());
 
	public static void main(String[] args) {
 
		DOMConfigurator.configure("log4j.xml");
        driver = new FirefoxDriver();
        Log.info("Firefox Browser is launched Successfully");
        driver.get("https://www.mortgagecalculator.org/");
        Log.info("Application is loaded Successfully");
        driver.close();
        Log.info("Closeed the Browser");
        
  
	}
 
}