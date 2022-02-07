package com.aspire.selenium.popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultiplePages 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung mobiles");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	List<WebElement> items = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(WebElement item:items)
	{
//		System.out.println(item.getText());
		item.click();
		Thread.sleep(1500);
	}
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(ids);
	//0-home, 1-last, 2-second last, 3--------
	Thread.sleep(2000);
	driver.switchTo().window(al.get(1));
	String ratings = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[1]/span/span[1]")).getText();
	System.out.println(ratings);//8***, 2***
	
	
	
	Thread.sleep(5000);
//	driver.quit();
	
}
}
