package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class PreSetupTestSteps {
	
    static WebDriver driver;
	@Parameters("appurl")
	@BeforeTest(groups={"regression","smoke"})
	public void prerequisitesteps(String url){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest(groups={"regression","smoke"})
	public void closeapp(){
		driver.close();
	}

}
