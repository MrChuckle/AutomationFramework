package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import utils.ConfigurationManager;
import utils.DriverManager;

public class Base {
	protected WebDriver driver;
	protected String applicationURL;
	
	protected void initialiseWebDriver() {
		this.driver = DriverManager.getDriver(ConfigurationManager.config.getProperty("browserName"));
	}
	
	protected void quitWebDriver() {
		driver.quit();
	}
	
	protected void initialiseApplicationURL() {
		this.applicationURL = ConfigurationManager.config.getProperty("application");
	}
	
	//Ensures the configuration is loaded before running any tests
	@BeforeSuite
	public void testInitilisation() {
		ConfigurationManager.loadConfig();
	}

}
