package com.tmobile.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.util.BaseTest;

import junit.framework.Assert;

public class ListPage extends BaseTest{
	

	
	@FindBy(css="h3.r>a")
	List<WebElement> allLinks;
	
	
	
	public ListPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyListPageTitle(){
		return driver.getTitle();
	}
	
	public WebPage dogSearch(int index){
		
		for(WebElement element : allLinks){
			System.out.println(element.getAttribute("href"));
			
			allLinks.get(index).click();
			
		}		
		return new WebPage();
	
	}
	
	
	
	public WebPage catSearch(int index){		
		for(WebElement element : allLinks){
			System.out.println(element.getAttribute("href"));
			allLinks.get(index).click();;
		}		
		return new WebPage();	
	
	}
	

	public WebPage eleSearch(int index){		
		for(WebElement element : allLinks){
			System.out.println(element.getAttribute("href"));
			allLinks.get(index).click();;
		}		
		return new WebPage();	
	
	}
	
	
	
}
