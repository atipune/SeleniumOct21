package com.aspire.selenium.screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//capture screenshot and store it in temp folder with random name
public class Prog1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		float a=10.2f;	//example of typecast
//		int b=(int) a;
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);  //file stores at a location
		System.out.println(source);
	}
}
