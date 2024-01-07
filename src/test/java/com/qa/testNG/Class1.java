package com.qa.testNG;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	@Test
	public void googleTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ProSmart", Keys.ENTER);
		String actualTitle = driver.getTitle();	
		String expectedTitle = "ProSmart - Google Search";
		//Assert.assertEquals(actualTitle, expectedTitle);//this is one way
		//customized way
		assertEquals(actualTitle, expectedTitle, "Title mismatched >> ");
		driver.quit();
	}
	
	@Test
	public void facebookTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ProSmart", Keys.ENTER);
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();		
		System.out.println(title);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
