package com.aspire.selenium.popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		String id = driver.getWindowHandle();
		System.out.println("Parent window ID ="+id);
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String id1:ids)
		{
			System.out.println(id1);
		}
		ArrayList<String> al = new ArrayList<String>(ids);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		//driver.switchTo().window(id);
		String parentwindowtext = driver.findElement(By.xpath("//label[contains(text(),'Drag and')]")).getText();
		System.out.println(parentwindowtext);
		
//		driver.close();
		driver.quit();
		
	}
}
