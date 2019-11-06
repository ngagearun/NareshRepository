package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	

  @Test(groups="regression",priority=4)
  public void testmethod1() {
	  System.out.println("I am in testmethod1 of class1");
  }
  
  @Test(groups="sanity",priority=1)
  public void testmethod2() {
	  System.out.println("I am in testmethod2 of class1");
  }
  
  
  @Test(groups="smoke",priority=2)
  public void testmethod3() {
	  System.out.println("I am in testmethod3 of class1");
  }
  
  @Test(groups="regression",priority=1,enabled=false)
  public void aestmethod4() {
	  System.out.println("I am in testmethod4 of class1");
  }
  
  
}