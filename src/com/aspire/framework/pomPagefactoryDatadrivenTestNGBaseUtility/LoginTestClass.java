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
	
//	@Test
//	public void verificationOfLogo()
//	{
//		hp.verifylogo(wbf.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue());
//		
//	}
	@Test
	public void verificationOfInitials() throws EncryptedDocumentException, IOException
	{
		hp.verifyInitialName(Utility.testData(10,4));
	}	
	
	@AfterClass
	public void closeBrowser() 
	{
		
		driver.close();
	}
	
			
}
