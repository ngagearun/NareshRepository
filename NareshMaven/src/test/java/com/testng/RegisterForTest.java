package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterForTest extends PreSetupTestSteps {
	
	
	@BeforeClass(groups={"regression","smoke"})
	public void  clickonregisterfortest(){
		
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(groups={"smoke"})
	public void organization_not_having_selectedvalue(){
		Select organization=new Select(driver.findElement(By.name("c0")));
		organization.selectByVisibleText("Place of birth");	
	}
	
	@Test(groups={"smoke"})
	public void organization_having_selectedvalue(){
		Select organization=new Select(driver.findElement(By.name("c0")));
		organization.selectByVisibleText("FDNY");
		
		Select examcategory=new Select(driver.findElement(By.name("c1")));
		examcategory.selectByVisibleText("FDNY");
		
		driver.findElement(By.linkText("FDNY Entrance Exam (7001-E2)")).click();
		driver.findElement(By.name("Submit3")).click();
		
		driver.findElement(By.name("emailid")).sendKeys("a2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789Aa@");
		driver.findElement(By.name("loginbtn")).click();
		
	}
	
	

}
