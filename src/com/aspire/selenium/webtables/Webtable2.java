package com.aspire.selenium.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
//column
//		List<WebElement> ColumnEle = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]"));
//		System.out.println("Total count of rows ="+ColumnEle.size());
//		for(WebElement Ele:ColumnEle)
//		{
//			System.out.println(Ele.getText());
//		}
//table=header row + body rows
		List<WebElement> headerEle = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/th"));
		int rowsCount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]")).size();
		int columnCount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]/td")).size();
		for(WebElement Ele:headerEle)
		{
			System.out.print(Ele.getText());
		}
		System.out.println();
		for(int i=1; i<=rowsCount; i++)
		{
		
			for(int j=1; j<=columnCount; j++)
			{
				String bodyEle = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+(i+1)+"]/td["+j+"]")).getText();	
				System.out.print(bodyEle+"                   ");
			}
			System.out.println();
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
