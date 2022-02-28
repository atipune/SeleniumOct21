package com.aspire.framework.parallelCompatible;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser1 
{
	WebDriver driver=null;
	@Test
	public void FirefoxBroswer()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
}
/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  <test name="Test1">
    <classes>
      <class name="com.aspire.framework.parallelCompatible.Browser1"/>
    </classes>
  </test> 
    <test name="Test2">
    <classes>
      <class name="com.aspire.framework.parallelCompatible.Browser2"/>
    </classes>
  </test>
</suite> <!-- Suite -->
*/
