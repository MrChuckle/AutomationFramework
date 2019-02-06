package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ConfigurationManager.config.getProperty("chromeDriver"));
			driver = new ChromeDriver();
			break;
		case "firefox":
			//Set Property Here
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}

}
