package com.aspire.framework.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping 
{
	@Test (groups="signin")
	public void m1()
	{
		Reporter.log("1", true);
	}
	@Test (groups="payment")
	public void m2()
	{
		Reporter.log("2", true);
	}
	@Test (groups="signin")
	public void m3()
	{
		Reporter.log("3", true);
	}
	@Test (groups="order")
	public void m4()
	{
		Reporter.log("4", true);
	}
	@Test (groups="addtocart")
	public void m5()
	{
		Reporter.log("5", true);
	}
	@Test (groups="order")
	public void m6()
	{
		Reporter.log("6", true);
	}
	@Test (groups="order")
	public void m7()
	{
		Reporter.log("7", true);
	}
	@Test (groups="signin")
	public void m8()
	{
		Reporter.log("8", true);
	}
}


/*
//grouping exclude or include
 
 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
  <groups>
  	<run>
  		<exclude name="order"/>
  		<include name="signin"/>	
  	</run>
  </groups>
    <classes>
      <class name="com.aspire.framework.testNG.Grouping"/>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->

*/