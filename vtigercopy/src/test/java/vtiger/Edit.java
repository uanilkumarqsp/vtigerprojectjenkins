package vtiger;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.createcontactspages.ContactsPage;
import com.createcontactspages.CreateNewContactPage;
import com.createcontactspages.EditContactsPage;
import com.vtiger.genericLibrery.BaseClass;
import com.vtiger.genericLibrery.Driver;
import com.vtiger.genericLibrery.ExecelUtility;
import com.vtiger.genericLibrery.IConstant;
import com.vtigerhomepages.HomePage;
@Listeners(com.vtiger.genericLibrery.IListenerReference.class)
public class Edit extends BaseClass
{
	 @Test(groups = "ST")
	    public void contactEdit( ) throws InterruptedException
	    {  
		   ecp= new EditContactsPage(Driver.driver);
		   hp = new HomePage(Driver.driver);
	    	Thread.sleep(3000);
	    	eu=new ExecelUtility();
	    	cp= new ContactsPage(Driver.driver);
	    	cncp= new CreateNewContactPage(Driver.driver);
	    	hp.getContactBtn().click();
	    	//cp.getPlus().click();
	    	ecp.getEditBtn().click();
	    	 String d=(eu.fetchSingleDataFromExcel(IConstant.excelPath,"Contacts", 7, 3));
	    	 System.out.println(d);
	    	 cncp.getFirstnameTextBox().clear();
			cncp.getFirstnameTextBox().sendKeys(eu.fetchSingleDataFromExcel(IConstant.excelPath,"Contacts", 7, 3));
			cncp.getLastNameTextBox().clear();
			cncp.getLastNameTextBox().sendKeys(eu.fetchSingleDataFromExcel(IConstant.excelPath,"Contacts", 10, 3));
	    
	      cncp.getSaveBtn().click();
}
}
