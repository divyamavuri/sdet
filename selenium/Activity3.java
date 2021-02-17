package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		//ctrl+shift+O for importing all in 1 go
		
		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
		
		 //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        
        System.out.println("Title of page :"+driver.getTitle());
        
        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        WebElement emailTextBox = driver.findElement(By.xpath(".//*[@type = 'email']"));
        WebElement contactTextBox = driver.findElement(By.xpath(".//*[@type = 'tel']"));

        firstNameTextBox.sendKeys("Divya");
        lastNameTextBox.sendKeys("M");
        emailTextBox.sendKeys("mail@mail.com");
        contactTextBox.sendKeys("9876543210");
        
        WebElement submitButton = driver.findElement(By.className("green"));

        Thread.sleep(5000);
        submitButton.click();
        
        driver.close();
        

       
        //Close the browser
        driver.close();

	}

}
