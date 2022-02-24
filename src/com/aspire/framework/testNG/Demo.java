package com.aspire.framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void method1()
	{
//		System.out.println("Hi");
		Reporter.log("Hello, Aspirant Oct21 Batch", true);
	}
}
