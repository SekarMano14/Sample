package com.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	public static AndroidDriver<MobileElement> driver;

	public static void getDriver() {

		// Desired Capabilities
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Lenovo K3 Note");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

		// launch app
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void type(MobileElement element, String value) {
		element.sendKeys(value);

	}

	public static void btnClick(MobileElement element) {
		element.click();

	}

	public static void keyEnter() {
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public static void scrollDown() {
		// mobile dim
		Dimension size = driver.manage().window().getSize();

		// get the height of start
		Double s = size.getHeight() * 0.5;

		// get height of end
		Double e = size.getHeight() * 0.2;
		int start = s.intValue();
		int end = e.intValue();

		// Scrolldown
		TouchAction ac = new TouchAction(driver);
		ac.press(PointOption.point(0, start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
				.moveTo(PointOption.point(0, end)).release().perform();

	}

	public static void scrolltillLocator(List<MobileElement> elements) {
		while (elements.size() == 0) {
			scrollDown();
		}

		if (elements.size() != 0) {
			btnClick(elements.get(0));

		}

	}

	public static void quitApp() {
		driver.quit();

	}
}
