package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target =driver.findElement(By.xpath("//div[@id='droppable']"));
Actions a= new Actions(driver);
a.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();

	
	}}
