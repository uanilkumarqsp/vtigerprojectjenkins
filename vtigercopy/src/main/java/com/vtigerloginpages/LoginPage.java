package com.vtigerloginpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLibrery.BaseClass;
import com.vtiger.genericLibrery.Driver;
import com.vtiger.genericLibrery.IConstant;
import com.vtiger.genericLibrery.PropertyUtility2;
import com.vtiger.genericLibrery.WebDriverUtility;

public class LoginPage extends BaseClass
{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	
	
	
	
	@FindBy(name="user_name")
	private WebElement unTextBox;

	@FindBy(name="user_password")
	private WebElement pwdTextBox;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	@FindBy(xpath="//td[@class='genHeaderSmall']/following-sibling::td/img[1]")
	private WebElement adminpic;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOut;

	public WebElement getUnTextBox() {
		return unTextBox;
	}

	public WebElement getPwdTextBox() {
		return pwdTextBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getAdmining() {
		return adminpic;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	public void loginWithValidCredentials() throws Throwable     
	{
		pu2= new PropertyUtility2();
		getUnTextBox().sendKeys(pu2.fetchPropertyFileData(IConstant.pathVtigerLoginPage, "un"));
		
		getPwdTextBox().sendKeys(pu2.fetchPropertyFileData(IConstant.pathVtigerLoginPage, "pwd"));
		
		getLoginBtn().click();
	}
	public void logOut()
	{   wu= new WebDriverUtility();
		wu.moveCursor(Driver.driver,getAdmining() );
		getSignOut().click();
		
	}
	
	
	
}

