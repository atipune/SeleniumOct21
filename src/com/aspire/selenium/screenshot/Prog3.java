package com.aspire.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//capture screenshot and store it in destination folder with specific name
public class Prog3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		for(int i=1; i<=10; i++)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();	
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
	//		TakesScreenshot ts = (TakesScreenshot)driver;
	//		File source = ts.getScreenshotAs(OutputType.FILE);  //file stores at a temp location
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(source);
			
			File destination = new File("D:\\Java-projects\\Oct21\\SeleniumOct21\\Screenshots\\AspireScreenshot"+i+".jpg");
			FileHandler.copy(source, destination);
			driver.close();
		}
	}
}
