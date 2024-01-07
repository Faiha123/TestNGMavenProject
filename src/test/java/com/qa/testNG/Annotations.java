package com.qa.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
//Annotations
public class Annotations {
  @Test
  public void testOne() {
	  System.out.println("Test one got executed");
  }
  
  @Test
  public void testTwo() {
	  System.out.println("Test Two got executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod got executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod got executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass got executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass got executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest got executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest got executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite got executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite got executed");
  }

}
