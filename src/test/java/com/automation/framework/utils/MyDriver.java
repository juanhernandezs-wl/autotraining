package com.automation.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Juan Hernandez WebDriver setup for testing
 *
 */
public class MyDriver {

	private WebDriver driver;

	public MyDriver(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/Users/juan/Downloads/driv/chromedriver");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/juan/Downloads/driv/geckodriver");
			driver = new FirefoxDriver();
			break;

		default:
			break;

		}
	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
