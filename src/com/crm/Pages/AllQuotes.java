package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class AllQuotes {
	
	
	
	
	
	@FindBy(xpath="//input[@value='New Quote']")private WebElement newQTtab;
	public void newqQuotespage() {
		
		newQTtab.click();
		
	}
	
	
	@FindBy(xpath="//input[@name='property(Subject)']")private WebElement subTB;
	
	public void setSubTextBox(String subtx) {
		
		subTB.sendKeys(subtx);
	}
	
	
	
	
	public AllQuotes() {
		
		
		
		PageFactory.initElements(BaseTest.driver, this);
		
	}

}
