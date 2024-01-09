package com.vtiger.genericLibrery;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * this class is used to provide the WedDriver reusable methods
 * All the concepts will be performed by using java language
 */

public class WebDriverUtility
{
   
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to maximize the web page 
	 * 
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to minimize the web page 
	 * 
	 */
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to refresh the web page 
	 * 
	 */
	public void refreshPage(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to backWard the web page 
	 * 
	 */
	public void backWardPage(WebDriver driver)
	{
		driver.navigate().back();
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to forWard the web page 
	 * 
	 */
	public void forWardPage(WebDriver driver)
	{
		driver.navigate().forward();;
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to backWard the web page 
	 * @param b it is used to give the By class reference variables which locate element address
	 * @param data it is used to provide data that you wanted provide
	 * this method is used to perform location Action
	 * and we can write the data in the web page 
	 */
	public void xpathAction(WebDriver driver,By b,String data) 
	{
		driver.findElement(b).sendKeys(data);
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to backWard the web page 
	 * @param b it is used to give the By class reference variables which locate element address
	 *  this method is used to perform location Action
	 *  we can click on the element 
	 */
	public void xpathActionClick(WebDriver driver,By b) 
	{
		driver.findElement(b).click();;
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to backWard the web page 
	 * @param b it is used to give the By class reference variables which locate element address
	 *  this method is used to perform location Action
	 *  we can get  the data present in the element 
	 */
	public String xpathActionElementData(WebDriver driver,By b) 
	{
		return driver.findElement(b).getText();
	}
	/**
	 * 
	 * @param driver it is variable which will initialized with BaseClass WebDriver reference variable
	 * this method is used to backWard the web page 
	 * @param b it is used to give the By class reference variables which locate element address
	 *  this method is used to get the multiple Addresses of the elements
	 *  
	 */
	public  List<WebElement> xpathMultipleElementAction(WebDriver driver,By b) 
	{
		return driver.findElements(b);
	}
	/**
	 * 
	 * @param ele
	 * @return
	 */
	public boolean displayValidation(WebElement ele) 
	{
		return ele.isDisplayed();
	}
	/**
	 * this method is used to get hover massage
	 * @param ele
	 * @param an
	 * @return
	 */
	public String hOverMsg(WebElement ele,String an) 
	{
		return ele.getAttribute(an);
	}
	/**
	 * 
	 * @param driver
	 * @param ele
	 */
	public void scrollPage(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollintoView(true)", ele);
	}
	/**
	 * 
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver,WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param ele
	 */
	public void moveCursor(WebDriver driver,WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param ele
	 */
	public void doubleClickElement(WebDriver driver,WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param src
	 * @param dist
	 */
	public void dragSrcAndDropDist(WebDriver driver,WebElement src,WebElement dist) 
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dist).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param src
	 * @param x
	 * @param y
	 */
	public void dragSrcAndDropPoint(WebDriver driver,WebElement src,int x,int y) 
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param sec
	 */
	public void implicitWait(WebDriver driver,int sec) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	/**
	 * 
	 * @param ele
	 * @param index
	 */
	public void handleStaticDropDownIndex(WebElement ele,int index) 
	{
		Select s= new Select(ele);
		s.selectByIndex(index);
		
	}
	/**
	 * 
	 * @param ele
	 * @param value
	 */
	public void handleStaticDropDownValue(WebElement ele,String value) 
	{
		Select s= new Select(ele);
		s.selectByValue(value);
		
	}
	/**
	 * 
	 * @param ele
	 * @param text
	 */
	public void handleStaticDropDownVisibleText(WebElement ele,String text) 
	{
		Select s= new Select(ele);
		s.selectByVisibleText(text);;
		
	}
	/**
	 * 
	 * @param driver
	 * @param index
	 */
	public void frameHandleIndex(WebDriver driver,int index) 
	{
		driver.switchTo().frame(index);
	}
	/**
	 * 
	 * @param driver
	 * @param frameelement
	 */
	public void frameHandleElement(WebDriver driver,WebElement frameelement) 
	{
		driver.switchTo().frame(frameelement);
	}
	/**
	 * 
	 * @param driver
	 * @param framename
	 */
	public void frameHandlenName(WebDriver driver,String framename) 
	{
		driver.switchTo().frame(framename);
	}
	/**
	 * 
	 * @param driver
	 */
	public void windowPopUp(WebDriver driver) 
	{
		String id=driver.getWindowHandle();
		driver.switchTo().window(id);
	}
	/**
	 * 
	 * @param driver
	 * @param data
	 */
	public void getWindowPopUpRequried(WebDriver driver,String data) 
	{
		Set<String>allid=driver.getWindowHandles();
		for (String i : allid) 
		{
			String s=driver.switchTo().window(i).getTitle();
			if(s.contains(data))
			{
				break;
			}
		}
	}
	/**
	 * 
	 * @param driver
	 * @param data
	 */
	public void getWindowPopUpRequriedCloseAll(WebDriver driver,String data) 
	{
		Set<String>allid=driver.getWindowHandles();
		for (String i : allid) 
		{
			String s=driver.switchTo().window(i).getTitle();
			if(s.contains(data))
			{
				break;
			}
			else 
			{
				driver.switchTo().window(i).quit();
			}
		}
	}
	/**
	 * 
	 * @param driver
	 * @param path
	 * @throws IOException
	 */
	public void screenShot(WebDriver driver,String path) throws Throwable
	{
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File(path+".png");
		Files.copy(src, dist);
	}
	/**
	 * 
	 * @param driver
	 */
	public void acceptAlertPopUp(WebDriver driver) 
	{
		//Alert al=(Alert) driver;
		//al.accept();
		driver.switchTo().alert().accept();
	}
	/**
	 * 
	 * @param driver
	 */
	public void dismissAlertPopUp(WebDriver driver) 
	{
		Alert al=(Alert) driver;
		al.dismiss();
		//driver.switchTo().alert().dismiss();
	}
	/**
	 * 
	 * @param driver
	 * @param data
	 */
	public void writeDataAlertPopUp(WebDriver driver,String data) 
	{
		Alert al=(Alert) driver;
		al.sendKeys(data);
		//driver.switchTo().alert().sendKeys(data);
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public String getdataAlertPopUp(WebDriver driver) 
	{
		Alert al=(Alert) driver;
		return al.getText();
		//driver.switchTo().alert().getText();
	}
	/**
	 * @param driver
	 * @param url
	 */
	public void openApp(WebDriver driver,String url) 
	{
		driver.get(url);
	}
	//public
	
}
