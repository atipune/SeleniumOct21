package com.aspire.framework.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample 
{
	WebDriver driver;
	String url="https://www.facebook.com/";
	@Test
	public void browserlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
//	}
//	@Test
//	public void registration() throws InterruptedException
//	{
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
//	}
//	@Test
//	public void FisrtName()
//	{
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ashwini");
//	}
//	@Test
//	public void lastName()
//	{
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
//	}
//	@Test
//	public void MbNo()
//	{
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("9876543210");
//	}
//	@Test
//	public void password()
//	{	
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("abc@123");
	}
	@Test
	public void genderSelection() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void submitbtn()
	{
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
	@Test
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
