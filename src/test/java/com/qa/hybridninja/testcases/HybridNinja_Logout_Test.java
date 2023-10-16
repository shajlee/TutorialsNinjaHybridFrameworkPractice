package com.qa.hybridninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Logout_Page;

public class HybridNinja_Logout_Test extends Hybrid_Ninja_TestBase {
	public HybridNinja_Logout_Test() throws Exception {
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
	public void logoutTest() {
		HybridNinja_Logout_Page logOutPage = new HybridNinja_Logout_Page(driver);
		logOutPage.clickOnMyAccountLink();
		logOutPage.clickOnLoginLink();
		logOutPage.enterUsername(prop.getProperty("validUsername"));
		logOutPage.enterPassword(prop.getProperty("validPassword"));
		logOutPage.clickOnLoginButton();
		logOutPage.clickOnLogOutButton();
		
		WebElement LogOutMessage = logOutPage.LogOutMessage(); //driver.findElement(By.cssSelector("div#content h1+p"));
		softassert.assertTrue(LogOutMessage.isDisplayed(), "LogOutMessage is not displayed");
		softassert.assertAll();
		
		if(LogOutMessage.isDisplayed()) {
			System.out.println("Logout page is fucntional");
		}else {
			System.out.println("Logout page is not fucntional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
		

}

