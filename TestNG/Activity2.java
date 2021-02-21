package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

	@Test
	public void tc01() {

		// Check the title of the page
		String title = driver.getTitle();

		//Print the title of the page
		System.out.println("Page title is: " + title);


	}

	@Test
	public void tc02() {


		WebElement blackbutton = driver.findElement(By.className("black"));
		//Assertion to throw failure.
		Assert.assertTrue(blackbutton.isSelected());

		//Find the clickable link on the page and click it
		driver.findElement(By.id("about-link")).click();

		//Print title of new page
		System.out.println("New page title is: " + driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}

	@Test(enabled = false)
	public void tc03() {
		System.out.println("Test case skippied");
	}


	@Test
	public void tc04()
	{
		throw new SkipException("Skipping TC");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Create WebDriver instance
		driver = new FirefoxDriver();

		//Open browser
		driver.get("https://www.training-support.net/selenium/target-practice");


	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
