package vtiger;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;


import com.createcontactspages.ContactsPage;
import com.createcontactspages.CreateNewContactPage;
import com.vtiger.genericLibrery.BaseClass;
import com.vtiger.genericLibrery.Driver;
import com.vtiger.genericLibrery.ExecelUtility;
import com.vtiger.genericLibrery.IConstant;
import com.vtiger.genericLibrery.JavaUtilityClass;
import com.vtigerhomepages.HomePage;
@Listeners(com.vtiger.genericLibrery.IListenerReference.class)
public class CreateContactWithNumberTest extends BaseClass
{
	
	private CreateContactWithNumberTest()
	{
		
	}
	
	
	
	
  @Test(groups = "Regression")
  public void createContactNum()
  {
	  eu= new ExecelUtility();
	  ju = new JavaUtilityClass();
	  hp= new HomePage(Driver.getDriver());
	  cp = new ContactsPage(Driver.getDriver());
	  cncp = new CreateNewContactPage(Driver.getDriver());
	  hp.getContactBtn().click();
	  cp.getPlus().click();
	  int num = ju.randomNumberGenerate(1000);
	  cncp.getFirstnameTextBox().sendKeys(eu.fetchSingleDataFromExcel(IConstant.excelPath, "Contacts", 1, 3)+num);
	  cncp.getLastNameTextBox().sendKeys(eu.fetchSingleDataFromExcel(IConstant.excelPath, "Contacts", 1, 3)+num);
	  cncp.getSaveBtn().click();
//	  String actPath = Driver.driver.findElement(By.xpath("//input[@name='firstname']")).getText();
//	  String expData = "qwe"+num+"contacts";
//	  System.out.println(actPath);
//	  Assert.assertTrue(actPath.contains(expData), " contact is not createed ");
//	  
//	  
//	  Reporter.log(" new contact is created ", true);
//	  
	  
  }
}
