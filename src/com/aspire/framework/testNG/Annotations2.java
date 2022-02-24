package com.aspire.framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	@Test
	public void m1()
	{
		Reporter.log("1", true);
	}
	@Test (invocationCount=2)
	public void m2()
	{
		Reporter.log("2", true);
	}
	@BeforeMethod
	public void m3()
	{
		Reporter.log("3", true);
	}
	@AfterMethod
	public void m4()
	{
		Reporter.log("4", true);
	}
//	@AfterClass
//	public void m5()
//	{
//		Reporter.log("5", true);
//	}
//	@BeforeClass
//	public void m6()
//	{
//		Reporter.log("6", true);
//	}
//	@BeforeTest
//	public void m7()
//	{
//		Reporter.log("7", true);
//	}
//	@BeforeGroups
//	public void m8()
//	{
//		Reporter.log("8", true);
//	}
//	@BeforeSuite
//	public void m9()
//	{
//		Reporter.log("9", true);
//	}
//	public void m10()
//	{
//		Reporter.log("10", true);
//	}
//	public void m11()
//	{
//		Reporter.log("11", true);
//	}
}
