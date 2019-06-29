package com.practice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.qa.base.TestBase;

public class LogInPage extends TestBase{
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="btnNext")
	WebElement nextBtn;
	
	@FindBy(id="createAccount")
	WebElement signupBtn;
	
	
	public LogInPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String username)
	{
		
		email.sendKeys(username);
		nextBtn.click();
		
	}
	
	public String validateLogInPageTitle()
	{
		
		return driver.getTitle();
	}
	
	
	
	
	

}
