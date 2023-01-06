package Test.PractMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase extends ExtentReport {

	static WebDriver driver;

/*	@BeforeTest
	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarungupta02\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions optionsBeta = new ChromeOptions();
		optionsBeta.setBinary("C:\\Users\\tarungupta02\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");  
		driver = new ChromeDriver();

	}*/

	
	//@BeforeTest
	public void initiateDriver() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\tarungupta02\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();

	}
	
	//@AfterTest
	public void closeBrowser() {
		driver.close();
//		closeReport();
	}

}
