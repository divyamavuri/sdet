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

public class Activity3 {
	WebDriver driver;


	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Create WebDriver instance
		driver = new FirefoxDriver();

		//Open browser
		driver.get("https://www.training-support.net/selenium/login-form");


	}
	
	@Test
    public void loginTest() {
        //Find the username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        
        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        
        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}