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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5_EditUserInfo {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {


		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		wait = new WebDriverWait(driver, 10);

		//Open browser and navigate to website
		driver.get("http://alchemy.hguy.co/orangehrm");

	}

	@Test(priority = 0)
	@Parameters({"username", "password"})
	public void login(String username, String password) throws InterruptedException {

		WebElement inputUserNameFeild = driver.findElement(By.id("txtUsername"));
		WebElement inputPasswordfeild = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));

		inputUserNameFeild.sendKeys(username);
		inputPasswordfeild.sendKeys(password);

		loginButton.click();

		WebElement homepageWelcome = driver.findElement(By.id("welcome-menu"));

		//Assert.assertTrue(homepageWelcome.isDisplayed());

		Reporter.log("Logged in Successfully");


		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

		//To Click on Directory 
		driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();


		WebElement header = driver.findElement(By.xpath("//*[@id='content']/div[1]/div[1]/h1"));

		String headertext = header.getText();

		Assert.assertEquals("Header should match", headertext, "Search Directory");

	}


	@AfterClass
	public void afterClass() {

		//close the browser.
		driver.close();
	}

}
