package com.aspire.framework.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FailedXmlCreation 
{
	@Test
	public void m1()
	{
		Reporter.log("1", true);
		Assert.fail();
	}
	@Test 
	public void m2()
	{
		Reporter.log("2", true);
	//	Assert.fail();
	}
	@Test
	public void m3()
	{
		Reporter.log("3", true);
//		Assert.fail();
	}
	@Test
	public void m4()
	{
		Reporter.log("4", true);
	}
}

/*
 //******Tentng.xml
  
  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Testng">
    <classes>
   	  <class name="com.aspire.framework.testNG.SoftAssert2"/>
      <class name="com.aspire.framework.testNG.FailedXmlCreation"/>
    </classes>
  </test> <!-- Testng -->
</suite> <!-- Suite -->

//*******testng-failed.xml
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite guice-stage="DEVELOPMENT" name="Failed suite [Suite]">
  <test thread-count="5" name="Testng(failed)">
    <classes>
      <class name="com.aspire.framework.testNG.FailedXmlCreation">
        <methods>
          <include name="m1"/>
        </methods>
      </class> <!-- com.aspire.framework.testNG.FailedXmlCreation -->
      <class name="com.aspire.framework.testNG.SoftAssert2">
        <methods>
          <include name="Soft_Assert"/>
          <include name="Hard_Assert"/>
        </methods>
      </class> <!-- com.aspire.framework.testNG.SoftAssert2 -->
    </classes>
  </test> <!-- Testng(failed) -->
</suite> <!-- Failed suite [Suite] -->
  
 */



