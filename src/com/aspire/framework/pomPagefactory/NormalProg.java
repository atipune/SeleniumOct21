package com.aspire.framework.pomPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalProg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
//Enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");
//enter Pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
//enter button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//enter pin
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
//Continue button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//logo verify
		Thread.sleep(2000);
		boolean expLogo = true;
		boolean actLogo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
		if(expLogo==actLogo)
		{
			System.out.println("Logo verification Test case is pass");
		}
		else
		{
			System.out.println("Logo verification Test case is fail");
		}
//initial name verify
		String expInitialName = "PM";
		String actInitialName = driver.findElement(By.xpath("//div[@class='avatar']/span")).getText();
		if(expInitialName.equals(actInitialName))
		{
			System.out.println("Initial name verification Test case pass");
		}
		else
		{
			System.out.println("Initial name verification Test case fail");
		}
		
		Thread.sleep(10000);
		driver.close();
	}
}
