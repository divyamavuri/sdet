package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		//ctrl+shift+O for importing all in 1 go

		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Open the browser
		driver.navigate().to("https://training-support.net/selenium/ajax");

		System.out.println(" pageTitle = "+driver.getTitle());

		WebElement changeContentButton = driver.findElement(By.xpath("//*[@id='ajax-content']/button"));
		changeContentButton.click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='ajax-content']/h1"), "HELLO!"));

		//getText() and print it
		String ajaxText = driver.findElement(By.xpath("//*[@id='ajax-content']/h1")).getText();
		System.out.println(ajaxText);

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='ajax-content']/h3"), "I'm late!"));

		//getText() and print it
		String lateText = driver.findElement(By.xpath("//*[@id='ajax-content']/h3")).getText();
		System.out.println(lateText);

		//Close the browser
		driver.close();

	}

}
