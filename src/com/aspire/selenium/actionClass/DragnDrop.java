package com.aspire.selenium.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//https://jqueryui.com/droppable/
public class DragnDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/droppable/");
		WebElement sourceEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetEle = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
//Approach-1		
		act.moveToElement(sourceEle).clickAndHold().moveToElement(targetEle).release().build().perform();
//Approach-2
	//	act.moveToElement(sourceEle).clickAndHold().release(targetEle).build().perform();
//Approach-3
	//	act.clickAndHold(sourceEle).release(targetEle).build().perform();
//Approach-4
	//	act.dragAndDrop(sourceEle, targetEle).perform();
	}	
}
