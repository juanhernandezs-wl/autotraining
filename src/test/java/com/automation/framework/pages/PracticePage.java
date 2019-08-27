package com.automation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.framework.utils.CommonActions;

public class PracticePage extends CommonActions {

	public PracticePage(WebDriver driver) {
		super(driver);
		driver.get("https://learn.letskodeit.com/p/practice");
	}

	// Buttons

	@FindBy(id = "bmwradio")
	private WebElement radioBmwRadioButton;

	@FindBy(id = "benzradio")
	private WebElement radioBenzRadioButton;

	@FindBy(id = "hondaradio")
	private WebElement radioHondaRadioButton;

	@FindBy(id = "openwindow")
	private WebElement btnOpenWindow;

	@FindBy(id = "opentab")
	private WebElement btnOpenTab;

	@FindBy(id = "alertbtn")
	private WebElement btnAlert;

	@FindBy(id = "confirmbtn")
	private WebElement btnConfirm;

	@FindBy(id = "hide-textbox")
	private WebElement btnHideBox;

	@FindBy(id = "show-textbox")
	private WebElement btnShowBox;

	@FindBy(id = "mousehover")
	private WebElement btnMouseOver;

	@FindBy(id = "name")
	private WebElement inputName;

	@FindBy(id = "table#product")
	private WebElement tableProduct;

	// iFrame

	@FindBy(id = "courses-iframe")
	private WebElement iframeCourses;

	@FindBy(id = "search-courses")
	private WebElement inputSearchCourses;

	@FindBy(id = "search-course-button")
	private WebElement btnSearchCourses;

	// Labels
	
	@FindBy(css = "#radio-btn-example legend")
	private WebElement txtRadioButtonExample;

	@FindBy(css = "#select-class-example fieldset legend")
	private WebElement txtSelectClassExample;

	@FindBy(css = ".right-align#checkbox-example fieldset legend")
	private WebElement txtCheckBoxExample;

	// Combo box

	@FindBy(id = "carselect")
	private WebElement comboCarSelect;

	@FindBy(css = "option[value=\"bmw\"]")
	private WebElement optionBMW;

	@FindBy(css = "option[value=\"benz\"]")
	private WebElement optionBenz;

	@FindBy(css = "option[value=\"honda\"]")
	private WebElement optionHonda;

	@FindBy(id = "multiple-select-example")
	private WebElement multipleSelectExample;

	@FindBy(css = "option[value=apple]")
	private WebElement optionApple;

	@FindBy(css = "option[value=orange]")
	private WebElement optionOrange;

	@FindBy(css = "option[value=peach]")
	private WebElement optionPeach;

	// Checkbox

	@FindBy(css = "#checkbox-example label[for=\"bmw\"]")
	private WebElement checkboxBMW;

	@FindBy(css = "#checkbox-example label[for=\"benz\"]")
	private WebElement checkboxBenz;

	@FindBy(css = "#checkbox-example label[for=\"honda\"]")
	private WebElement checkboxHonda;
	
	

}
