package com.aspire.framework.pomPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy (xpath="//input[@id='userid']") WebElement UN;
	@FindBy (xpath="//input[@id='password']") WebElement pwd;
	@FindBy (xpath="//button[@type='submit']") WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Enter UN	
	public void enterUserName()
	{
		UN.sendKeys("DP6852");
	}
	//	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");

//enter Pwd
	public void enterPassword()
	{
		pwd.sendKeys("Pramod@2105");
	}
	//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
	//enter button
			
	public void	clickloginButton()
	{
		loginbtn.click();	
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
