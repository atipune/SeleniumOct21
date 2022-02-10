package com.aspire.selenium.actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/newtours/");
//		WebElement firstcell = driver.findElement(By.xpath("(//tr[@class='mouseOut'])[1]/td[1]"));
		List<WebElement> allCells = driver.findElements(By.xpath("//tr[@class='mouseOut']/td[1]")); 
		
		Actions act = new Actions(driver);
//		act.moveToElement(firstcell).perform();
		for(WebElement cell:allCells)
		{
			act.moveToElement(cell).perform();
			Thread.sleep(2000);
		}
		
		
	}
}
