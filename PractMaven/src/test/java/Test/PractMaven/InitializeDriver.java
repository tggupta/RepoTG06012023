package Test.PractMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeDriver {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());		
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void closeDriver() {
		driver.get().close();
	}
	
}
