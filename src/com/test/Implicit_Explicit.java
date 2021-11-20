package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		String[] item = { "cucumber", "beetroot", "tomato" };
		int j = 0;

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //WebDriverWait s= new WebDriverWait(driver,5);

		List<WebElement> product = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-");
			String format = name[0].trim();
			List items = Arrays.asList(item);
			

			if (items.contains(format)) {
			
				j++;
				

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
				
				if (j == item.length) {
					break;
				}

			}

		}
	}

	
}
