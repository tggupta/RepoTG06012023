package Test.PractMaven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase extends ExtentReport{
	

	static WebDriver driver;
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		closeReport();
	}
	
}
