package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();	 
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement ele=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
	
	Select s=new Select(ele);
	s.selectByIndex(3);
	

}
}