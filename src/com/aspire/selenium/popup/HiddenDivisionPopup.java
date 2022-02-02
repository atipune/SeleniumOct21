package com.aspire.selenium.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//UN-->Password-->Blue strip text get-->Login button click
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@123");
		String loginText = driver.findElement(By.xpath("//span[contains(text(),'access')]")).getText();
		System.out.println(loginText);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
