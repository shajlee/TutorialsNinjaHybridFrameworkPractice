package com.qa.hybridninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Search_Page;

public class HybridNinja_Search_Test extends Hybrid_Ninja_TestBase {
	public HybridNinja_Search_Test() throws Exception {
		super();
		
	}
	public static WebDriver driver;
	public static ChromeOptions options;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(prop.getProperty("browserName1"));
		
	}
	@Test(priority = 1)
	public void searchWithValidProduct() {
		HybridNinja_Search_Page searchPage = new HybridNinja_Search_Page(driver);
		searchPage.enterValidProductName(prop.getProperty("validProduct"));
		searchPage.clickOnSearchButton();
		
		WebElement ValidProductMessage = searchPage.ValidProductSearchResult();
		softassert.assertTrue(ValidProductMessage.isDisplayed(), "Macbook is not displayed");
		softassert.assertAll();
		
		if(ValidProductMessage.isDisplayed()) {
			System.out.println("Search with Valid Product is functioning as Expected");
		}else {
			System.out.println("Search with Valid Product is not functioning as Expected");
		}
	}
	@Test(priority = 2)
	public void searchWithInvalidProduct() {
		HybridNinja_Search_Page searchPage = new HybridNinja_Search_Page(driver);
		searchPage.enterInvalidProductName(prop.getProperty("invalidProduct"));
		searchPage.clickOnSearchButton();
		
		WebElement InValidProductMessage = searchPage.InValidProductSearchResult(); 
		softassert.assertTrue(InValidProductMessage.isDisplayed(), "InValidProductMessage is not displayed");
		softassert.assertAll();
		
		if(InValidProductMessage.isDisplayed()) {
			System.out.println("Search with Invalid Product is functioning as Expected");
		}else {
			System.out.println("Search with Invalid Product is not functioning as Expected");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		}
	}
	


