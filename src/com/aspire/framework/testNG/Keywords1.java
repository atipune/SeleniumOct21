package com.aspire.framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords1 
{
	
//	@Test(invocationCount=5)
//	public void TC1()
//	{
//		Reporter.log("TC1 pass", true);
//	}
//	@Test (enabled=false)
//	public void TC9()
//	{
//		Reporter.log("TC9 Pass", true);
//	}
//	@Test			//priority =0
//	public void TC3()
//	{
//		Reporter.log("TC3 Pass", true);
//	}
//	@Test (priority=5)
//	public void TC2()
//	{
//		Reporter.log("TC2 Pass", true);
//	}
//	@Test(priority=2)
//	public void TC4()
//	{
//		Reporter.log("TC4 Pass", true);
//	}
//	@Test (priority=1)
//	public void TC5()
//	{
//		Reporter.log("TC5 Pass", true);
//	}
//	@Test (timeOut=1000)
//	public void TC6() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		Reporter.log("TC6 Pass", true);
//	}
	@Test (timeOut=1000)
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("TC7 Pass", true);
	}
	@Test (dependsOnMethods= {"login","TC2"})
	public void logout()
	{
		Reporter.log("TC8 Pass", true);
	}
	
}
