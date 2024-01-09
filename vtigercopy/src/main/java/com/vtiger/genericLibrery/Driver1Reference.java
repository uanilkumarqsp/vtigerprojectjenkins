package com.vtiger.genericLibrery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver1Reference {
	private Driver1Reference()
	{
		
	}
public static WebDriver driver;


public static WebDriver setDriver()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	return driver;
}
}
