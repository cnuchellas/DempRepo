package com.practice.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.qa.base.TestBase;
import com.practice.qa.pages.LogInPage;
import com.practice.qa.pages.SignInPage;


public class LoginPageTest extends TestBase {
	
	LogInPage  loginPage;
	SignInPage signin;
	
	 public LoginPageTest() {
		
		 super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		
		loginPage= new LogInPage();
		signin = new SignInPage();
		
	}
	
	@Test
	public void loginTest()
	{
		signin.clickLoginBtn();
		Assert.assertEquals("Log in to your PayPal account", driver.getTitle());
		loginPage.login(prop.getProperty("username"));
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
