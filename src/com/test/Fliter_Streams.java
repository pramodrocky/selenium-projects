package com.test;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Fliter_Streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("banana");

		List<WebElement> veg = driver.findElements(By.xpath("//tr/td[1]"));

		List<WebElement> src = veg.stream().filter(s -> s.getText().contains("banana")).collect(Collectors.toList());

		Assert.assertEquals(veg.size(), src.size());

	}
}
