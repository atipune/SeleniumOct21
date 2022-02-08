package com.aspire.selenium.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	Thread.sleep(2000);
//cell
	String bodycellvalue = driver.findElement(By.xpath("//td[text()='Angels & Demons']")).getText();
	System.out.println(bodycellvalue);
	
//row
	List<WebElement> rowEle = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//th"));
	System.out.println("Total Column numbers="+rowEle.size());
	for(WebElement ele:rowEle)
	{
		System.out.println(ele.getText());
	}
	
}
}