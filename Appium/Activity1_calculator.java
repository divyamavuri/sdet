package com.ibm.mobileTesting;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class Activity1_calculator {
	
	WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;
    
	@Test
	public void calc() throws InterruptedException, IOException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceId", "emulator-5554");
		caps.setCapability("deviceName", "Pixel4APIEmulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		
		// Instantiate Appium Driver
		AppiumDriver<MobileElement> driver = null;
		try {
			// Initialize driver
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:8200/wd/hub"), caps);
			System.out.println("Calculator is open");
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 

}
