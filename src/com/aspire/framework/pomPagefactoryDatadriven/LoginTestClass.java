package com.aspire.framework.pomPagefactoryDatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestClass 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);	
		
		String filepath="D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\ProjectData.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		Workbook wbf = WorkbookFactory.create(file);
//		Row r = WorkbookFactory.create(file).getSheet("Sheet1").getRow(10);		//alternate approach
		String UNvalue = wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
		String pwdValue = wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
		String pinValue = wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue();
		String expIname = wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
		boolean expLogo = wbf.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue();
//url		
//20
//21		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName(UNvalue);
		lp.enterPassword(pwdValue);
		lp.clickloginButton();
		Thread.sleep(4000);
		
		PinPage pp = new PinPage(driver);
		pp.enterpin(pinValue);
		pp.clickcntbtn();
		Thread.sleep(4000);
		
		HomePage hp = new HomePage(driver);
		hp.verifylogo(expLogo);
		hp.verifyInitialName(expIname);
		
		Thread.sleep(10000);
		driver.close();
	}
	
}
