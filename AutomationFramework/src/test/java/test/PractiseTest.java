package test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PractiseTest extends Base {
	private String testData;
	
	@DataProvider(name="dataProvider")
	public Object[][] dataProvider() {
		return new Object[][] {{"test"}};
	}
	
	@Factory
	public void Base(String testData) {
		this.testData = testData;
	}
	
	@BeforeMethod
	public void setUp() {
		initialiseWebDriver();
		initialiseApplicationURL();
		driver.get(applicationURL);
	}
	
	@AfterMethod
	public void cleanUp() {
		quitWebDriver();
	}
	
	@Test
	public void practiseTest() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(testData);
		
	}

}
