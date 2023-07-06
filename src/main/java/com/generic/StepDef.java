package com.generic;


import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.LoginPage2;
import com.utill.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver drive;
	
	
	
	@Given("open the browser")
	public void open_the_browser() throws Exception {
	 drive = new SafariDriver();
		drive.manage().window().maximize();
	    
	}

	@Given("Go to application")
	public void go_to_application() throws Exception {
		drive.get(BaseConfig.getconfig("URL"));
	}

	@When("Put valid user name")
	public void put_valid_user_name() throws Exception {
		drive.findElement(LoginPage2.Username).sendKeys(BaseConfig.getconfig("Username"));
		System.out.println(BaseConfig.getconfig("Username"));
		
		
	}

	@When("Put valid password")
	public void put_valid_password() throws Exception {
		 drive.findElement(LoginPage2.password).sendKeys(BaseConfig.getconfig("Password"));
		 System.out.println(BaseConfig.getconfig("Password")); 
		
	}

	@When("Click sign in")
	public void click_sign_in() throws Exception {
		drive.findElement(LoginPage2.signin).click();  
		
	}

	@Then("Logout button should visible for successfull login")
	public void logout_button_should_visible_for_successfull_login() throws Exception{
		SoftAssert sf = new SoftAssert(); 
		  sf.assertTrue(drive.findElement(LoginPage2.logoutBtn).isDisplayed());
		 System.out.println("Hello");
		 sf.assertAll();
		drive.quit();
	}

	@When("Put invalid user name")
	public void put_invalid_user_name() throws Exception {
		drive.findElement(LoginPage2.Invalid_Username).sendKeys(BaseConfig.getconfig("Invalid_Username"));
		 System.out.println(BaseConfig.getconfig("Invalid_Username")); 
		
		
	}

	@When("Put invalid Password")
	public void put_invalid_password() throws Exception {
		drive.findElement(LoginPage2.Invalid_password).sendKeys(BaseConfig.getconfig("Invalid_password"));
		 System.out.println(BaseConfig.getconfig("Invalid_password"));   
		
		
	}

	@Then("Logout button should not visible for successfull login")
	public void logout_button_should_not_visible_for_successfull_login()throws Exception {
		
		Alert alert =drive.switchTo().alert();
		alert.accept();
		
		SoftAssert sf = new SoftAssert(); 
		  sf.assertTrue(!drive.findElement(LoginPage2.logoutBtn).isDisplayed());
		 System.out.println("Hello");
		  sf.assertAll();
		
		
		
}
}