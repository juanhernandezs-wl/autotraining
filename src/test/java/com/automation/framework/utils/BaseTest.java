package com.automation.framework.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.framework.pages.LoginPage;
import com.automation.framework.pages.PracticePage;

/**
 * 
 * @author Juan Hernandez All test classes should extend from this class
 *
 */
public class BaseTest {

	public MyDriver myDriver;
	public static WebDriver webDriver;

	private LoginPage loginPage;
	private PracticePage practicePage;

	@BeforeSuite(alwaysRun = true)
	@Parameters({ "browser" })
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
		loginPage = new LoginPage(myDriver.getDriver());
	//	practicePage = new PracticePage(myDriver.getDriver());
		

		
		
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		loginPage.dispose();
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}	
	
}