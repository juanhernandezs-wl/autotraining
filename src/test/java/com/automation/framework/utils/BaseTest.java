package com.automation.framework.utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.framework.pages.LoginPage;

/**
 * 
 * @author Juan Hernandez All test classes should extend from this class
 *
 */
public class BaseTest {

	MyDriver myDriver;

	private LoginPage loginPage;

	@BeforeSuite(alwaysRun = true)
	@Parameters({ "browser" })
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
		loginPage = new LoginPage(myDriver.getDriver());
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		loginPage.dispose();
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}
}