package com.qa.hybridninja.testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Register_Page;
import com.qa.ninjahybrid.utilities.NinjaHybrid_Utilities;

public class HybridNinja_Register_Test extends Hybrid_Ninja_TestBase {
	public HybridNinja_Register_Test() throws Exception {
		super();
		
	}

    public static WebDriver driver;
	public static ChromeOptions options;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(prop.getProperty("browserName1"));
		
	}
	@Test(priority =1)
	public void registerWithRequiredFields() {
		HybridNinja_Register_Page registerPage = new HybridNinja_Register_Page(driver);
		registerPage.clickOnMyAccountLink();
		registerPage.clickOnRegisterLink();
		registerPage.enterFirstName(prop.getProperty("firstName"));
		registerPage.enterLastName(prop.getProperty("lastName"));
		registerPage.enterEmail(NinjaHybrid_Utilities.generateRegistrationEmailWithTimeStamp());
		registerPage.enterTelephoneNumber(prop.getProperty("telephoneNumber"));
		registerPage.enterPassword(prop.getProperty("registrationPassword"));
		registerPage.enterPasswordConfirmation(prop.getProperty("registrationPassword"));
		registerPage.clickOnPrivacyPolicyStatement();
		registerPage.clickOnContinueButton();
		
		WebElement AccountCreationMessage = registerPage.AccountCreationMessage(); 
		softassert.assertTrue(AccountCreationMessage.isDisplayed(), "AccountCreationMessage is not displayed");
		softassert.assertAll();
		
		if(AccountCreationMessage.isDisplayed()) {
			System.out.println("Register with Required Fields is functional");
		}else {
			System.out.println("Register with Required Fields is not functional");
		}
	}
	@Test(priority =2)
	public void registerWithAllFields() {
		HybridNinja_Register_Page registerPage = new HybridNinja_Register_Page(driver);
		registerPage.clickOnMyAccountLink();
		registerPage.clickOnRegisterLink();
		registerPage.enterFirstName(prop.getProperty("firstName"));
		registerPage.enterLastName(prop.getProperty("lastName"));
		registerPage.enterEmail(NinjaHybrid_Utilities.generateRegistrationEmailWithTimeStamp());
		registerPage.enterTelephoneNumber(prop.getProperty("telephoneNumber"));
		registerPage.enterPassword(prop.getProperty("registrationPassword"));
		registerPage.enterPasswordConfirmation(prop.getProperty("registrationPassword"));
		
		List<WebElement>NewsLetterRadioButton = registerPage.NewsLetterButton(); 
		for(int i=0; i<NewsLetterRadioButton.size(); i++) {
			if(NewsLetterRadioButton.get(i).getAttribute("value").equalsIgnoreCase("1")) {
			NewsLetterRadioButton.get(i).click();
			break;
			}
			
			registerPage.clickOnPrivacyPolicyStatement();
			registerPage.clickOnContinueButton();
			
			WebElement AccountCreationMessage = registerPage.AccountCreationMessage(); 
			softassert.assertTrue(AccountCreationMessage.isDisplayed(), "AccountCreationMessage is not displayed");
			softassert.assertAll();
			
			if(AccountCreationMessage.isDisplayed()) {
				System.out.println("Register with All Fields is functional");
			}else {
				System.out.println("Register with All Fields is not functional");
			}
		}
	}
	@Test(priority =3)
	public void RegisterWithoutAnyDetails() {
		HybridNinja_Register_Page registerPage = new HybridNinja_Register_Page(driver);
		registerPage.clickOnMyAccountLink();
		registerPage.clickOnRegisterLink();
		registerPage.clickOnContinueButton();
		
		WebElement PrivacyPolicyMessage = registerPage.PrivacyPolicyMessage(); 
		softassert.assertTrue(PrivacyPolicyMessage.isDisplayed(), "PrivacyPolicyMessage is not displayed");
		softassert.assertAll();
		
		WebElement FirstNameMessage = registerPage.FirstNameMessage(); 
		softassert.assertTrue(FirstNameMessage.isDisplayed(), "FirstNameMessage is not displayed");
		softassert.assertAll();
		
		WebElement LastNameMessage = registerPage.LastNameMessage(); 
		softassert.assertTrue(LastNameMessage.isDisplayed(), "LastNameMessage is not displayed");
		softassert.assertAll();
		
		WebElement EmailMessage = registerPage.EmailMessage(); 
		softassert.assertTrue(EmailMessage.isDisplayed(), "EmailMessage is not displayed");
		softassert.assertAll();
		
		WebElement TelephoneMessage = registerPage.TelephoneMessage(); 
		softassert.assertTrue(TelephoneMessage.isDisplayed(), "TelephoneMessage is  not displayed");
		softassert.assertAll();
		
		WebElement PasswordMessage = registerPage.PasswordMessage(); 
		softassert.assertTrue(PasswordMessage.isDisplayed(), "PasswordMessage is  not displayed");
		softassert.assertAll();
		
		if(PrivacyPolicyMessage.isDisplayed() && FirstNameMessage.isDisplayed() && LastNameMessage.isDisplayed() && EmailMessage.isDisplayed() && TelephoneMessage.isDisplayed() && PasswordMessage.isDisplayed()){
			System.out.println("Register without any fields is behaving as expected");
		}else {
			System.out.println("Register without any fields is not behaving as expected");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		
		
		
			
			
		}
		
		
		
		
		
		
	{

}
}

