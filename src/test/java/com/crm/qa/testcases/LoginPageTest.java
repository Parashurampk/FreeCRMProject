/**
 * 
 */
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

/**
 * @author Parashuram
 *
 */
public class LoginPageTest extends TestBase {
	SignUpPage signUpPage;
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void LoginTest() {
		signUpPage = new SignUpPage();
		signUpPage.clickOnSignupButton();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 2)
	public void validateLogiPageTitleTest() {
		String LoginPageTitle=loginPage.validateLoginPageTitel();
		Assert.assertEquals(LoginPageTitle, "#1 Free CRM customer relationship management software cloud");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}