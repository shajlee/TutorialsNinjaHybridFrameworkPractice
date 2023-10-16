package com.qa.hybridninja.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.qa.ninjahybrid.utilities.NinjaHybrid_Utilities;

public class Hybrid_Ninja_TestBase {
	public static WebDriver driver;
	public static ChromeOptions OptionsC;
	public static FirefoxOptions OptionsF;
	public static EdgeOptions OptionsE;
	public Properties prop;
	public FileInputStream ip;
	
	public Hybrid_Ninja_TestBase() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\ninjahybrid\\configurations\\configurations.properties");
		prop.load(ip);
	}
	public WebDriver initializeAndOpenBrowser(String browserName) {
		if(browserName.equalsIgnoreCase(prop.getProperty("browserName1"))) {
			OptionsC = new ChromeOptions();
			OptionsC.addArguments("--incognito");
			OptionsC.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new ChromeDriver(OptionsC);
		}else if(browserName.equalsIgnoreCase(prop.getProperty("browserName2"))) {
				OptionsF = new FirefoxOptions();
				OptionsF.addArguments("--incognito");
				OptionsF.setPageLoadStrategy(PageLoadStrategy.EAGER);
				driver = new FirefoxDriver(OptionsF);
			}else if(browserName.equalsIgnoreCase(prop.getProperty("browserName3"))) {
				OptionsE = new EdgeOptions();
				OptionsE.addArguments("--incognito");
				OptionsE.setPageLoadStrategy(PageLoadStrategy.EAGER);
				driver = new EdgeDriver(OptionsE);
			}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NinjaHybrid_Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NinjaHybrid_Utilities.PAGELOAD_WAIT_TIME));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(NinjaHybrid_Utilities.SCRIPTLOAD_TIME));
		driver.manage().deleteAllCookies();
		return driver;
		
				
				
				
			}
	{
	}
	
	
	
	
	}
	

	


