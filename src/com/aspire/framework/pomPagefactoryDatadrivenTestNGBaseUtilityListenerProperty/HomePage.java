package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListenerProperty;

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
	
	public boolean verifylogo()
	{
		boolean act = actLogo.isDisplayed();
		return act;
	}

//initial name verify
	public String verifyInitialName()
	{	
		 String actIname = actInitialName.getText();
		 return actIname;
	}
	public void navigatetoProfile()
	{
		actInitialName.click();
	}
}
