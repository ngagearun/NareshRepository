package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void setupbrowser(String browsername){
	
		if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
			driver =new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		driver.get("http://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}
	
	@AfterTest
	
	public void closebrowser(){
		driver.close();
		
	}
	
	@Test(dataProvider="mortgage")
	public void calculate(Object homevalue,Object loanamount,Object interestrate) throws InterruptedException{
		
		driver.findElement(By.name("param[homevalue]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("param[homevalue]")).sendKeys(homevalue.toString());
		driver.findElement(By.id("loanamt")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("loanamt")).sendKeys(loanamount.toString());
		driver.findElement(By.id("intrstsrate")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("intrstsrate")).sendKeys(interestrate.toString());
		driver.findElement(By.name("cal")).click();
		
	}
	
	@org.testng.annotations.DataProvider(name ="mortgage")
	
	public Object[][] setinputvalues(){
		
		Object inputvalues[][]={{"1000",200,"30"},
				                 {"2000",20,"45"},
				                 {"5000",344,"56"}};
		return inputvalues;
		
	}

}
