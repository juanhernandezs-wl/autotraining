package com.automation.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.framework.pages.PracticePage;
import com.automation.framework.utils.BaseTest;
import com.automation.framework.utils.CommonActions;

public class PracticeTest extends BaseTest {

	@BeforeClass
	public void beforeClass() {
		practicePage = new PracticePage(webDriver);
	}

	@AfterClass
	public void afterClass() {
		practicePage.dispose();
	}

	@AfterMethod
	public void afterTest(ITestResult result) {
		// Uncomment this line:
		// CommonActions.takeScreenShot(result.getStatus(), result.getName(),
		// webDriver);

	}

	@Test(enabled = false)
	public void test_clickRadioButtons() {
		practicePage.goToPracticePage();
		practicePage.selectRadioButton("benz");
		practicePage.selectRadioButton("honda");
		practicePage.selectRadioButton("bmw");

		assertTrue(practicePage.radioBmwRadioButton.isSelected());
		assertFalse(practicePage.radioHondaRadioButton.isSelected());
	}

	@Test(enabled = true)
	public void test_comboBoxSelection() {
		practicePage.goToPracticePage();
		practicePage.selectComboBox("benz");
		practicePage.selectComboBox("bmw");
		practicePage.selectComboBox("honda");

		assertTrue(practicePage.checkboxBMW.isSelected());
	}

}
