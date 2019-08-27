package com.automation.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonActions extends BasePage {

	public CommonActions(WebDriver pDriver) {
		super(pDriver);
	}

	public void enterText(WebElement element, String text) {

		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
			System.err.println(element + "was not found, please verify.");
		}

	}

	public void clickButton(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public boolean isDisplayed(WebDriver driver, WebElement element) {
		waitForElementToBeDisplayed(driver, element);
		return element.isDisplayed();
	}

}
