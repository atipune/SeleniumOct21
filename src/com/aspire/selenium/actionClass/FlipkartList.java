package com.aspire.selenium.actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		act.moveToElement(fashion).perform();
		Thread.sleep(2000);
		List<WebElement> fashionEle = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		for( WebElement ele:fashionEle)
		{
			System.out.println(ele.getText());
		}
		
	}
}
