package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListenerProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownMenu 
{
	@FindBy (xpath="(//a[@href='/profile'])[2]") private WebElement profile;
	
	public DropDownMenu(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnProfile()
	{
		profile.click();
	}
}
