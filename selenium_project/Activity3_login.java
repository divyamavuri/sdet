package HRM_Project;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_login {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {


		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		//Open browser and navigate to website
		driver.get("http://alchemy.hguy.co/orangehrm");

	}

	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		
		WebElement inputUserNameFeild = driver.findElement(By.id("txtUsername"));
		WebElement inputPasswordfeild = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
		
		inputUserNameFeild.sendKeys(username);
		inputPasswordfeild.sendKeys(password);
		
		loginButton.click();
		
		WebElement homepageWelcome = driver.findElement(By.id("welcome-menu"));
		
		Assert.assertTrue(homepageWelcome.isDisplayed());
		
		Reporter.log("Logged in Successfully");
		
		
	}

	@AfterClass
	public void afterClass() {
		
		//close the browser.
		driver.close();
	}
}
