package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.stepdefinition", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:src/test/resources", "json:src/test/resources/repot.json" })
public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("src/test/resources/repot.json");

	}

}
