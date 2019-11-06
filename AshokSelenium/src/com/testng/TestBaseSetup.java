package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBaseSetup {
	WebDriver driver=null;
	int a=10;
	@BeforeTest
	@Parameters({"browser","URL"})
	public void launchbrowser(String browsername,String applicationurl){
		if(driver==null){
			if(browsername.equalsIgnoreCase("firefox")){
	           driver=new FirefoxDriver();
			}else if(browsername.equalsIgnoreCase("chrome")){
				driver=new ChromeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(applicationurl);
		}
	}
	
	@AfterTest
	
	public void closebrowser(){
		driver.quit();
		driver =null;
	}

}
