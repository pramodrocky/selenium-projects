package com.test;

import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();	 
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
Thread.sleep(3000);
driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//Assert.assertTrue(false, null)



}
}
