package com.aspire.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");  //fully qualified url
		
		
		
		
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.amazon.com/");
//		Thread.sleep(2000);
//		String websitetitle = driver.getTitle();
//		System.out.println(websitetitle);
//		String websiteurl = driver.getCurrentUrl();
//		System.out.println(websiteurl);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//
//		Thread.sleep(2000);
//		driver.close();
	//	driver.quit();
	}
}
