package com.crm.TestExecutionScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Pages.AllQuotes;
import com.crm.Pages.EditCampingPage;
import com.crm.Pages.LoginPage;
import com.crm.Pages.Logout;
import com.crm.Pages.NewCampaign;
import com.crm.Pages.QuotesPage;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.genericLib.WebDriverCommenMeth;



@Listeners(com.crm.genericLib.MyListeners.class)




public class ExecutTests extends BaseTest {

	FileLib fLib;
	LoginPage lp;
	QuotesPage qp;
	AllQuotes aq;
	WebDriverCommenMeth wdcl;
	Logout lo;
	NewCampaign nc;
	EditCampingPage ecp;











	@Test(priority=1, enabled = false)
	public void clicknewcampingpage(){

		nc=new NewCampaign();
		wdcl=new WebDriverCommenMeth();
		nc.setCampTab();
		
		wdcl.verify(wdcl.getTitle(),"Zoho CRM - Displaying Custom View Details","click camping page");
	}



	//@Test(priority=2,dependsOnMethods="clicknewcampingpage")
	@Test(priority=2,  enabled = false)
	public void opennewcampingpage() throws Throwable, Throwable {
		nc=new NewCampaign();
		wdcl=new WebDriverCommenMeth();
		fLib=new FileLib();
		
		nc.setnewCmp();
		
		wdcl.verify(wdcl.getTitle(),"Zoho CRM - Create Campaign","click camping page");
		
	
		
		String sub=fLib.getExcelData(EXCEL_PATH, "valid", 1, 1);
		nc.setcampTB(sub);
		
		String startdate=fLib.getExcelData(EXCEL_PATH, "valid", 2, 1);
		nc.startdate(startdate);
		
		String er =fLib.getExcelData(EXCEL_PATH, "valid", 3, 1);
		nc.expecteRevenue(er);
		
		String ac = fLib.getExcelData(EXCEL_PATH, "valid", 4, 1);
		nc.actualCost(ac);
		
		String ns = fLib.getExcelData(EXCEL_PATH, "valid", 5, 1);
		nc.numSend(ns);
		
		String value = fLib.getExcelData(EXCEL_PATH, "valid", 6, 1);
		nc.typeDropDown(value);
		
		String value1 = fLib.getExcelData(EXCEL_PATH, "valid", 7, 1);
		nc.statusDropDown(value1);
		
		String ed = fLib.getExcelData(EXCEL_PATH, "valid", 8, 1);
		nc.endDate(ed);
		
		String bc = fLib.getExcelData(EXCEL_PATH, "valid", 9, 1);
		nc.budgetedCost(bc);
		String ersp = fLib.getExcelData(EXCEL_PATH, "valid", 10, 1);
		nc.expectedResponce(ersp);
		
		
		String desc = fLib.getExcelData(EXCEL_PATH, "valid", 11, 1);
		nc.description(desc);
		
		
		nc.clickSave();
	
		
		wdcl.verify(wdcl.getTitle(), "Zoho CRM - Campaign Details", "new Campaign Details entering");

	}

	
	
	@Test(priority = 3)
	public void editnewCampingPage() throws IOException, Throwable {
		
		fLib=new FileLib();
		nc=new NewCampaign();
		wdcl=new WebDriverCommenMeth();
		nc.setCampTab();
		wdcl.verify(wdcl.getTitle(),"Zoho CRM - Displaying Custom View Details","click camping page");
		ecp=new EditCampingPage();
		ecp.editnewcampingPage();
		
		wdcl.verify(wdcl.getTitle(), "Zoho CRM - Edit Campaign", "Edit page ");
		
		String editValue = ecp.getCampNameTB().getAttribute("value");
		int ev = editValue.length();
		String a = Integer.toString(ev);
		System.out.println(a);
		wdcl.verify(editValue,fLib.getExcelData(EXCEL_PATH, "valid", 1, 1) , "edit new Campain Name matching ");
		wdcl.verify(a, "2", "no of char is matching");
	}


}
