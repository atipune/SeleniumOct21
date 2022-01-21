package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAllMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s1= new Select(products);
		s1.selectByIndex(2);
		
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s2= new Select(animals);
		s2.selectByValue("babycat");
		
		WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
		Select s3= new Select(food);
		s3.selectByVisibleText("Burger");
		Thread.sleep(2000);
		s3.deselectByValue("burger");
//isMultiple
		System.out.println(s2.isMultiple());
		s3.selectByIndex(1);
		s3.selectByIndex(3);
		System.out.println("All options from food list box");
		List<WebElement> allOptions = s3.getOptions();
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		System.out.println("Selected options form food list box");
		
		
		List<WebElement> foodselected = s3.getAllSelectedOptions();
		for(WebElement items:foodselected)
		{
			System.out.println(items.getText());
		}
		
		
		Thread.sleep(15000);
		driver.close();
	}
}
