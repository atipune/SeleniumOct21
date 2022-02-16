package com.aspire.framework.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelToHTML 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/profile/user-registration"); //facebook
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("(//span[@class='ui-tabview-title ng-star-inserted'])[3]")).click();
	Thread.sleep(2000);
	FileInputStream file = new FileInputStream("D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
	String flatno = wbf.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='resAddress1']")).sendKeys(flatno);
	

	}
}
