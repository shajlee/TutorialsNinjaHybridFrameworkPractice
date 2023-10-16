package com.qa.hybridninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridNinja_Links_Page {
	public WebDriver driver;
	
	@FindBy(linkText = "Desktops")
	private WebElement DeskTopLink;
	
	@FindBy(linkText = "Show AllDesktops")
	private WebElement ShowAllDesktopsLink;
	
	@FindBy(css = "div#content h2")
	private WebElement DesktopIcon;
	
	@FindBy(xpath = "//a[text() = 'Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksLink;
	
	@FindBy(xpath = "//a[text() = 'Show AllLaptops & Notebooks']")
	private WebElement ShowAllLaptopsAndNoteBooksLink;
	
	@FindBy(css = "div#content h2")
	private WebElement LaptopsAndNotebookIcon;
	
	@FindBy(xpath = "//a[text() = 'Components']")
	private WebElement ComponentsLink;
	
	@FindBy(xpath = "//a[text() = 'Show AllComponents']")
	private WebElement ShowAllComponentsLink;
	
	@FindBy(css = "div#content h2")
	private WebElement ComponentsIcon;
	
	@FindBy(xpath = "//a[text() = 'Tablets']")
	private WebElement TabLetsLink;
	
	@FindBy(css = "div#content h2")
	private WebElement TablentsIcon;
	
	@FindBy(xpath = "//a[text() = 'Software']")
	private WebElement SoftWareLink;
	
	@FindBy(css = "div#content h2")
	private WebElement SoftWareIcon;
	
	@FindBy(xpath = "//a[text() = 'Phones & PDAs']")
	private WebElement PhoneAndPDASLink;
	
	@FindBy(css = "div#content h2")
	private WebElement PhonesAndPDASIcon;
	
	@FindBy(xpath = "//a[text() = 'Cameras']")
	private WebElement CamerasLink;
	
	@FindBy(css = "div#content h2")
	private WebElement CameraIcon;
	
	@FindBy(xpath = "//a[text() = 'MP3 Players']")
	private WebElement MP3PlayersIcon;
	
	@FindBy(xpath = "//a[text() = 'Show AllMP3 Players']")
	private WebElement ShowAllMP3Players;
	
	@FindBy(css = "div#content h2")
	private WebElement MP3Icon;
	
	public HybridNinja_Links_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnDeskTopLink() {
		DeskTopLink.click();
	}
	public WebElement DesktopLink() {
		return DeskTopLink;
	}
	public WebElement ShowAllDesktops() {
		return ShowAllDesktopsLink;
	}
	public WebElement DeskTopIcon() {
		return DesktopIcon;
	}
	public WebElement LaptopsAndNotebooksLink() {
		return LaptopsAndNotebooksLink;
	}
	public WebElement ShowAllLaptopsAndNotebooksLink() {
		return ShowAllLaptopsAndNoteBooksLink;
	}
	public WebElement LaptopsAndNotebookIcon() {
		return LaptopsAndNotebookIcon;
	}
	public WebElement ComponentsLink() {
		return ComponentsLink;
	}
	public WebElement ShowAllComponentsLink() {
		return ShowAllComponentsLink;
	}
	public WebElement ComponentsIcon() {
		return ComponentsIcon;
	}
	public void clickOnTabLetsLink() {
		TabLetsLink.click();
	}
	public WebElement TablentsIcon() {
		return TablentsIcon;
	}
	public void clickOnSoftWareLink() {
		SoftWareLink.click();
	}
	public WebElement SoftWareIcon() {
		return SoftWareIcon;
	}
	public void clickOnPhoneAndPDASLink() {
		PhoneAndPDASLink.click();
	}
	public WebElement PhonesAndPDASIcon() {
		return PhonesAndPDASIcon;
	}
	public void clickOnCamerasLink() {
		CamerasLink.click();
	}
	public WebElement CameraIcon() {
		return CameraIcon;
	}
	public WebElement MP3PlayersLink() {
		return MP3PlayersIcon;
	}
	public WebElement ShowAllMP3Players() {
		return ShowAllMP3Players;
	}
	public WebElement MP3Icon() {
		return MP3Icon;
		
	
	
		
	}

}
