package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_assignment {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();	 
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.xpath("//div[@class='right-align']/fieldset/legend")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

List <WebElement> ele=driver.findElements(By.cssSelector("div[class='right-align'] fieldset"));

	System.out.println(ele.size());
	driver.close();
	}
	
}
