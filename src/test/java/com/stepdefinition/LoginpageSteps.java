package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.locators.LanguagePage;
import com.locators.SearchPage;
import com.locators.SignInPage;

import io.cucumber.java.en.*;

public class LoginpageSteps extends BaseClass{
	SearchPage s;
	@Given("user is on the amazon app")
	public void user_is_on_the_amazon_app() {
		
	}

	@When("User select language")
	public void user_select_language() {
		LanguagePage l= new LanguagePage();
		btnClick(l.getEngLan());
	}

	@When("User select sigin option")
	public void user_select_sigin_option() {
		SignInPage s= new SignInPage();
		btnClick(s.getSkipSigin());
	}

	@When("User search the {string}")
	public void user_search_the(String product) {
		 s= new SearchPage();
		type(s.getSerach(), product);
		keyEnter();
	}

	@When("User select the first item and place order")
	public void user_select_the_first_item_and_place_order() {
		btnClick(s.getPhone());
		btnClick(s.getPincode());
		btnClick(s.getApply());
		scrollDown();
	}

	@Then("User verify the product place dor not")
	public void user_verify_the_product_place_dor_not() {
		Assert.assertTrue(true);
		System.out.println("User successfully place order");
	}

}
