package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement signUpBtn;
	
	

	public SignUpPage() {

		PageFactory.initElements(driver, this); // this -> It pointing to the current class objects
	}

	public String validateSignUpPageTitle() {
		return driver.getTitle();
	}

	public LoginPage clickOnSignupButton() {
		signUpBtn.click();
		return new LoginPage();
	}
}
