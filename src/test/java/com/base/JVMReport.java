package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String json)  {

		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JVM Reports");

		Configuration con = new Configuration(loc, "Air Asia");
		con.addClassifications("Build No", "AA-86545");
		con.addClassifications("Os", "Windows");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("Version", "83");
		con.addClassifications("Sprint", "25");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
		
		

	}
}
