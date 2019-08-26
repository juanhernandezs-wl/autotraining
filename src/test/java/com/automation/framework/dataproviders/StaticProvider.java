package com.automation.framework.dataproviders;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	@DataProvider(name = "create")
	public static Object[][] createData() {
		return new Object[][] { { "testuser@example.com", "test123" } };
	}
}