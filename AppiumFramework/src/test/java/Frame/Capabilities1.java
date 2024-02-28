package Frame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Capabilities1 extends Capabilities {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void Before() throws IOException, InterruptedException {
		service=startServer();
		driver=Capabilities(deviceName,platformName,appPackage,appActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void Test1() {
		System.out.println("Hello");
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"))");
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Austria\")")).click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rajendra");
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
