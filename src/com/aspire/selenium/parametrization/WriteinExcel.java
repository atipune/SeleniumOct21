package com.aspire.selenium.parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteinExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String[] a= {"Aspire","Training","Institute","Pune"};
		FileInputStream file = new FileInputStream("D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		Sheet s = wbf.getSheet("Sheet2");
		Row row1 = s.createRow(1);
		Cell cell1 = row1.createCell(1);
		cell1.setCellValue("Hi");
		for(int i=0; i<a.length; i++)
		{
			s.createRow(i+2).createCell(1).setCellValue(a[i]);
		}
		
		FileOutputStream filewrite = new FileOutputStream("D:\\Java-projects\\Oct21\\SeleniumOct21\\TestData\\Test1.xlsx");
		wbf.write(filewrite);
		
	}
}
