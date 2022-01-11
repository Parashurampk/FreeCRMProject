package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/span[2]/a")
	WebElement FreeAccText;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/button")
	WebElement clickOnContactAdd;

	@FindBy(xpath = "//div[@id='main-nav']//div[4]//button[1]//i[1]")
	WebElement clickOnCompanyAdd;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle() {
		return driver.getTitle();
		   
	}


	public ContactCreationPage  clickOnContactAddBtn() {
		clickOnContactAdd.click();
		return new ContactCreationPage();

	}

	public CompanyCreationPage clickOnCompanyAddBtn() {
		clickOnCompanyAdd.click();
		return new CompanyCreationPage();
	}
}
