package AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1_GoogleTasksApp {

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
    public void createListOfTasks() throws InterruptedException {
    	
    	 // Wait for contact card to appear
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task")));
    	
    	 // Click on add new contact floating button
        driver.findElementByAccessibilityId("Create new task").click();
        
        
        MobileElement textbox = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        MobileElement save = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");

       
        String Task1 = "Complete Activity with Google Tasks";
        
        //Thread.sleep(10000);
        // Enter the text in the fields
        textbox.sendKeys(Task1);
        
        save.click();
        
        MobileElement Acualtask1 = driver.findElementById("com.google.android.apps.tasks:id/task_item_layout"); 
        
        Assert.assertEquals("Task Name Matched", Task1, Acualtask1);
    }
	
}
