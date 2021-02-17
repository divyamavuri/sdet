package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acitivity5_1 {

	public static void main(String[] args) {
		//ctrl+shift+O for importing all in 1 go
		
		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
		
		 //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        
        System.out.println("Title of page :"+driver.getTitle());

        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        driver.findElement(By.name("toggled")).click();
        
        driver.findElement(By.id("toggleCheckbox")).click();
        
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
       
        //Close the browser
        driver.close();

	}

}
