package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class Logout {
	
	
	@FindBy(xpath="//a[.='Logout [rashmi@dell.com]']")private WebElement logoutBtn;
	
	
	public void clickLogout()  {
		
		logoutBtn.click();
	
		
	}
	
	
	
	public Logout() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}

}
