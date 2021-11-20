package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class looping_dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();	 
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
Thread.sleep(3000);
//driver.findElement(By.className("guestlbl")).click();

for(int i=1;i<7;i++)
{
driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
}

driver.close();


}
}
