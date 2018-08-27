package com.tmobile.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.util.BaseTest;

import junit.framework.Assert;

public class WebPage extends BaseTest{
	
	@FindBy(css="cite.iUh30")
	List<WebElement> allurl;

	
public WebPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public WebPage validateLinkText(int index){
	for(WebElement element : allurl){
	System.out.println(element.getAttribute("class"));
	String text = allurl.get(index).getText();	
	String value1 = driver.getCurrentUrl();
	Assert.assertEquals(value1, text);
	}return new WebPage();
	}
	
	

}
