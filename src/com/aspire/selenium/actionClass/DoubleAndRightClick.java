package com.aspire.selenium.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
//Context click = right click		
//		act.contextClick().perform(); //left-top position (0,0)
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.contextClick(ele1).perform();
		act.moveToElement(ele1).contextClick().build().perform();
//Double Click
		WebElement ele2 = driver.findElement(By.xpath("//button[contains(text(),'To See')]"));
		//act.moveToElement(ele2).doubleClick().build().perform();
		act.doubleClick(ele2).perform();
	}
}
