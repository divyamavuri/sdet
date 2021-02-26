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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4_AddEmployee {
	WebDriver driver;
	WebDriverWait wait;
	
	Actions Act;

	@BeforeClass
	public void beforeClass() {


		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		
		wait = new WebDriverWait(driver, 10);
		Act = new Actions(driver);

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
		
		Reporter.log("script add new employee");
		
		//Find the PIM option in the menu and click it.
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		Act.moveToElement(PIM).click().build().perform();
		Thread.sleep(10000);
		
		//Click the Add button to add a new Employee.
		driver.findElement(By.xpath("//*[@id='btnAdd']")).click();
		
		Thread.sleep(6000);
		
		// Fill in the required fields and click Save.
		WebElement firstname = driver.findElement(By.name("firstName"));
		WebElement lastname = driver.findElement(By.name("lastName"));
		WebElement saveButton =driver.findElement(By.id("btnSave"));
		
		firstname.sendKeys("Diya");
		lastname.sendKeys("M");

		saveButton.click();
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	}
	

	@AfterClass
	public void afterClass() {
		
		//close the browser.
		driver.close();
	}
	
}
