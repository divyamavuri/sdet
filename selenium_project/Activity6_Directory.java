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

public class Activity6_Directory {
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
			
		
		WebElement saveButton =driver.findElement(By.id("btnSave"));
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		//To Click on My Info 
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		
		//To click on Edit button.
		saveButton.click();
		
		WebElement edit_firstname = driver.findElement(By.id("personal_txtEmpFirstName"));
		WebElement edit_lastname = driver.findElement(By.id("personal_txtEmpLastName"));
		WebElement gender_female = driver.findElement(By.xpath("//input[@id ='personal_optGender_2']"));

		Select nation = new Select( driver.findElement(By.id("personal_cmbNation")));
		
		edit_firstname.sendKeys("Divya");
		edit_lastname.sendKeys("mavuri");
		gender_female.click();
		
		nation.selectByVisibleText("Indian");
		
		saveButton.click();
		
		
	}
	

	@AfterClass
	public void afterClass() {
		
		//close the browser.
		driver.close();
	}
	
}
