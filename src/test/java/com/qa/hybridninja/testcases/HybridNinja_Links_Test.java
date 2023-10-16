package com.qa.hybridninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.hybridninja.base.Hybrid_Ninja_TestBase;
import com.qa.hybridninja.pages.HybridNinja_Links_Page;

public class HybridNinja_Links_Test extends Hybrid_Ninja_TestBase {
	public HybridNinja_Links_Test() throws Exception {
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
	public void linkTests() throws Exception {
		HybridNinja_Links_Page linksPage = new HybridNinja_Links_Page(driver);
		linksPage.clickOnDeskTopLink();
		
		Actions actions = new Actions(driver);
		
		WebElement desktopLink = linksPage.DesktopLink(); 
		WebElement showalldesktopsLink = linksPage.ShowAllDesktops(); 
		
		actions.moveToElement(desktopLink).perform();
		actions.click(showalldesktopsLink).perform();
		
		WebElement desktopIcon = linksPage.DeskTopIcon(); 
		softassert.assertTrue(desktopIcon.isDisplayed());
		softassert.assertAll();
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement laptopsandnotebooksLink = linksPage.LaptopsAndNotebooksLink(); 
		WebElement showalllaptopsLink = linksPage.ShowAllLaptopsAndNotebooksLink(); 
		
		actions.moveToElement(laptopsandnotebooksLink).perform();
		actions.click(showalllaptopsLink).perform();
		
		WebElement laptopsIcon = linksPage.LaptopsAndNotebookIcon(); 
		softassert.assertTrue(laptopsIcon.isDisplayed());
		softassert.assertAll();
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement componentsLink = linksPage.ComponentsLink(); 
		WebElement showallcomponentsLink = linksPage.ShowAllComponentsLink(); 
		
		actions.moveToElement(componentsLink).perform();
		actions.click(showallcomponentsLink).perform();
		
		WebElement componentsIcon = linksPage.ComponentsIcon(); 
		softassert.assertTrue(componentsIcon.isDisplayed());
		softassert.assertAll();
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		linksPage.clickOnTabLetsLink();
		
        WebElement TabletsIcon = linksPage.TablentsIcon(); 
		softassert.assertTrue(TabletsIcon.isDisplayed());
		softassert.assertAll();
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		linksPage.clickOnSoftWareLink();
		
		WebElement softwareIcon = linksPage.SoftWareIcon(); 
		softassert.assertTrue(softwareIcon.isDisplayed());
		softassert.assertAll();
			
		driver.navigate().back();
		Thread.sleep(1000);
		
		linksPage.clickOnPhoneAndPDASLink();
		
		WebElement phonesIcon = linksPage.PhonesAndPDASIcon(); 
		softassert.assertTrue(phonesIcon.isDisplayed());
		softassert.assertAll();
			
		driver.navigate().back();
		Thread.sleep(1000);
		
		linksPage.clickOnCamerasLink();
		
		WebElement cameraIcon = linksPage.CameraIcon(); 
		softassert.assertTrue(cameraIcon.isDisplayed());
		softassert.assertAll();
			
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement mp3Link = linksPage.MP3PlayersLink(); 
		WebElement showallmp3Link = linksPage.ShowAllMP3Players(); 
		
		actions.moveToElement(mp3Link).perform();
		actions.click(showallmp3Link).perform();
		
		WebElement Mp3Icon = linksPage.MP3Icon(); 
		softassert.assertTrue(Mp3Icon.isDisplayed());
		softassert.assertAll();
		
		driver.navigate().back();
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
