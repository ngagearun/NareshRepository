package com.testng;

import java.util.Random;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAnAccount extends PreSetupTestSteps {

	
	
	@BeforeClass(groups={"regression","smoke"})
	public void clickoncreateAccountlink(){
		driver.findElement(By.linkText("Create")).click();
		
	}
	
	
	
	@Test(groups="regression",priority=2)
	@SuppressWarnings("deprecation")
	public void createaccountwithBalnkEmailField(){		
		
		
		driver.findElement(By.name("Submit")).click();
		String errorMessage =driver.findElement(By.className("errorInline")).getText();
		Assert.assertEquals(errorMessage, "This field is required.");
		
	}
	
	
	@Test(groups="smoke")
	public void createaccountwithBlankPassword(){
		
		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("function");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().alert().accept();
		
	}
	
	
	@Test(groups="smoke")
	public void validateerrorMessageForEmailAddress(){

		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("test");
		String errorMessage =driver.findElement(By.className("errorInline")).getText();
		Assert.assertEquals(errorMessage, "Please provide valid email address.");
	}
	
	
	@Test(groups="regression",priority=2)
	public void createaccount(){
		
		Random ra=new Random();
		int num =ra.nextInt(2000);
		driver.findElement(By.name("emailid")).sendKeys("test"+num+"@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("function");
		driver.findElement(By.name("password")).sendKeys("123456789Aa@");
		driver.findElement(By.name("confirmpassword")).sendKeys("123456789Aa@");
		Select hintquestion=new Select(driver.findElement(By.name("hintquestion")));
		hintquestion.selectByVisibleText("Place of birth");		
		driver.findElement(By.name("hintanswer")).sendKeys("hyderbad");
		driver.findElement(By.name("Submit")).click();		
	}
	
	@AfterClass(groups="regression")
	public void logout(){
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	
	
}
