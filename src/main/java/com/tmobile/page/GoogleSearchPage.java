package com.tmobile.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.tmobile.util.BaseTest;
import com.tmobile.util.TestUtil;

public class GoogleSearchPage extends BaseTest{
	
	
	@FindBy(name="q")
	WebElement googleSearchBox;
	
	@FindBy(name="btnK")
	WebElement googleSearchBtn;
	
	String sheetName = "animals";
	
	//Initializing the Page Objects
	public GoogleSearchPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String  validateGooglePageTitle(){
		return driver.getTitle();
		
	}
	
	@DataProvider
	public String getTestData(){
		TestUtil.getTestData(sheetName);
		return sheetName;
	}
	
	
	public ListPage googlesearch(String txt){
		
		googleSearchBox.sendKeys();
		googleSearchBtn.click();
		return new ListPage();
	}

		
}
