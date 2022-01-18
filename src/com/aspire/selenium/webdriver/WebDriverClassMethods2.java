package com.aspire.selenium.webdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClassMethods2 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		System.out.println(driver.manage().window().getSize());
//		Thread.sleep(2000);
//		Dimension d1 = new Dimension(600,500);
//		driver.manage().window().setSize(d1);
//		Thread.sleep(2000);
//		Dimension d2 = new Dimension(800,500);
//		driver.manage().window().setSize(d2);
//		Thread.sleep(2000);
//		Dimension d3 = new Dimension(900,700);
//		driver.manage().window().setSize(d3);
		Thread.sleep(2000);
		Dimension d4 = new Dimension(20,20);
		driver.manage().window().setSize(d4);
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		Point p = new Point(700, 100);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
	}
}
