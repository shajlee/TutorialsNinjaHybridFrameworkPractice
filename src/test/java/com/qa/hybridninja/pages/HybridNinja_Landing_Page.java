package com.qa.hybridninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridNinja_Landing_Page {
	public WebDriver driver;
	
	@FindBy(linkText = "Qafox.com")
	private WebElement QaFoxLink;
	
	public HybridNinja_Landing_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement QaFoxLink() {
		return QaFoxLink;
	}
	public boolean QaFoxLinkIsDisplayed() {
		boolean displayStatus = QaFoxLink.isDisplayed();
		return displayStatus;
		
		
		
	
		
		
		
	}
	
	
	
	

}
