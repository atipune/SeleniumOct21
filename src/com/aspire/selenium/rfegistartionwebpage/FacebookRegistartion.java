package com.aspire.selenium.rfegistartionwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistartion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//New account creation button click
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
//First name enter
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashwini");
//Last name enter
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
//Mobile Number
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("9876543210");
//Password		
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("abc@123");
//Gender selection		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
//Signup button click
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
	}
}
