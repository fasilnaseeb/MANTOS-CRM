package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class QuotesPage {
	
	@FindBy(xpath="//a[.='Quotes']")private WebElement quotesTab;
	
	
	
	public void openQuotesPage() {
		
		quotesTab.click();
		
		
	}
	
	
	
	public QuotesPage(){
		
		PageFactory.initElements(BaseTest.driver, this);
	}
	

}
