package com.vtiger.genericLibrery;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.createcontactspages.ContactsPage;
import com.createcontactspages.CreateNewContactPage;
import com.createcontactspages.DeleteContactPage;
import com.createcontactspages.EditContactsPage;
import com.vtigerhomepages.HomePage;
import com.vtigerloginpages.LoginPage;

public class BaseClass {
protected WebDriverUtility wu;
protected PropertyUtility2 pu2;
protected LoginPage lp;
protected HomePage hp;
protected JavaUtilityClass ju;
protected ExecelUtility eu;
protected ContactsPage cp;
protected CreateNewContactPage cncp;
protected EditContactsPage ecp;
protected DeleteContactPage dcp;

@BeforeSuite 
public void setUpJDBC()
{
	Reporter.log(" JDBC connected ", true);
}
@Parameters("browser")
@BeforeClass(alwaysRun = true)
public void setUp(String browser) throws Throwable
{
	Driver.setDriver(browser);
	wu= new WebDriverUtility();
	pu2 = new PropertyUtility2();
	wu.maximize(Driver.getDriver());
	wu.implicitWait(Driver.getDriver(), 10);
	wu.openApp(Driver.getDriver(),pu2.fetchPropertyFileData(IConstant.pathVtigerLoginPage,"url"));
	
}
@BeforeMethod(alwaysRun = true)
public void login() throws Throwable
{
	lp= new LoginPage(Driver.getDriver());
	lp.loginWithValidCredentials();
}
@AfterMethod(alwaysRun = true)
public void logOut() throws InterruptedException
{
	Thread.sleep(3000);
	lp= new LoginPage(Driver.getDriver());
	wu= new WebDriverUtility();
	wu.moveCursor(Driver.getDriver(), lp.getAdmining());
	lp.getSignOut().click();
	
}
@AfterClass
public void closeBrowser()
{
	Driver.getDriver().close();
}
}
