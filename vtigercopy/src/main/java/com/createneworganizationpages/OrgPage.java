package com.createneworganizationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage 
{
    @FindBy(xpath="//img[@title='Create Organization...']")
    private WebElement plus;
    
    
    public OrgPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}


	public WebElement getPlus()
	{
		return plus;
	}
	
}
