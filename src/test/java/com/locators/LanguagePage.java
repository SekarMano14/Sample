package com.locators;


import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LanguagePage extends BaseClass {
	public LanguagePage() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
	private MobileElement engLan;

	public MobileElement getEngLan() {
		return engLan;
	}

}
