package com.qa.hybridninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridNinja_Search_Page {
	public WebDriver driver;
	
	@FindBy(css = "input.form-control.input-lg")
	private WebElement productSearchBox;
	
	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	@FindBy(linkText = "MacBook")
	private WebElement validProductSearchResult;
	
	@FindBy(css = "input#button-search+h2+p")
	private WebElement invalidProductSearchResult;
	
	public HybridNinja_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterValidProductName(String validProductName) {
		productSearchBox.sendKeys(validProductName);
	}
	public void enterInvalidProductName(String invalidProductName) {
		productSearchBox.sendKeys(invalidProductName);
	}
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public WebElement ValidProductSearchResult() {
		return validProductSearchResult;
	}
	public WebElement InValidProductSearchResult() {
		return invalidProductSearchResult;
	}

}
