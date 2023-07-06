package com.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.LoginPage2;
import com.utill.BaseConfig;

public  class Onlinebanking {
	
	public static void getlogin2() throws Exception {
		
		
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		//driver.get("file:///Users/juibhuiyan/Downloads/Online%20banking_dev.html");
		
		driver.get(BaseConfig.getconfig("URL"));
		
		
		//driver.findElement(By.xpath("//*[@id='username']")).click();
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch35");
		
		//driver.findElement(By.xpath("//*[@id='username']")).click();
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys(BaseConfig.getconfig("Username"));
		driver.findElement(LoginPage2.Username).sendKeys(BaseConfig.getconfig("Username"));
		System.out.println(BaseConfig.getconfig("Username"));
		
		//  driver.findElement(By.xpath("//*[@id='password']")).click();
		 //driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
		  
		 
		//driver.findElement(By.xpath("//*[@id='password']")).click();
		// driver.findElement(By.xpath("//*[@id='password']")).sendKeys(BaseConfig.getconfig("Password"));
		 driver.findElement(LoginPage2.password).sendKeys(BaseConfig.getconfig("Password"));
		 System.out.println(BaseConfig.getconfig("Password"));
		 
		  //driver.findElement(By.xpath("//*[@type='submit']")).click(); 
		  driver.findElement(LoginPage2.signin).click(); 
		  
		  /*driver.findElement(By.xpath("//*[@id='logoutButton']")).click(); 
		  driver.findElement(LoginPage2.logoutBtn).click(); */
			
			  SoftAssert sf = new SoftAssert(); 
			  sf.assertTrue(driver.findElement(LoginPage2.logoutBtn).isDisplayed());
			 System.out.println("Hello");
			 
			 sf.assertAll();
			 
			 
		  //driver.quit();
		  
		  
		  
		  
		 
	}
	
	
	
	

}
