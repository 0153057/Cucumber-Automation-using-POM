package com.tmobile.stepDefinitions;

import org.junit.Assert;

import com.tmobile.page.GoogleSearchPage;
import com.tmobile.page.ListPage;
import com.tmobile.page.WebPage;
import com.tmobile.util.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class eleSearchPageSteps extends BaseTest{
	
	GoogleSearchPage googlepage = new GoogleSearchPage();
	ListPage list;
	WebPage webpage;
	
	@Given("^user opens google page$")
	public void user_opens_google_page()throws Throwable{
		
		BaseTest.initialization();
		
	}

	
	@When("^user is on the google page$")
	public void user_is_on_the_google_page()throws Throwable{
		
		String title = googlepage.validateGooglePageTitle();
		Assert.assertEquals("Google",title);
	}
	
	@Then("^user enters the \"(.*)\"  in search field")
	public void user_enters_the_text_in_search_field (String text)throws Throwable{		
		 googlepage.googlesearch(text);
	  
	}

	@Then("^result page is displayed$")
	public void result_page_is_displayed()throws Throwable{

		String page = list.verifyListPageTitle();
		Assert.assertEquals("cat - Google Search",page);
		 
	}
	
	@Then("^click_on_3rd_top_level_link_on_that_page$")
	public void click_on_3rd_top_level_link_on_that_page()throws Throwable{
		
		list.eleSearch(7);
	}
	
	@Then("^validate link page title$")
	public void validate_link_page_title()throws Throwable{
		
		webpage.validateLinkText(7);
	}
	
}
