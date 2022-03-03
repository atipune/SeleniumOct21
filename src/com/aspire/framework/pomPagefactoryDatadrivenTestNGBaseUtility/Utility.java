package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	static Workbook wbf;
	public static String testData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException	//parametrization
	{
		String filepath="D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\ProjectData.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		wbf = WorkbookFactory.create(file);
		String TestValue = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return TestValue;
	}
	public static void screenshots()
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java-projects\\Oct21\\SeleniumOct21\\Screenshots"+".jpg");
		FileHandler.copy(src, dest);}
}
