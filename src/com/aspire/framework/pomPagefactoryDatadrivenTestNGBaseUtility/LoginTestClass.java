package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtility;

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
import org.testng.annotations.AfterClass;
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
	int ssid;
	
	
	@BeforeTest
	public void browserlaunch() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		browseropen();
		
		lp= new LoginPage(driver);
		pp = new PinPage(driver);
		hp = new HomePage(driver);
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
	
	@Test
	public void verificationOfLogo()
	{
		hp.verifylogo(Utility.testData2(10, 6));
	}
	@Test
	public void verificationOfInitials() throws EncryptedDocumentException, IOException
	{
		ssid=10;
		String ExpIname = Utility.testData(10,4);
		String actIname=hp.verifyInitialName();
		
		Assert.assertEquals(ExpIname, actIname, "Initial name verification Test case fail due to different actual and initial names");	
		
		Utility.screenshots(driver,ssid);
	}	
	
	@AfterClass
	public void closeBrowser() 
	{
		
		driver.close();
	}
	
			
}
