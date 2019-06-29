package com.practice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.qa.base.TestBase;

public class SignInPage extends TestBase {

	@FindBy(id = "ul-btn")
	WebElement loginBtn;

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public SignInPage clickLoginBtn() {
		 
		loginBtn.click();

		return new SignInPage();

	}

	public String validateSignInPageTitle() {

		return driver.getTitle();
	}

}
