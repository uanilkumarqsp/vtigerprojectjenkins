package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.genericLibrery.WebDriverUtility;

public class T2 {
public static void main(String[] args) {
	T1 t= new T1();
	WebDriverUtility w= new WebDriverUtility();
	WebDriver driver = new ChromeDriver();
	w.xpathAction(driver, By.id("username"), "admin");
}
}
