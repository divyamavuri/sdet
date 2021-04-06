package AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
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

public class Activity3_GoogleKeep_ReminderNote {

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

		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
		driver.findElementByAccessibilityId("New text note").click();

		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
		driver.findElementById("editable_title").sendKeys("My Reminder Note");
		driver.findElementById("edit_note_text").sendKeys("My Reminder Description");
		driver.findElementById("menu_switch_to_list_view").click();

		driver.findElementByXPath("//android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]").click();
		driver.findElementByAccessibilityId("Open navigation drawer").click();

		driver.findElementByAccessibilityId("Open navigation drawer").click();

		driver.findElementByXPath("//android.widget.LinearLayout/android.widget.TextView[2]").click();


		MobileElement Titlle=driver.findElementById("index_note_title");
		Assert.assertEquals("My Reminder Note", Titlle.getText() );

		MobileElement Desc=driver.findElementById("index_note_text_description");
		Assert.assertEquals("My Reminder Description", Desc.getText() );

	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

}
