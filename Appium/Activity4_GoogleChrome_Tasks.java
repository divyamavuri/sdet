package AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4_GoogleChrome_Tasks {

	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setup() throws MalformedURLException {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4APIEmulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");
		caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 5);
	}

	@Test
	public void reminderNote() throws InterruptedException {
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"To-Do List\"))"));
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"To-Do List Elements get added at run time\"]/android.view.View[1]/android.widget.TextView")).click();
		Thread.sleep(1000);

		String Task[] = {"Add tasks to list",
						"Get number of tasks",
						"Clear the list"};
		int i;
		for(i=0; i<3; i++) {


			wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")));
			driver.findElement(By.xpath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")).sendKeys(Task[i]);
			driver.findElement(By.xpath("//android.view.View[3]/android.view.View[1]/android.widget.Button")).click();
			Thread.sleep(500);
			MobileElement T1=driver.findElement(By.xpath("//android.view.View[3]/android.view.View[2]/android.view.View"));

			Assert.assertEquals(T1.getText(),Task[i]);
			T1.click();

		}
	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

}
