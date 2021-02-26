package HRM_Project;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1_title {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {


		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		//Open browser and navigate to website
		driver.get("http://alchemy.hguy.co/orangehrm");

	}

	@Test
	public void test01() {
		//Get the title of the website.
		String actualTitle = driver.getTitle();
		
		//To Make sure it matches “OrangeHRM” exactly.
		Assert.assertEquals("OrangeHRM", actualTitle);
		
		// If it matches, close the browser.
		driver.close();
	}

}
