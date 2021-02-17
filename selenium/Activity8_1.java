package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

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

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr[1]/td"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr"));

		System.out.println("No of Rows :"+rows.size());
		System.out.println("No of Column : "+columns.size());

		//Find and print the cell value at the second row and second column
		String secRowsecColumnData = driver.findElement(By.xpath("//table[@id= 'sortableTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println("sec Row Sec CLomn data before sorting : "+secRowsecColumnData);

		//Click the header of the first column to sort by name

		driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[1]")).click();


		//Find and print the cell value at the second row and second column
		String secRowsecColumnData2 = driver.findElement(By.xpath("//table[@id= 'sortableTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println("sec Row Sec CLomn data After sorting : "+secRowsecColumnData2);

		//Print footer cell value
		WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		System.out.println("Table footer values: " + footer.getText());


		//Close the browser
		driver.close();

	}

}
