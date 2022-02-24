package com.aspire.framework.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertOwn 
{
	String exp = "Aspire Training Institute";
	String act = "Aspire";
	String newExp ="Aspire";
	String s=null;
	boolean a= true;
	boolean b= true;
	boolean c= false;
	
//assertEquals	
	@Test
	public void TC()
	{
//		if(exp.equals(act))
//		{
//			Reporter.log("Test case pass", true);
//		}
//		else
//		{
//			Reporter.log("Test case fail", true);
//		}
	Assert.assertEquals(newExp, act,"Please provide correct values");
	}
//assertNotEquals	
	@Test
	public void TC2()
	{
		Assert.assertNotEquals(exp, act,"Please provide different values");
	}
//asserttrue
	@Test
	public void TC3()
	{
		Assert.assertTrue(a,"Please provide True value");
	}
//assertFalse
	@Test
	public void TC4()
	{
		Assert.assertFalse(c,"Please provide False value");
	}
//assertNull
	@Test
	public void TC5()
	{
		Assert.assertNull(s);
	}
//assertNotNull
	@Test
	public void TC6()
	{
		Assert.assertNotNull(exp);
	}
//fail
	@Test
	public void TC7()
	{
		
		
		
		Assert.fail(); 		//100% Test case fails
		
		
	}
}
