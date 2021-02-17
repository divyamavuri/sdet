package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acitivity4_3 {

	public static void main(String[] args) {
		//ctrl+shift+O for importing all in 1 go
		
		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
		
		 //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
        
        System.out.println("Title of page :"+driver.getTitle());

        //To Find the third header on the page.
        WebElement thirdHeader = driver.findElement(By.id("third-header"));
        
        //Find the fifth header on the page and get it's 'colour' CSS Property.
        WebElement fifthHeader = driver.findElement(By.className("green"));
        
        System.out.println("Fifth header color : "+fifthHeader.getCssValue("color"));
        
        //Find the violet button on the page and print all the class attribute values.
        WebElement violetButton = driver.findElement(By.xpath("//button[@class = 'ui violet button']"));
        
        System.out.println("violet button class : "+violetButton.getAttribute("class"));
        
        //Find the grey button on the page with Absolute XPath.
        WebElement greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        
        System.out.println("Text of grey Button : "+greyButton.getText());
        
        
        //Close the browser
        driver.close();

	}

}
