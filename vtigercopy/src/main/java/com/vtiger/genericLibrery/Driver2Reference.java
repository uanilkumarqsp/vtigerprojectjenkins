package com.vtiger.genericLibrery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver2Reference {
	private Driver2Reference()
	{
		
	}
public static WebDriver driver; 

 static ThreadLocal<WebDriver> tr =new ThreadLocal<>();

public static void setDriver1(WebDriver driver)
{
	tr.set(driver);
}
public static  WebDriver getDriver()
{
	return tr.get();
}

public static WebDriver setDriver()
{
	
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	return driver;
	
	
	
}

}
