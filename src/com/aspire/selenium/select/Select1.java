package com.aspire.selenium.select;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rutuja");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kulkarni");
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xyz@123");
			driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
//Select class method	
//1. Day	
			WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
			
			
			Select s = new Select(daylist);
			WebElement dayselected = s.getFirstSelectedOption();
			System.out.println("Default selected day from day list box="+dayselected.getText());
			s.selectByIndex(14);  //index 0 for 1st element in list
			Thread.sleep(2000);
//			s.deselectByIndex(index);
			s.selectByValue("25");
			Thread.sleep(2000);
//			s.deselectByValue(value);
			s.selectByVisibleText("7");
//			s.deselectByVisibleText(text);
//			s.deselectAll();
			
			
			
			WebElement Monthlist = driver.findElement(By.xpath("//select[@id='month']"));
			Select s2 = new Select(Monthlist);
//Oct--> July--> Dec
			s2.selectByIndex(9);
			Thread.sleep(2000);
			s2.selectByValue("7");
			Thread.sleep(2000);
			s2.selectByVisibleText("Dec");
			
			List<WebElement> allmonth = s2.getOptions();
			System.out.println("Total count of options in month listbox="+allmonth.size());
			for(WebElement monthname:allmonth)
			{
				System.out.println(monthname.getText());
			}
			System.out.println("List of month in Alphabetical order");
			TreeSet tr = new TreeSet();
			for(WebElement month:allmonth)
			{
				tr.add(month.getText());
			}
			for(Object monthfromtr:tr)
			{
				System.out.println(monthfromtr);
			}
}

}
