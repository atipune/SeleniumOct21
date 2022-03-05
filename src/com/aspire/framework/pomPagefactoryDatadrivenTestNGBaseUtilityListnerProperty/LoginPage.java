package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListnerProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{		
	@FindBy (xpath="//input[@id='userid']") private WebElement UN;
	@FindBy (xpath="//input[@id='password']") private WebElement pwd;
	@FindBy (xpath="//button[@type='submit']") private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Enter UN	
	public void enterUserName(String username)
	{
		UN.sendKeys(username);
	}

//enter Pwd
	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
	}
			
	public void	clickloginButton()
	{
		loginbtn.click();	
	}
}
