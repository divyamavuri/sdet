package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {
		//ctrl+shift+O for importing all in 1 go

		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Open the browser
		driver.navigate().to("https://training-support.net/selenium/tables");

		System.out.println(" pageTitle = "+driver.getTitle());

		List<WebElement> columns = driver.findElements(By.xpath("//table[@class = 'ui celled striped table']//tr[1]/td"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'ui celled striped table']/tbody/tr"));
		
		System.out.println("No of Rows :"+rows.size());
		System.out.println("No of Column : "+columns.size());
		
		//Get third row values and print them
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }
 
        //Cell value of second row, second column
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
 

		//Close the browser
		driver.close();

	}

}
