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

public class Activity8_applyLeave {
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

	@Test
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
			
			
		//driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		//To Click on apply leave
		driver.findElement(By.xpath("//td[4]/div/a")).click();
		
			
		WebElement leaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
		
		Select leaveTypeSelect = new Select(leaveType);
		
		WebElement applyleave_txtFromDate = driver.findElement(By.id("applyleave_txtFromDate"));
		WebElement applyleave_txtToDate = driver.findElement(By.id("applyleave_txtToDate"));

		leaveTypeSelect.selectByValue("1");
		applyleave_txtFromDate.sendKeys("2021-02-21");
		applyleave_txtToDate.sendKeys("2016-02-24");
		
		driver.findElement(By.id("applyBtn")).click();	
		
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		
		
	}
	

	@AfterClass
	public void afterClass() {
		
		//close the browser.
		driver.close();
	}
	
}
