package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class EditCampingPage {
	
	
	@FindBy(xpath="//a[@href='/crm/Edit.do?module=Campaigns&id=4803']")private WebElement editBtn;
	
	
	public void editnewcampingPage() {
		editBtn.click();
		
	}
	
	
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement campNameTB;
	
	
	public WebElement getCampNameTB() {
		return campNameTB;
	}


	public void setCampNameTB(String campName) {
		campNameTB.sendKeys(campName);
	}


	public EditCampingPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

}
