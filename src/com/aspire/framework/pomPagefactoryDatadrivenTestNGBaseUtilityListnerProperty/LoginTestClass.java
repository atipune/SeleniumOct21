package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListnerProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestClass extends BaseClass
{
	Workbook wbf;
	LoginPage lp;
	PinPage pp;
	HomePage hp;
	KiteProfilePage profile;
	
	
	@BeforeTest
	public void browserlaunch() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		browseropen();
		
		lp= new LoginPage(driver);
		pp = new PinPage(driver);
		hp = new HomePage(driver);
		profile= new KiteProfilePage(driver);
	}
	
	@BeforeClass
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		
		lp.enterUserName(Utility.testData(10,1));
		lp.enterPassword(Utility.testData(10,2));
		lp.clickloginButton();
		
		pp.enterpin(Utility.testData(10,3));
		pp.clickcntbtn();
		
	}
	
//	@Test
//	public void verificationOfLogo() throws IOException
//	{
//		boolean exp=Utility.testData2(10, 6);
//		boolean act = hp.verifylogo();
//		Assert.assertEquals(exp, act, "Logo verification Test case fail due to logo image not loading");	
//		Utility.screenshots(driver);
//	}
	@Test
	public void verificationOfInitials() throws EncryptedDocumentException, IOException
	{
		String ExpIname = Utility.testData(10,4);
		String actIname=hp.verifyInitialName();
		Assert.assertEquals(ExpIname, actIname, "Initial name verification Test case fail due to different actual and initial names");	
	}
	@AfterMethod				//Listner
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS) {
			Utility.screenshots(driver);
		}
		
		hp.clickKiteHomePagePN();
		profile.clickKiteProfilePageLogoutBtn();
	}
	@AfterClass
	public void closeBrowser() 
	{
		
		driver.close();
	}
	
			
}
