package com.aspire.selenium.multipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung");
		
		Thread.sleep(2000);
		List<WebElement> suggestionlist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span"));
		System.out.println("Total count of Suggestions="+suggestionlist.size());  //10
		
		for(WebElement suggestion:suggestionlist)
		{
			System.out.println(suggestion.getText());
		}
		String exp="samsung a52";
		for(WebElement temp:suggestionlist)
		{
		String act= temp.getText();
			if(exp.equals(act))
			{
				System.out.println("Yes, the expected text is present");
				temp.click();
				break;
			}
		}
	}

}
