package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		//ctrl+shift+O for importing all in 1 go

		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Open the browser
		driver.navigate().to("https://training-support.net/selenium/dynamic-attributes");

		System.out.println(" pageTitle = "+driver.getTitle());

		WebElement userName = driver.findElement(By.xpath("//input[starts-with(@name , 'name-') and (@type = 'text')]"));
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password')]"));
		
		userName.sendKeys("admin");
		password.sendKeys("password");
		
		driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
		

		WebElement message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		
		message.getText();
		System.out.println(message.getText());

		//Close the browser
		driver.close();

	}

}
