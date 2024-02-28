package Frame;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Simple extends Capabilities {
	AndroidDriver<AndroidElement> driver;
	@AfterTest
	public void last() {
		
		service.stop();
	}
}
