package vtiger;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.createcontactspages.ContactsPage;
import com.createcontactspages.CreateNewContactPage;
import com.vtiger.genericLibrery.BaseClass;
import com.vtiger.genericLibrery.Driver;
import com.vtiger.genericLibrery.ExecelUtility;
import com.vtiger.genericLibrery.IConstant;
import com.vtigerhomepages.HomePage;
@Listeners(com.vtiger.genericLibrery.IListenerClass.class)
public class Contacts extends BaseClass
{
    @Test(groups = "Smoke")
    public void createContact( ) throws InterruptedException
    {   hp = new HomePage(Driver.getDriver());
    	//Thread.sleep(3000);
    	eu=new ExecelUtility();
    	cp= new ContactsPage(Driver.getDriver());
    	cncp= new CreateNewContactPage(Driver.getDriver());
    	hp.getContactBtn().click();
    	cp.getPlus().click();
    	 String d=(eu.fetchSingleDataFromExcel(IConstant.excelPath,"Contacts", 1, 3));
    	 System.out.println(d);
		cncp.getFirstnameTextBox().sendKeys(eu.fetchSingleDataFromExcel(IConstant.excelPath,"Contacts", 1, 3));
    	
		cncp.getLastNameTextBox().sendKeys(eu.fetchSingleDataFromExcel(IConstant.excelPath,"Contacts", 4, 3));
    
      cncp.getSaveBtn().click();
    }
}
