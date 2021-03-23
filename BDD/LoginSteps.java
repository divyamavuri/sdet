package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^User is on Alchemy users page$")
	public void loginPage() {

		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");


		//Setup instances
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);

		//Open browser
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}

	@When("^User enters username and password$")
	public void enterCredentials() {
		//Enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("password");
		//Click Login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void userEntersCredentials(String Username, String Password)
	{
		//Enter username
		driver.findElement(By.id("user_login")).sendKeys(Username);
		//Enter password
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		//Click Login
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
	}
	
	@Then("^Read the page title and confirmation message$")
	public void readTitleAndHeading() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));

		//Read the page title and heading
		String pageTitle = driver.getTitle();
		String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

		//Print the page title and heading
		System.out.println("Page title is: " + pageTitle);
		System.out.println("Login message is: " + confirmMessage);
	}

	@Then("^Click on menu item that says 'Users'$")
	public void clickOnUsersOnMenu() {
		driver.findElement(By.xpath("//a[@href='users.php']")).click();
	}
	
	@Then("^Click on Add New button$")
	public void clickOnAddNewButton() {
		driver.findElement(By.className("page-title-action")).click();
	}
	
	@Then("^Fill necessary details$")
	public void fillNecessaryDetails() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@id = 'user_login']")).sendKeys("divyam");	
		driver.findElement(By.id("email")).sendKeys("dmavuri@mail.com");
		driver.findElement(By.id("first_name")).sendKeys("divya");
		driver.findElement(By.id("last_name")).sendKeys("m");
		driver.findElement(By.id("url")).sendKeys("divya.com");

		Select sl =  new Select(driver.findElement(By.xpath("//*[@id = 'role']")));
		sl.selectByValue("employer");
		
	}
	
	@And("^Click on Add New User button$")
	public void clickOnAddNewUserButton() {
		driver.findElement(By.id("createusersub")).click();
	}
	
	@And("^Close the Browser$")
	public void closeBrowser() {
		//Close browser
		driver.close();
	}

	
}
