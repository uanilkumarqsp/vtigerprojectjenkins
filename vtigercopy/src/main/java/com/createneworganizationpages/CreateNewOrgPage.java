package com.createneworganizationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage 
{
	public CreateNewOrgPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
 @FindBy(name="accountname")
 private WebElement orgNameTextBox;
 
 @FindBy(xpath="//input[@title='Save [Alt+S]'and@name='button']")
 private WebElement saveBtn;

public WebElement getOrgNameTextBox() {
	return orgNameTextBox;
}

public WebElement getSaveBtn() {
	return saveBtn;
}
 
 
}
