/**
 * 
 */
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

/**
 * @author Parashuram walikindi
 *
 */
public class SignUppageTest extends TestBase {
	SignUpPage SignUpPage;

	public SignUppageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();

		SignUpPage = new SignUpPage();

	}

	@Test(priority = 1)
	public void verifySignUppageTitlle() {
		String SignupPageTitle = SignUpPage.validateSignUpPageTitle();
		Assert.assertEquals(SignupPageTitle, "#1 Free CRM customer relationship management software cloud");
	}

	@Test(priority = 2)
	public void clickOnSignupButtonTest() {
		SignUpPage.clickOnSignupButton();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
