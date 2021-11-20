package com.test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList_AddingCart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		String[] item = { "cucumber", "beetroot", "tomato" };
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
       opt(driver,item);
		
	}



public static void opt(WebDriver driver,String[] item )
{
	int j=0;
List<WebElement> length = driver.findElements(By.cssSelector("h4[class='product-name']"));

for (int i = 0; i < length.size(); i++) 
{
	String[] name = length.get(i).getText().split("-");
	String format = name[0].trim();

	List product = Arrays.asList(item);
	if (product.contains(format))
	{
		j++;
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		if (j==item.length) 
		{
			break;
		}

	}

}
}}
