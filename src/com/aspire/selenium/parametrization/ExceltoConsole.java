package com.aspire.selenium.parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//excel to console print
//excel read
public class ExceltoConsole 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		double pincode = wbf.getSheet("Sheet1").getRow(4).getCell(2).getNumericCellValue();
		Sheet s = wbf.getSheet("Sheet1");
		
		int lastRowIndex = s.getLastRowNum();
		System.out.println("Last Row Index="+lastRowIndex);
		short cellCount = s.getRow(2).getLastCellNum();
		System.out.println("Number of cells in given row="+cellCount);
//		Row r = s.getRow(4);
//		Cell c = r.getCell(2);
//		double pincode = c.getNumericCellValue();
		System.out.println(pincode);
		
		String mum = wbf.getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		System.out.println(mum);
	}
}
