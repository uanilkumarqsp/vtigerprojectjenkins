package com.createcontactspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditContactsPage 
{
	
	public EditContactsPage
	(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
  @FindBy(xpath="(//a[text()='edit'])[2]")
  private WebElement editBtn;

public WebElement getEditBtn() {
	return editBtn;
}
  
  
}
