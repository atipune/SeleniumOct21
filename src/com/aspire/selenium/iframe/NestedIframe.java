package com.aspire.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
//1&2. id & name in same way
		driver.switchTo().frame("frame1");
//3. index
	//	driver.switchTo().frame(1);
//4. webelement
//		WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		driver.switchTo().frame(parentframe);
		
		String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parenttext);
		
// to child frame		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(childtext);
//child to parent 
		driver.switchTo().parentFrame();
//child to home page
		driver.switchTo().defaultContent();
		String homepagetext = driver.findElement(By.xpath("(//div[@id='framesWrapper']/div)[1]")).getText();
		System.out.println(homepagetext);
	}
}
