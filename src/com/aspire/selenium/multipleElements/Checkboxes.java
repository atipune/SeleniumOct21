package com.aspire.selenium.multipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@style='margin-left:20px;']/input"));
//		for(int i=0; i<options.size();i++)
//		{
//			Thread.sleep(2000);
//			options.get(i).click();		
//		}
		for(WebElement option:options)
		{
			Thread.sleep(2000);
			option.click();
		}
			
		Thread.sleep(5000);
		driver.close();
	}
}
