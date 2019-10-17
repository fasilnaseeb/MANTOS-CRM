package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebDriverCommenMeth;



public class LoginPage {
	
	
	
	WebDriverCommenMeth wdcm;

	
	@FindBy(xpath="//input[@id='userName']") private WebElement unTB;
	
	public void setUsername(String un) throws Throwable {
		
		unTB.sendKeys(un);
		
	}
	
	@FindBy(xpath="//input[@id='passWord']") private WebElement pwTB;
	public void setPassword(String pwd) throws Throwable {
		pwTB.sendKeys(pwd);
		
	}
	
	@FindBy(xpath="//input[@src='/crm/images/btnSignIn.gif']") private WebElement loginBtn;
	
	


	

	
	public void clickLogin() {
		loginBtn.click();
		
	}
	
	
	public void login(String un,String pwd)  {
		unTB.sendKeys(un);
		pwTB.sendKeys(pwd);
		loginBtn.click();
		
		
		
		
		
	}
	
	
	
	
	
	
//	@FindBy(xpath="//img[@id='scrollright']")private WebElement scrrtBtn;
//	
//	public void clickandScrollRigt() {
//		
//		
//		
//	 
//		
//		for (int i = 0; i < 20; i++) 
//		{
//			
//				scrrtBtn.click();
//			
//		}
//	
//			
//	}
//	
	
	
	
	
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
}
