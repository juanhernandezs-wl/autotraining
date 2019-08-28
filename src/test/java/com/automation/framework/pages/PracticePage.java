package com.automation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.framework.utils.CommonActions;

public class PracticePage extends CommonActions {

	public PracticePage(WebDriver driver) {
		super(driver);
	}

	// Buttons

	@FindBy(id = "bmwradio")
	public WebElement radioBmwRadioButton;

	@FindBy(id = "benzradio")
	private WebElement radioBenzRadioButton;

	@FindBy(id = "hondaradio")
	public WebElement radioHondaRadioButton;

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
	public WebElement optionBMW;

	@FindBy(css = "option[value=\"benz\"]")
	public WebElement optionBenz;

	@FindBy(css = "option[value=\"honda\"]")
	public WebElement optionHonda;

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
	public WebElement checkboxBMW;

	@FindBy(css = "#checkbox-example label[for=\"benz\"]")
	public WebElement checkboxBenz;

	@FindBy(css = "#checkbox-example label[for=\"honda\"]")
	public WebElement checkboxHonda;
	
	public void goToPracticePage() {
		driver.get("https://learn.letskodeit.com/p/practice");
	}
	
	public void selectRadioButton(String option) {
		
		switch (option.toLowerCase()) {
		case "bmw":
			clickButton(radioBmwRadioButton);
			break;
			
		case "benz":
			clickButton(radioBenzRadioButton);
			break;
			
		case "honda":
			clickButton(radioHondaRadioButton);
			break;

		default:
			break;
		}
	}

	public void selectComboBox(String option) {
		
		switch (option.toLowerCase()) {
		case "bmw":
			clickButton(comboCarSelect);
			clickButton(checkboxBenz);
			break;
			
		case "benz":
			clickButton(comboCarSelect);
			clickButton(checkboxBenz);
			break;
			
		case "honda":
			clickButton(comboCarSelect);
			clickButton(checkboxHonda);
			break;

		default:
			break;
		}
		
		
	}
	
	

}
