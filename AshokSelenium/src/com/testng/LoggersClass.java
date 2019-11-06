package com.testng;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoggersClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=Logger.getLogger(LoggersClass.class.getName());
		DOMConfigurator.configure("log4j.xml");
		WebDriver driver =new FirefoxDriver();
		log.info("Firefox Browser is aunched Successfully");
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		log.info("Application is loaded Successfully");
		driver.close();
		log.info("Browser closed Successfully");
		

	}

}
