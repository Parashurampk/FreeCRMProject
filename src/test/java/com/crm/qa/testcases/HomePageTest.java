/**
 * 
 */
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompanyCreationPage;
import com.crm.qa.pages.ContactCreationPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

/**
 * @author Parashuram
 *
 */
public class HomePageTest extends TestBase {

	SignUpPage signUpPage;
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		signUpPage = new SignUpPage();
		signUpPage.clickOnSignupButton();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void verifyHomepageTitleTest() {
		String verifyHomepageTitleText = homePage.verifyHomepageTitle();
		Assert.assertEquals(verifyHomepageTitleText, "Cogmento CRM", "Home page title not found");
	}

	@Test(priority = 2)
	public ContactCreationPage clickOnContactAddBtnTest() {
		homePage.clickOnContactAddBtn();
		return new ContactCreationPage();
	}

	@Test(priority = 3)
	public CompanyCreationPage clickOnCompanyAddBtnTest() {

		homePage.clickOnCompanyAddBtn();
		return new CompanyCreationPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
