package com.locators;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage extends BaseClass {

	public SearchPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement serach;

	@AndroidFindBy(xpath = "//*[@content-desc='Apple iPhone 11 (64GB) - Black ']")
	private MobileElement phone;

	@AndroidFindBy(xpath = "//*[@text='Enter a pincode']")
	private MobileElement pincode;

	@AndroidFindBy(xpath = "//*[@text='Apply']")
	private MobileElement apply;

	public MobileElement getPincode() {
		return pincode;
	}

	public MobileElement getApply() {
		return apply;
	}

	public MobileElement getSerach() {
		return serach;
	}

	public MobileElement getPhone() {
		return phone;
	}

}
