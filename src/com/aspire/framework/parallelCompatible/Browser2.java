package com.aspire.framework.parallelCompatible;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Browser2 
{
	WebDriver driver=null;
	@Test
	public void chromeBroswer()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
