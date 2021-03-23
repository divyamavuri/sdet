package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlchemyJobs {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^User is on Alchemy Jobs page$")
	public void navigateToAlchemyJobsPage() {

		//My local already has webdrivers at other location, so setting property
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");

		//Setup instances
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);

		//Open browser
		driver.get("https://alchemy.hguy.co/jobs/");
	}
	
	@When("^User clicks on Jobs$")
	public void clicksOnJobs() {
		
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
	}
	
	@Then("^Enter searchterm IBM in search input field$")
	public void enterSearchTerm() {
		driver.findElement(By.xpath("//*[@id='job_type_full-time']")).sendKeys("IBM");
	}
	
	@Then("^Verify full time Jobs filter is selected$")
	public void verifyFullTimeJobsFilterIsChecked()
	{
		driver.findElement(By.id("job_type_full-time")).isSelected();
	}
	
	@Then("^Click on any Job in list$")
	public void clickOnAnyJobInList() {
		driver.findElement(By.xpath("//*[@class = 'job_listings']/li/a")).click();
	}
	
	@And("^Find the title of the job and print it$")
	public void getJobTitle() {
		String jobTitle = driver.findElement(By.id("entry-title")).getText();
		System.out.println("Job Title :"+jobTitle);
	}
	
	@Then("^Click on Apply for Job$")
	public void clickOnApplyForJobButton() {
		driver.findElement(By.xpath("//*[@value = 'Apply for job']")).click();
	}
}
