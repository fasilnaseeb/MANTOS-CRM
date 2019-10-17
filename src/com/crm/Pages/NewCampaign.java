package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebDriverCommenMeth;

public class NewCampaign {
	
	WebDriverCommenMeth wdcm;

	@FindBy(xpath="//a [.='Campaigns']")private WebElement cmpTab;


	public void setCampTab() {

		cmpTab.click(); 
	}


	public WebElement getCampTab() {
		return cmpTab;
	}


	@FindBy(xpath="//a [.='New Campaign']")private WebElement newCmp;
	public void setnewCmp() {

		newCmp.click(); 
	}

	@FindBy(xpath="//input[@name=\"property(Campaign Name)\"]")private WebElement campTB;
	public void setcampTB(String Ctv) {

		campTB.sendKeys(Ctv);



	}

	@FindBy(xpath="//input[@name='property(Start Date)']")private WebElement strtdateTB;
	public void startdate(String dt) {

		strtdateTB.sendKeys(dt);


	}

	@FindBy(xpath="//input[@name='property(Expected Revenue)']")private WebElement erTB;
	public void expecteRevenue(String er) {
		erTB.sendKeys(er);
		
	}
	@FindBy(xpath="//input[@name='property(Actual Cost)']")private WebElement acTB;
	public void actualCost(String ac)
	{
		acTB.sendKeys(ac);
	}
	
	@FindBy(xpath="//input[@name='property(Num sent)']")private WebElement ncTB;
	public void numSend(String ns) {
		ncTB.sendKeys(ns);
	}
	@FindBy(xpath="//select[@name='property(Type)']")private WebElement typeDD;
	public void typeDropDown(String value) {
		wdcm=new WebDriverCommenMeth();
		wdcm.select(typeDD, value);
		
		
	}
	
	@FindBy(xpath="//select[@name='property(Status)']")private WebElement statusDD;
	public void statusDropDown(String value) {
		wdcm=new WebDriverCommenMeth();
		wdcm.select(statusDD, value);
	}
	
	@FindBy(xpath="//input[@name='property(End Date)']")private WebElement enddtTB;
	public void endDate(String ed) {
		enddtTB.sendKeys(ed);
	}
	
	@FindBy(xpath="//input[@name='property(Budgeted Cost)']")private WebElement bcTB;
	public void budgetedCost(String bc) {
		bcTB.sendKeys(bc);
	}
	
	@FindBy(xpath="//input[@name='property(Expected Response)']")private WebElement erespTB;
	public void expectedResponce(String ersp) {
		
		
		erespTB.sendKeys(ersp);
	}

	
	
	@FindBy(xpath="//textarea[@class='textField']")private WebElement textArea;
	public void description(String desc) {
		textArea.sendKeys(desc);
	}
	
	@FindBy(xpath="(//input)[47]")private WebElement saveBtn;
	public void clickSave() {
		saveBtn.click();
		
	}

	public NewCampaign() {

		PageFactory.initElements(BaseTest.driver, this);
	}


}
