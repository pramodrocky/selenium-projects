package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://onedirect.onedirect.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhishek.gauri@onedirect.in");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("od123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		List<WebElement> prod = driver.findElements(By.cssSelector("div[class='product-item-title']"));

		int count = prod.size();
		for (int i = 0; i < count; i++) {
			String name = driver.findElements(By.cssSelector("div[class='product-item-title']")).get(i).getText();
			System.out.println(name);
			if (name.contains("MESSAGING CLOUD")) {
				driver.findElements(By.xpath("//div[contains(@class,'product-item-title')]/span")).get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("li[class='has-subnav border-bottom'] a[href='/messaging/chat-inbox']"))
				.click();

		driver.findElement(By.cssSelector("li[title='Expl2']")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//body[1]/app-root[1]/app-home[1]/main[1]/article[1]/div[1]/app-chat-inbox[1]/div[1]/div[1]/section[1]/app-chat-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/chat-list-item[1]/div[1]"
		 * )) .click();
		 */
		WebElement ki = driver
				.findElement(By.xpath("//convo-header/div[1]/div[2]/p-dropdown[1]/div[1]/div[3]/span[1]"));
		ki.click();

		/*
		 * List<WebElement> status=driver.findElements(By.
		 * cssSelector("div[class='ui-dropdown-items-wrapper'] li"));
		 * //Thread.sleep(3000); int stl=status.size(); for(int i=0;i<stl;i++) { String
		 * ss=driver.findElements(By.
		 * cssSelector("div[class='ui-dropdown-items-wrapper'] li")).get(i).getText();
		 * System.out.println(ss); if(ss.contains("Awaiting Response")) {
		 * driver.findElement(By.
		 * xpath("//li[@class='ng-tns-c41-11 ui-dropdown-item ui-corner-all']/div]")).
		 * click(); break; }
		 * 
		 * }
		 */

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-home[1]/main[1]/article[1]/div[1]/app-chat-inbox[1]/div[1]/div[1]/div[1]/section[1]/app-conversation[1]/div[1]/div[1]/div[1]/convo-header[1]/div[1]/div[2]/p-dropdown[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/div[1]/div[1]"))
				.click();

		WebElement ele = driver.findElement(By.cssSelector("div[class='agc-box']"));
		System.out.println(ele);

		Select s = new Select(ele);
		s.selectByVisibleText("Yes");
		driver.close();

	}
}
