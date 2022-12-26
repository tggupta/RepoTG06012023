package Test.PractMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeBrowser2 {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static void initialzeDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());		
	}
	
	public static WebDriver getWebDriver() {
		return driver.get();
	}

}
