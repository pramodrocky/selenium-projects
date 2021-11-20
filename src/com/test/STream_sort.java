package com.test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class STream_sort {
																																																																																																											
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		// List<String> orginal = list.stream().map(s ->
		// s.getText()).collect(Collectors.toList());// to compare the result

		// List<String> sorted =
		// orginal.stream().sorted().collect(Collectors.toList());// after sorting

//		Assert.assertTrue(orginal.equals(sorted));*/
		List<String> price;
		do {
			List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = list1.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPrice(s))

					.collect(Collectors.toList());

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

		System.out.println(price);
		driver.close();
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String newp = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println(newp);																									
		return newp;
	}																																																													
}
