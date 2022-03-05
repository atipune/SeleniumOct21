package com.aspire.framework.pomPagefactoryDatadrivenTestNGBaseUtilityListnerProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteProfilePage {

	
	@FindBy(xpath="//a[text()=' Logout']") private WebElement logout;
	
	public KiteProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickKiteProfilePageLogoutBtn() {
		logout.click();
	}
}