package com.qa.hybridninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Inbox_Page;

public class HybridNinja_Inbox_Test extends Hybrid_Ninja_TestBase {
	public HybridNinja_Inbox_Test() throws Exception {
		super();
		
	}
	public static WebDriver driver;
	public static ChromeOptions options;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(prop.getProperty("browserName1"));
		
	}
	@Test
	public void validLogin() {
		HybridNinja_Inbox_Page inboxPage = new HybridNinja_Inbox_Page(driver);
		inboxPage.clickOnMyAccountLink();
		inboxPage.clickOnLoginLink();
		inboxPage.enterUsername(prop.getProperty("validUsername"));
		inboxPage.enterPassword(prop.getProperty("validPassword"));
		inboxPage.clickOnLoginButton();
		
		WebElement MyAccountDisplay = inboxPage.myAccountName();
		softassert.assertTrue(MyAccountDisplay.isDisplayed(), "MyAccountDisplay is not displayed");
		softassert.assertAll();
			
		if(MyAccountDisplay.isDisplayed()) {
			System.out.println("Inbox Page is Functional");
		}else {
			System.out.println("Inbox Page is not Functional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
			}
		
	}
	


