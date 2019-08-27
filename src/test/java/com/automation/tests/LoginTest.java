package com.automation.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automation.framework.dataproviders.StaticProvider;
import com.automation.framework.pages.LoginPage;
import com.automation.framework.pages.LoginResultPage;
import com.automation.framework.utils.BaseTest;

/**
 * 
 * @author Juan Hernandez This test class validates Login behavior for
 *         testapp.galenframework.com
 *
 */

public class LoginTest extends BaseTest {
	


 
	@Test(dataProvider = "validCredential", dataProviderClass = StaticProvider.class)
	public void test_Login_ValidCredential(String user, String password) throws InterruptedException {
		LoginPage loginPage = getLoginPage();
		loginPage.clickWelcomeLogin();
		loginPage.fillUserName(user);
		loginPage.fillPassword(password);
		LoginResultPage result = loginPage.login();
		assertTrue(result.isBtnAddNoteDisplayed());
	}
	

	@Test(dataProvider = "invalidCredentials", dataProviderClass = StaticProvider.class)
	public void test_Login_InvalidCredentials (String user, String password) throws InterruptedException{
		LoginPage loginPage = getLoginPage();
		loginPage.goHome();
		loginPage.clickWelcomeLogin();
		loginPage.fillUserName(user);
		loginPage.fillPassword(password);
		loginPage.clickLogin();
		assertTrue(loginPage.getInvalidCredentialsError().isDisplayed());
		loginPage.clickCancel();

	}
	
	
}
