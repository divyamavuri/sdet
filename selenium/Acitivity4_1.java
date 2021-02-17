package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acitivity4_1 {

	public static void main(String[] args) throws InterruptedException {
		//ctrl+shift+O for importing all in 1 go

		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		//Open the browser
		driver.get("https://www.training-support.net");

		System.out.println("Title of page :"+driver.getTitle());

		WebElement xpathLocator = driver.findElement(By.xpath(".//*[@id = 'about-link']"));
		xpathLocator.click();

		Thread.sleep(3000);

		System.out.println("Title of new page :"+driver.getTitle());



		//Close the browser
		driver.close();

	}

}
