package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class helloworld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();	 
driver.get("https://www.google.com");
String S=driver.getTitle();
System.out.println(S);


driver.findElement(By.xpath("//div[@class='LX3sZb']/div/div/div/div/div/a")).click();
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("od123");
//driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

//driver.findElement(By.xpath("//span[contains(text(),'EXPL2')]")).click();
//Thread.sleep(3000);

//Thread.sleep(3000);
//driver.findElement(By.className("chat-list-item")).click();

//driver.findElement(By.xpath("//span[@xpath='1']")).click();
//Thread.sleep(3000);












	}

}
