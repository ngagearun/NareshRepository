package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {

	
	
  @Test(groups="sanity")
  public void testmethod1() {
	  System.out.println("I am in testmethod1 of class2");
  }
  
  @Test(groups="smoke")
  public void testmethod2() {
	  System.out.println("I am in testmethod2 of class2");
  }
  
   
  
  
  @Test(groups="sanity")
  public void testmethod3() {
	  System.out.println("I am in testmethod3 of class2");
  }
  
  @Test(groups="regression")
  public void testmethod4() {
	  System.out.println("I am in testmethod4 of class2");
  }
  
  
}