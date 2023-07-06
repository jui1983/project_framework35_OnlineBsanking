package com.generic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Login {
	
	public void getlogin(){
		
		
	
	WebDriver driver = new SafariDriver();
	
	  driver.manage().window().maximize();
		
		  driver.get("https://magento.softwaretestingboard.com");
		  
		  driver.findElement(By.xpath("//*[@class='authorization-link']")).click();
		  
		  driver.findElement(By.xpath("//*[@id='email']")).click();
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bhuijui@gmail.com");
		  
		  //driver.findElement(By.xpath("")).click();
		 
	
	  
	
	}

}
