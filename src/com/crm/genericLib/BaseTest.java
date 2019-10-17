package com.crm.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.Pages.LoginPage;
import com.crm.Pages.Logout;

public class BaseTest implements IAutoConsts {
	public static WebDriver driver;
	FileLib fLib;
	LoginPage lp;
	WebDriverCommenMeth wdcl;
	Logout lo;
	static MyListeners ml;


	@BeforeClass
	public void openBrowser() throws Throwable {
		fLib=new FileLib();

		String browserValue = fLib.getPropKeyValue(PROP_PATH, "browser");

		if(browserValue.equalsIgnoreCase("chrome")) {


			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();



		}
		else if(browserValue.equalsIgnoreCase("firefox")) {

			driver=new FirefoxDriver();	

		}
		else 
		{
			Reporter.log("Enter the valid browser",true);
		}

		wdcl=new WebDriverCommenMeth();
		wdcl.maximize();
		
		
	
		driver.get(fLib.getPropKeyValue(PROP_PATH, "url"));

	}
	
	
	@BeforeMethod
	public void entertheapp() throws Throwable {
		fLib=new FileLib();
		lp=new LoginPage();
		wdcl.verify(wdcl.getTitle(),"Zoho CRM - Sign in","login page displayed");
		
		wdcl=new WebDriverCommenMeth();
		
		
		 
		String un = fLib.getPropKeyValue(PROP_PATH, "username");
		String pwd = fLib.getPropKeyValue(PROP_PATH, "password");
		
		lp.login(un, pwd);
		
	
		
		wdcl.verify(wdcl.getTitle(),"Zoho CRM - Home Page","Home page displayed");
		
		
	}
	
	
	@AfterMethod
	public void logouttest()
	{
		
		   lo=new Logout();
		   wdcl=new WebDriverCommenMeth();
           lo.clickLogout();
		
		wdcl.verify(wdcl.getTitle(),"Zoho CRM - Sign in","logout is passed");
		
	}
	
	
//	public static void verifyStatus(int status)
//	{   ml=new MyListeners();
//		//ITestResult result = null;
//	
//	
////		ITestResult result = null;
////		status=result.getStatus();
//	status=1;
//	
//		switch (status) {
//		case 1: System.out.println("Test Passed");
//			
//			break;
//
//			
//		case 2: System.out.println("Test Failed");
//		
//		break;
//		
//		case 3: System.out.println("Test Skipped");
//		
//		break;
//		default: System.out.println("Default");
//			break;
//		}
//	}
	
	
	
	
	

	//@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}

}
 
