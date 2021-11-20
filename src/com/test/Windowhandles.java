package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");

		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		Assert.assertEquals("mentor@rahulshettyacademy.com",
				driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]
						.trim());

		driver.switchTo().window(parentid);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		driver.close();
		driver.switchTo().window(childid).close();
		
		
	}
}
