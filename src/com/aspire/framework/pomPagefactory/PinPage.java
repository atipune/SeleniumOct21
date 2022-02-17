package com.aspire.framework.pomPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	@FindBy (xpath="//input[@id='pin']") WebElement pin;
	@FindBy (xpath="//button[@type='submit']") WebElement continuebtn;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//enter pin
	public void enterpin()
	{
		pin.sendKeys("976976");
	}
			//driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");

//Continue button
	public void clickcntbtn()
	{
		continuebtn.click();
	}
	//		driver.findElement(By.xpath("//button[@type='submit']")).click();
}
