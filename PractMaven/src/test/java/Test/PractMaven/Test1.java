package Test.PractMaven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 extends TestBase  {	

	@Test
	public void verifyTest1() {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		/*driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Assert.assertEquals(driver.getTitle(), "Google", "Test Pass");*/
		System.out.println("Class name is - Test1 :: Method 1");

	}

	@Test
	public void verifyTest2() {
		System.out.println("Class name is - Test2 :: Method 2");
	}
	
	@Test
	public void verifyTest3() {
		System.out.println("Class name is - Test3 :: Method 3");
	}
	
}
