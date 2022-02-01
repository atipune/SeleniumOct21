package com.aspire.selenium.multipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartsModules {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		List<WebElement> items = driver.findElements(By.xpath("//div[@class=\"InyRMC _3Il5oO\"]//div[@class=\"xtXmba\"]"));
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
	}

}
