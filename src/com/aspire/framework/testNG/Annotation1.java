package com.aspire.framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//1. System login and user verify
public class Annotation1 
{
	@BeforeClass
	public void browserLaunch()
	{
		Reporter.log("Browser lauch successful", true);
	}
	@BeforeMethod
	public void EnterUsername()
	{
		Reporter.log("Enter UN successful", true);
	}
	@Test
	public void EnterPassword()
	{
		Reporter.log("Enter Pwd successful", true);
	}
	@Test
	public void Loginbtn()
	{
		Reporter.log("Click on Login Button successful", true);
	}
	@Test
	public void verifyUser()
	{
		Reporter.log("User name verified from account successful", true);
	}
	
}
