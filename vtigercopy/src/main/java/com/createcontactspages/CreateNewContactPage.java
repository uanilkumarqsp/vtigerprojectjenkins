package com.createcontactspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage 
{
	
	
	public CreateNewContactPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
@FindBy(xpath="//input[@type='text'and@name='firstname']")
private WebElement firstnameTextBox;

@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement saveBtn;

public WebElement getSaveBtn() {
	return saveBtn;
}

@FindBy(xpath="//input[@type='text'and@name='lastna']")
private WebElement lastNameTextBox;

public WebElement getFirstnameTextBox() {
	return firstnameTextBox;
}

public WebElement getLastNameTextBox() {
	return lastNameTextBox;
}

}
