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

public class Activity7_adding_qualifications {
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
			
			
		//driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		//To Click on My Info 
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		
			
		WebElement qualifications = driver.findElement(By.xpath("//*[@id='sidenav']/li[9]/a"));
		WebElement addWorkExperienceButton = driver.findElement(By.id("addWorkExperience"));
		WebElement company_textbox = driver.findElement(By.id("experience_employer"));
		WebElement jobTitle_textbox = driver.findElement(By.id("experience_jobtitle"));
		
		WebElement experience_from_date = driver.findElement(By.id("experience_from_date"));
		WebElement experience_to_date = driver.findElement(By.id("experience_to_date"));

		qualifications.click();
		
		Thread.sleep(5000);
		
		addWorkExperienceButton.click();
		
		company_textbox.sendKeys("ABC pvt ltd ");
		jobTitle_textbox.sendKeys("Testspecialist");
		experience_from_date.sendKeys("2011-01-31");
		experience_to_date.sendKeys("2016-05-23");
		
		
		
	}
	

	@AfterClass
	public void afterClass() {
		
		//close the browser.
		driver.close();
	}
	
}
