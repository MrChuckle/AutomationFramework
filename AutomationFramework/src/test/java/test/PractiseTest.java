package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PractiseTest {
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
		
	}
	
	@AfterMethod
	public void cleanUp() {
		
	}
	
	@Test
	public void base() {
		
	}

}
