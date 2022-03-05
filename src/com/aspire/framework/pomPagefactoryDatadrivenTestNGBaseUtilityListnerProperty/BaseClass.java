package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListnerProperty;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	static WebDriver driver=null;
	public static void browseropen() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //20000
												//either of (Duration.ofSeconds(20)) or (20, TimeUnit.SECONDS)
		driver.manage().window().maximize();
		driver.get(Utility.getPropertyFiledata("url"));
		Thread.sleep(2000);
		
		//cookies clear code
	}
}
