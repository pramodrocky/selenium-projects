package com.test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Testing {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cd=new DesiredCapabilities();
		cd.setBrowserName("chrome");
		cd.setPlatform(Platform.LINUX);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.120.246/:4444"),cd);
		driver.get("http://www.facebook.com");
		
		
		
		
	}

}
