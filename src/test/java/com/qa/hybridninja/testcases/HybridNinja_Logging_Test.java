package com.qa.hybridninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Login_Page;
import com.qa.hybridninja.testdata.HybridNinja_TestData_Supply;
import com.qa.ninjahybrid.utilities.NinjaHybrid_Utilities;

public class HybridNinja_Logging_Test extends Hybrid_Ninja_TestBase {
	public HybridNinja_Logging_Test() throws Exception {
		super();

	}

	public static WebDriver driver;
	public static ChromeOptions options;
	public static SoftAssert softassert = new SoftAssert();
	

	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(prop.getProperty("browserName1"));

	}

	@Test(priority = 1, dataProvider = "NinjaDataProvider_DataSupply", dataProviderClass = HybridNinja_TestData_Supply.class)
	public void loginWithValidCredentialsUsingDataProvider(String UserName, String Password) {
		HybridNinja_Login_Page loginPage = new HybridNinja_Login_Page(driver);
		loginPage.clickOnMyAccountLink();
		loginPage.clickOnLoginLink();
		loginPage.enterUsername(UserName);
		loginPage.enterPassword(Password);
		loginPage.clickOnLoginButton();
		
        WebElement MyAccountDisplay = loginPage.myAccountName(); 
		softassert.assertTrue(MyAccountDisplay.isDisplayed(), "MyAccountDisplay is not displayed");
		softassert.assertAll();

		if (MyAccountDisplay.isDisplayed()) {
			System.out.println("Log In With Valid Credentials is Functional");
		} else {
			System.out.println("Log In With Valid Credentials is not Functional");
		}
	}
	@Test(priority =2, dataProvider = "NinjaExcelDataWithDataProvider", dataProviderClass = HybridNinja_TestData_Supply.class )
	public void loginWithValidCredentialsUsingExcelSheetDataSupply(String UserName, String Password) {
		HybridNinja_Login_Page loginPage = new HybridNinja_Login_Page(driver);
		loginPage.clickOnMyAccountLink();
		loginPage.clickOnLoginLink();
		loginPage.enterUsername(UserName);
		loginPage.enterPassword(Password);
		loginPage.clickOnLoginButton();
		
		WebElement MyAccountDisplay = loginPage.myAccountName();
		softassert.assertTrue(MyAccountDisplay.isDisplayed(), "MyAccountDisplay is not displayed");
		softassert.assertAll();

		if (MyAccountDisplay.isDisplayed()) {
			System.out.println("Log In With Valid Credentials is Functional");
		} else {
			System.out.println("Log In With Valid Credentials is not Functional");
		}
		
	}
    @Test(priority = 3)
	public void loginWithInvalidCredentials() {
    	HybridNinja_Login_Page loginPage = new HybridNinja_Login_Page(driver);
    	loginPage.clickOnMyAccountLink();
		loginPage.clickOnLoginLink();
		loginPage.enterUsername(NinjaHybrid_Utilities.generateEmailWithTimeStamp());
		loginPage.enterPassword(NinjaHybrid_Utilities.generatePasswordWithTimeStamp());
		loginPage.clickOnLoginButton();
    	
		WebElement InvalidCredentialsMessage = loginPage.invalidCredentialsMessage(); 
		softassert.assertTrue(InvalidCredentialsMessage.isDisplayed(), "InvalidCredentialsMessage is not displayed");
		softassert.assertAll();

		if (InvalidCredentialsMessage.isDisplayed()) {
			System.out.println("Log In With Invalid Credentials is Behaving as Expected");
		} else {
			System.out.println("Log In With Invalid Credentials is not Behaving as Expected");
		}
	}
    @Test(priority = 4)
	public void loginWithValidUsernameInvalidPassword() {
    	HybridNinja_Login_Page loginPage = new HybridNinja_Login_Page(driver);
    	loginPage.clickOnMyAccountLink();
		loginPage.clickOnLoginLink();
		loginPage.enterUsername(prop.getProperty("validUsername"));
		loginPage.enterPassword(NinjaHybrid_Utilities.generatePasswordWithTimeStamp());
		loginPage.clickOnLoginButton();
    	
		WebElement InvalidUsernameMessage = loginPage.invalidUsernameMessage();//driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
		softassert.assertTrue(InvalidUsernameMessage.isDisplayed(), "InvalidUsernameMessage is not displayed");
		softassert.assertAll();

		if (InvalidUsernameMessage.isDisplayed()) {
			System.out.println("Log In With Valid Username Invalid Password is Behaving as Expected");
		} else {
			System.out.println("Log In With Valid Username Invalid Password is not Behaving as Expected");
		}
	}
    @Test(priority = 5)
	public void loginWithInvalidUsernameValidPassword() {
    	HybridNinja_Login_Page loginPage = new HybridNinja_Login_Page(driver);
    	loginPage.clickOnMyAccountLink();
		loginPage.clickOnLoginLink();
		loginPage.enterUsername(NinjaHybrid_Utilities.generateEmailWithTimeStamp());
		loginPage.enterPassword(prop.getProperty("validPassword"));
		loginPage.clickOnLoginButton();
		
        WebElement InvalidPasswordMessage = loginPage.invalidUsernameMessage(); 
		softassert.assertTrue(InvalidPasswordMessage.isDisplayed(), "InvalidPasswordMessage is not displayed");
		softassert.assertAll();

		if (InvalidPasswordMessage.isDisplayed()) {
			System.out.println("Log In With Invalid Username Valid Password is Behaving as Expected");
		} else {
			System.out.println("Log In With Invalid Username Valid Password is not Behaving as Expected");
		}
	}

	@Test(priority = 6)
	public void loginWithNoCredentials() {
		HybridNinja_Login_Page loginPage = new HybridNinja_Login_Page(driver);
		loginPage.clickOnMyAccountLink();
		loginPage.clickOnLoginLink();
		loginPage.enterUsername("");
		loginPage.enterPassword("");
		loginPage.clickOnLoginButton();
		
		WebElement NoCredentialsMessage = loginPage.noCredentialsMessage(); //driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
		softassert.assertTrue(NoCredentialsMessage.isDisplayed(), "NoCredentialsMessage is not displayed");
		softassert.assertAll();

		if (NoCredentialsMessage.isDisplayed()) {
			System.out.println("Log In With No Credentials is Behaving as Expected");
		} else {
			System.out.println("Log In With No Credentials is not Behaving as Expected");
		}
	}
    @AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
