package com.aspire.framework.testNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTC 
{
	@Test
	public void m1()
	{
		Reporter.log("1", true);
	}
	@Test (enabled=false)			//1. approach
	public void m2()
	{
		Reporter.log("2", true);
	}
	@Test
	public void m3()
	{
		Reporter.log("3", true);
	}
	@Test
	public void m4()
	{
		Reporter.log("4", true);
	}
}

/*
//Exclude keyword in suite
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
    <classes>
      <class name="com.aspire.framework.testNG.SkipTC">
      	<methods>
          <exclude name="m1"/>
          <exclude name="m3"/>
        </methods>
      </class>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->
 */
 
 
