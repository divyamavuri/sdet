package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		//ctrl+shift+O for importing all in 1 go
		
		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
		
		 //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net");
        
        String pageTitle = driver.getTitle();
        
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text of element using Id locator : "+idLocator.getText());
        
        WebElement classLocator = driver.findElement(By.className("green"));
        System.out.println("Text of element using class locator : "+classLocator.getText());

        WebElement linkText = driver.findElement(By.linkText("About Us"));
        System.out.println("Text of element using link text locator : "+linkText.getText());

        WebElement cssSelector = driver.findElement(By.cssSelector("a.green"));
        System.out.println("Text of element using cssSelector locator : "+cssSelector.getText());
       
        //Close the browser
        driver.close();

	}

}
