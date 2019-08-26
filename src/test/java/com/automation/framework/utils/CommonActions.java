package com.automation.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonActions extends BasePage {
	
	public CommonActions(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}

	public void enterText(WebElement element, String text){
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	
	public void clickButton(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
