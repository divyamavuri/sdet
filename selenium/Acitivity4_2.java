package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acitivity4_2 {

	public static void main(String[] args) throws InterruptedException {
		//ctrl+shift+O for importing all in 1 go
		
		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
		
		 //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        
        System.out.println("Title of page :"+driver.getTitle());
        
        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@id='lastName']"));
        WebElement emailTextBox = driver.findElement(By.xpath(".//input[@id = 'email']"));
        WebElement contactTextBox = driver.findElement(By.xpath(".//input[@id = 'number']"));

        firstNameTextBox.sendKeys("Divya");
        lastNameTextBox.sendKeys("M");
        emailTextBox.sendKeys("mail@mail.com");
        contactTextBox.sendKeys("9876543210");
        
        System.out.println("entered all fiedls in form");
        Thread.sleep(5000);

        driver.findElement(By.xpath(".//input[contains(@class , 'green button')]")).click();

        
        //Close the browser
        driver.quit();

	}

}
