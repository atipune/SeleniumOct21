package com.aspire.selenium.multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome 
{
	static WebDriver driver;
	static String s="edge";
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		if(s.equals("chrome"))
		{
//1. chromedriver--> Chrome Browser		
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if(s.equals("firefox"))
		{
//2. geckodriver-->firefox browser
		System.setProperty("webdriver.gecko.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else if(s.equals("edge"))
		{
//3. microsoft edge
		System.setProperty("webdriver.edge.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		}
		
 
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kanchan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kakde");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("PQR@123");
		WebElement dayele = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1= new Select(dayele);
		s1.selectByValue("25");
		
		
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	}
}
