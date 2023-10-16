package com.qa.hybridninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridNinja_Login_Page {
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
	
	@FindBy(css = "div#content h2")
	private WebElement MyAccountName;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement InvalidCredentialsMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement InvalidUsernameMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement InvalidPasswordMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement NoCredentialsMessage;
	
	public HybridNinja_Login_Page(WebDriver driver) {
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
	public WebElement myAccountName() {
		return MyAccountName;
	}
	public boolean myAccountNameIsDisplayed() {
		boolean displayStatus = MyAccountName.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidCredentialsMessage() {
		return InvalidCredentialsMessage;
	}
	public boolean invalidCredentialsMessageIsDisplayed() {
		boolean displayStatus = InvalidCredentialsMessage.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidUsernameMessage() {
		return InvalidUsernameMessage;
	}
	public boolean invalidUsernameMessageIsDisplayed() {
		boolean displayStatus = InvalidUsernameMessage.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidPasswordMessage() {
		return InvalidPasswordMessage;
	}
	public boolean invalidPasswordMessageIsDisplayed() {
		boolean displayStatus = InvalidPasswordMessage.isDisplayed();
		return displayStatus;
	}
	public WebElement noCredentialsMessage() {
		return NoCredentialsMessage;
	}
	public boolean noCredentialsMessageIsDisplayed() {
		boolean displayStatus = NoCredentialsMessage.isDisplayed();
		return displayStatus;
		
		
		
	}
	
	
	
	

}
