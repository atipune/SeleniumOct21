package com.aspire.selenium.rfegistartionwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistraionPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/ICE/Desktop/Registration%20form.html");
		Thread.sleep(1000);
//1.ID
		driver.findElement(By.id("123")).sendKeys("Avinash");
		Thread.sleep(2000);

//2. Name
		driver.findElement(By.name("demo")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("demo")).sendKeys("Ram");
		Thread.sleep(2000);
//3. Classname
		driver.findElement(By.className("Sample")).sendKeys("Gawas");
		Thread.sleep(1000);
//4. Tagname-->link
//		driver.findElement(By.tagName("a")).click();
//		Thread.sleep(1000);
//5. Linktext
//		driver.findElement(By.linkText("Flipkart")).click();
//		Thread.sleep(1000);
//6. partial linktext
//		driver.findElement(By.partialLinkText("oog")).click();
//		Thread.sleep(1000);
//7. CSS selector
		driver.findElement(By.cssSelector(".number")).sendKeys("9876543210");
		Thread.sleep(1000);
//8. Xpath
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abc@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		
	}
}
