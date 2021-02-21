package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	// Check the title of the page
      String title = driver.getTitle();
          
      //Print the title of the page
      System.out.println("Page title is: " + title);
          
          //Assertion for page title
      Assert.assertEquals("Training Support", title);
                  
      //Find the clickable link on the page and click it
      driver.findElement(By.id("about-link")).click();
                  
      //Print title of new page
      System.out.println("New page title is: " + driver.getTitle());
      
      Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
		
      //Create WebDriver instance
      driver = new FirefoxDriver();
      
      //Open browser
      driver.get("https://www.training-support.net");

	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
