package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.framework.dataproviders.StaticProvider;
import com.automation.framework.pages.LoginPage;
import com.automation.framework.pages.LoginResultPage;
import com.automation.framework.pages.NotePage;
import com.automation.framework.utils.BaseTest;

public class SecondTest extends BaseTest {
	
	@Test(dataProvider = "note", dataProviderClass = StaticProviderNote.class)
	public void testFlightSearch(String user, String password) throws InterruptedException {
		LoginPage loginPage = getLoginPage();
		loginPage.clickLogin();
		loginPage.fillUserName(user);
		loginPage.fillPassword(password);
		LoginResultPage result = loginPage.login();
		
		NotePage note = new NotePage();
		
		note.clicknotebutton();
		note.fillTitle("");
		note.fillnote("");
		
		
		
		
	
	
	}

}
