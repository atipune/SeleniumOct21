package com.aspire.framework.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 
{
	String a = "Aspire Training Institute";
	String b = "Aspire";
	String c = "Aspire";
	
	@Test
	public void Hard_Assert()
	{
		System.out.println("Hardassert starts");
		Assert.assertEquals(b, c);			//pass
		System.out.println("Hardassert 1 condition executed");
		Assert.assertNotEquals(b, c);		//fail
		System.out.println("Hardassert 2 condition executed");
		Assert.assertNotEquals(a, c);		//pass	//skip
		System.out.println("Hardassert 3 condition executed");
		
	}
	@Test
	public void Soft_Assert()
	{
		SoftAssert soft = new SoftAssert();
		System.out.println("Softassert starts");
		soft.assertEquals(b, c);			//pass
		System.out.println("Softassert 1 condition executed");
		soft.assertNotEquals(b, c);			//fail
		System.out.println("Softassert 2 condition executed");
		soft.assertNotEquals(a, c);			//pass
		System.out.println("Softassert 3 condition executed");
		soft.assertAll();
	}
}
