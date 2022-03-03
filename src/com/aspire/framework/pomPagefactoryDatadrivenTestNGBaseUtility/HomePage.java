package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath="//img[@alt='Kite logo']") WebElement actLogo;
	@FindBy (xpath="//div[@class='avatar']/span") WebElement actInitialName;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifylogo(boolean exp)
	{
		boolean act = actLogo.isDisplayed();
		if(exp==act)
		{
			System.out.println("Logo verification Test case is pass");
		}
		else
		{
			System.out.println("Logo verification Test case is fail");
		}
	}

//initial name verify
	public void verifyInitialName(String ExpIname)
	{	
		 String actIname = actInitialName.getText();
		
		if(actIname.equals(ExpIname))
		{
			System.out.println("Initial name verification Test case pass");
		}
		else
		{
			System.out.println("Initial name verification Test case fail");
		}
	}
}
