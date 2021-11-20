package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

		
		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch'] ")).getText()
				.contains("May")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> list = driver.findElements(By.className("day"));
		int count = list.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String date = driver.findElements(By.className("day")).get(i).getText();
			System.out.println(date);
			if (date.equalsIgnoreCase("22")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}
}
