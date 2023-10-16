package com.qa.hybridninja.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridNinja_Register_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement MyAccountLink;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(id = "input-firstname")
	private WebElement FirstNameTextBox;
	
	@FindBy(id = "input-lastname")
	private WebElement LastNameTextBox;
	
	@FindBy(id = "input-email")
	private WebElement EmailTextBox;
	
	@FindBy(id = "input-telephone")
	private WebElement TelephoneTextBox;
	
	@FindBy(id = "input-password")
	private WebElement PasswordTextBox;
	
	@FindBy(id = "input-confirm")
	private WebElement PasswordConfirmationTextBox;
	
	@FindBy(name = "agree")
	private WebElement PrivacyPolicyCheckBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement ContinueButton;
	
	@FindBy(css = "div#content h1")
	private WebElement AccountCreationMessage;
	
	@FindBy(css = "label.radio-inline input")
	private List <WebElement> NewsLetterButton;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement PrivacyPolicyMessage;
	
	@FindBy(css = "input#input-firstname+div")
	private WebElement FirstNameMessage;
	
	@FindBy(css = "input#input-lastname+div")
	private WebElement LastNameMessage;
	
	@FindBy(css = "input#input-email+div")
	private WebElement EmailMessage;
	
	@FindBy(css = "input#input-telephone+div")
	private WebElement TelephoneMessage;
	
	@FindBy(css = "input#input-password+div")
	private WebElement PasswordMessage;
	
	public HybridNinja_Register_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyAccountLink() {
		MyAccountLink.click();
	}
	public void clickOnRegisterLink() {
		RegisterLink.click();
	}
	public void enterFirstName(String firstNameText) {
		FirstNameTextBox.sendKeys(firstNameText);
	}
	public void enterLastName(String lastNameText) {
		LastNameTextBox.sendKeys(lastNameText);
	}
	public void enterEmail(String emailText) {
		EmailTextBox.sendKeys(emailText);
	}
	public void enterTelephoneNumber(CharSequence telephoneNumber) {
		TelephoneTextBox.sendKeys(telephoneNumber);
	}
	public void enterPassword(String passwordText) {
		PasswordTextBox.sendKeys(passwordText);
	}
	public void enterPasswordConfirmation(String passwordText) {
		PasswordConfirmationTextBox.sendKeys(passwordText);
	}
	public void clickOnPrivacyPolicyStatement() {
		PrivacyPolicyCheckBox.click();
	}
	public void clickOnContinueButton() {
		ContinueButton.click();
	}
	public WebElement AccountCreationMessage() {
		return AccountCreationMessage;
	}
	public List<WebElement> NewsLetterButton() {
		return NewsLetterButton;
	}
	public WebElement PrivacyPolicyMessage() {
		return PrivacyPolicyMessage;
	}
	public WebElement FirstNameMessage() {
		return FirstNameMessage;
	}
	public WebElement LastNameMessage() {
		return LastNameMessage;
	}
	public WebElement EmailMessage() {
		return EmailMessage;
	}
	public WebElement TelephoneMessage() {
		return TelephoneMessage;
	}
	public WebElement PasswordMessage() {
		return PasswordMessage;
		
	}
	
	
	

}
