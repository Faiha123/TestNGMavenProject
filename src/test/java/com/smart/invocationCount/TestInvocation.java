package com.smart.invocationCount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInvocation {
	
	@Test(invocationCount = 6, threadPoolSize = 2)//executing 6 times basically; Threadpool runs parallel
	public void testMethod() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://randomuser.me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		Thread.sleep(1000);
		//get the name and print it
		System.out.println(driver.findElement(By.id("user_value")).getText());
		driver.close();
	}

}
