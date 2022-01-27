package com.aspire.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
//capture screenshot and store it in destination folder with unique name
public class Prog4 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
			System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
	//		TakesScreenshot ts = (TakesScreenshot)driver;
	//		File source = ts.getScreenshotAs(OutputType.FILE);  //file stores at a temp location
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(source);
			String randomName = RandomString.make(2);
			File destination = new File("D:\\Java-projects\\Oct21\\SeleniumOct21\\Screenshots\\"+randomName+".jpg");
			FileHandler.copy(source, destination);
			driver.close();
	}
}
