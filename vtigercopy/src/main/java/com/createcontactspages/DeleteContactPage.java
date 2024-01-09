package com.createcontactspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteContactPage {
	
	public DeleteContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
public WebElement getDeleteBtn() {
		return deleteBtn;
	}

@FindBy(xpath="(//a[text()='del'])[2]")
private WebElement deleteBtn;

}
