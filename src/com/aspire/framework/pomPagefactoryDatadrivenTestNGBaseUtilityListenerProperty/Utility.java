package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListenerProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	static Workbook wbf;
	static String filepath;
	static FileInputStream file;
	public static String testData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException	//parametrization
	{
		filepath="D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\ProjectData.xlsx";
		file = new FileInputStream(filepath);
		wbf = WorkbookFactory.create(file);
		String TestValue = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return TestValue;
	}
	public static boolean testData2(int rowIndex,int cellIndex)
	{
		boolean Testvalue2 = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		return Testvalue2;
	}
	
	public static void screenshots(WebDriver driver) throws IOException
	{
		Date d = new Date();
		String timestamp = d.toString().replace(":", "_").replace(" ", "_");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java-projects\\Oct21\\SeleniumOct21\\Screenshots\\"+timestamp+".jpg");
		FileHandler.copy(src, dest);
	}
	public static String getPropertydata(String key) throws IOException
	{
		Properties PropObj = new Properties();
		FileInputStream fileObj = new FileInputStream(System.getProperty("user.dir")+"\\prop.properties");
		PropObj.load(fileObj);
		String value=PropObj.getProperty(key);
		return value;
	}
}
