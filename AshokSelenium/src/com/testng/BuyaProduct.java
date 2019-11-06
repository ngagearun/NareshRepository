package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BuyaProduct extends TestBaseSetup {
	
	Actions action;
	@BeforeClass
	public void check_application(){
	
	String title_name =	driver.getTitle();
	Assert.assertEquals("My Store112",title_name);
	System.out.println("I am in a correct application page");
	}
	
	@Test
	public void checkoutitem(){
	
		action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a"))).perform();
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='layered_id_attribute_group_1']")).click();
		Assert.assertEquals("Arun", "Arun1");
		WebDriverWait  wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='center_column']/div[3]/div/form/button")));
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/h5/a"))).perform();
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		
	}
	
	@Test
	public void clickapplication(){
		System.out.println("I am in applicaion method");
	}
	

}
