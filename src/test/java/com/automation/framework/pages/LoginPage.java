package com.automation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.framework.utils.CommonActions;

public class LoginPage extends CommonActions {

	public LoginPage(WebDriver driver) {
		super(driver);
		driver.get("http://testapp.galenframework.com/");
	}

	// Try to use css and elements with description
	@FindBy(css = ".button-login")
	private WebElement loginButton;

	@FindBy(name = "login.username")
	private WebElement txtUserName;

	@FindBy(name = "login.password")
	private WebElement txtPassword;

	public void clickLogin() {
		clickButton(loginButton);
	}

	public void fillUserName(String user) {
		enterText(txtUserName, user);
	}

	public void fillPassword(String password) {
		enterText(txtPassword, password);
	}

	public LoginResultPage login() {
		clickButton(loginButton);
		return new LoginResultPage(driver);
	}
}
