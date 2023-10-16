package com.qa.hybridninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridNinja_Logout_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement MyAccountLink;
	
	@FindBy(linkText = "Login")
	private WebElement LoginLink;
	
	@FindBy(id = "input-email")
	private WebElement UsernameBox;
	
	@FindBy(id = "input-password")
	private WebElement passwordBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement LoginButton;
	
	@FindBy(linkText = "Logout")
	private WebElement logOutButton;
	
	@FindBy(css = "div#content h1+p")
	private WebElement logOutMessage;
	
	public HybridNinja_Logout_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyAccountLink() {
		MyAccountLink.click();
	}
	public void clickOnLoginLink() {
		LoginLink.click();
	}
	public void enterUsername(String usernameText) {
		UsernameBox.sendKeys(usernameText);
	}
	public void enterPassword(CharSequence passwordText) {
		passwordBox.sendKeys(passwordText);
	}
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	public void clickOnLogOutButton() {
		logOutButton.click();
	}
	public WebElement LogOutMessage() {
		return logOutMessage;
	}
	public boolean LogOutMessageIsDisplayed() {
		boolean displayStatus = logOutMessage.isDisplayed();
		return displayStatus;
		
		
	}

}
