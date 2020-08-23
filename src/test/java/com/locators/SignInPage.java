package com.locators;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage extends BaseClass {
	
	public SignInPage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private MobileElement skipSigin;

	public MobileElement getSkipSigin() {
		return skipSigin;
	}

}
