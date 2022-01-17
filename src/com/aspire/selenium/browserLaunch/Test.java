package com.aspire.selenium.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Browser launching

public class Test 
{
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
}
