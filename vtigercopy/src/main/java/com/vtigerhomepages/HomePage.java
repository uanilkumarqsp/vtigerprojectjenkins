package com.vtigerhomepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	@FindBy(linkText="Calendar")
	private WebElement calBtn;
	
	@FindBy(linkText="Leads")
	private WebElement leadBtn;

@FindBy(linkText="Organizations")
private WebElement orgBtn;

@FindBy(linkText="Contacts")
private WebElement contactBtn;

@FindBy(linkText="Products")
private WebElement productBtn;

public WebElement getCalBtn() {
	return calBtn;
}

public WebElement getLeadBtn() {
	return leadBtn;
}

public WebElement getOrgBtn() {
	return orgBtn;
}

public WebElement getContactBtn() {
	return contactBtn;
}

public WebElement getProductBtn() {
	return productBtn;
}


}

