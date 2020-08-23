package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenarios() {
		getDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@After
	public void afterScenarios(Scenario s) {
		TakesScreenshot tk= (TakesScreenshot)driver;
		byte[] d = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(d,"image/png");
		quitApp();
	}

}
