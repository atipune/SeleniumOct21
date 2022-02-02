package com.aspire.selenium.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherPopup {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-projects\\Oct21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
//Alert box
		driver.findElement(By.id("alertBox")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
//Confirm box	
		
		driver.findElement(By.id("confirmBox")).click();
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		Thread.sleep(2000);
//		alt2.accept();
		alt2.dismiss();
		
		Thread.sleep(2000);
//prompt box
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alt3 = driver.switchTo().alert();
		System.out.println(alt3.getText());
//		alt3.sendKeys("Aspire Training Institute");//-->Not working 
		
		Thread.sleep(2000);
//		alt3.accept();
		alt3.dismiss();		
	}
}
