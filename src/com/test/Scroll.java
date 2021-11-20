package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

		List<WebElement> table = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		int count = table.size();
		int sum = 0;
		for (int i = 0; i < count; i++) {

			sum = sum + Integer.parseInt(table.get(i).getText());

		}
		System.out.println(sum);

		int op = Integer.parseInt(
				driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());
		System.out.println(op);
		Assert.assertEquals(sum, op);
		driver.close();
	}

}
