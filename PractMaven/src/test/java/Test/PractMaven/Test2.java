package Test.PractMaven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 extends TestBase {

	@Test
	public void verifypageTitle() {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */
/*		driver.get("https://webdriver.io/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Assert.assertEquals(driver.getTitle(),
				"WebdriverIO · Next-gen browser and mobile automation test framework for Node.js | WebdriverIO",
				"Test Pass");*/

		System.out.println("Class name is - Test2");
		
	}

}
