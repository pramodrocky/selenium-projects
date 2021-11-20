package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggest_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();	 
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
Thread.sleep(3000);


List<WebElement> option=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement opti:option)
{
	if(opti.getText().equalsIgnoreCase("india"));
	{
		opti.click();
		break;
	}
}
	
}
}
