package HRM_Project;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2_headerImg {
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
		
		//Get the url of the header image.
		String imageUrl = driver.findElement(By.xpath("//div[@id='divLogo']/img")).getAttribute("src");
		
		Reporter.log("Header Image Link : "+imageUrl);
		
		
	}

	@AfterClass
	public void afterClass() {
		
		//close the browser.
		driver.close();
	}
}
