package com.aspire.framework.testNG;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 
{
	String exp = "Aspire Training Institute";
	String act = "Aspire";
	String newExp ="Aspire";
	String s=null;
	boolean a= true;
	boolean b= true;
	boolean c= false;
	
//	@Test
//	public void Hard_Assert()
//	{
//		Assert.assertEquals(newExp, act);		//pass
//		Assert.assertNotEquals(exp, act);		//pass
//		Assert.assertNull(exp);					//fail
//		Assert.assertNotNull(exp);				//pass
//		Assert.assertTrue(a);					//pass
//		Assert.assertFalse(c);					//pass
//	}
	@Test
	public void Soft_Assert()
	{
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(newExp, act);			//pass
		soft.assertNotEquals(exp, act);			//pass
		soft.assertNull(exp);					//fail
		soft.assertNotNull(exp);				//pass
		soft.assertTrue(a);						//pass
		soft.assertFalse(c);					//pass
		soft.assertAll();
	}
}
