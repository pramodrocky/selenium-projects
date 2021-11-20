package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();	 
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_rbtnl_Trip_0')]")).click();

driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2"));

if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
{
	System.out.println("it is disabled");
	Assert.assertTrue(true);
}
	}}

 
