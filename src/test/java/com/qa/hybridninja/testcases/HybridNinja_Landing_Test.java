package com.qa.hybridninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Landing_Page;

public class HybridNinja_Landing_Test extends Hybrid_Ninja_TestBase {

	public HybridNinja_Landing_Test() throws Exception {
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
	public void validatePageTitleAndUrl() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String actualTitle = prop.getProperty("title");
		String expectedecTitle = driver.getTitle();

		String actualCurrentUrl = prop.getProperty("url");
		String expectedCurrentUrl = driver.getCurrentUrl();

		if (actualTitle.equals(expectedecTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("The Page is Valid and Functional.");
		} else {
			System.out.println("The Page is not Valid and Functional.");
		}
	}

	@Test(priority = 2)
	public void presenceOfQAFoxLink() {
		HybridNinja_Landing_Page landingPage = new HybridNinja_Landing_Page(driver);
		WebElement qaFoxLink = landingPage.QaFoxLink(); 
		if (qaFoxLink.isDisplayed()) {
			qaFoxLink.click();
			System.out.println("QA Fox Link is Displayed and Enabled making the Landing Page valid.");
		} else {
			System.out.println("QA Fox Link is not Displayed and not Enabled making the Landing Page invalid.");
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
