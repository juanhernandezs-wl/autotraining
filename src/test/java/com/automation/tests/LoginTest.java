package com.automation.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.framework.dataproviders.StaticProvider;
import com.automation.framework.pages.LoginPage;
import com.automation.framework.pages.LoginResultPage;
import com.automation.framework.utils.BaseTest;
import com.beust.jcommander.Parameter;

/**
 * 
 * @author Juan Hernandez This test class validates Login behavior for
 *         testapp.galenframework.com
 *
 */

public class LoginTest extends BaseTest {

	@Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
	public void testFlightSearch(String user, String password) throws InterruptedException {
		LoginPage loginPage = getLoginPage();
		loginPage.clickLogin();
		loginPage.fillUserName(user);
		loginPage.fillPassword(password);
		LoginResultPage result = loginPage.login();
		assertTrue(result.isBtnAddNoteDisplayed());
		// TODO Add more assertions
	}

	// TODO Implement another test cases
}
