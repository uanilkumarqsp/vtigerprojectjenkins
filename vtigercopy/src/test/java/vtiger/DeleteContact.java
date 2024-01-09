package vtiger;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.createcontactspages.ContactsPage;
import com.createcontactspages.CreateNewContactPage;
import com.createcontactspages.DeleteContactPage;
import com.vtiger.genericLibrery.BaseClass;
import com.vtiger.genericLibrery.Driver;
import com.vtiger.genericLibrery.ExecelUtility;
import com.vtigerhomepages.HomePage;
@Listeners(com.vtiger.genericLibrery.IListenerClass.class)
public class DeleteContact extends BaseClass
{ @Test
	public void contactDelete() {
	hp = new HomePage(Driver.getDriver());
	dcp = new DeleteContactPage(Driver.getDriver());
	
	cp= new ContactsPage(Driver.getDriver());
	
	hp.getContactBtn().click();
	 dcp.getDeleteBtn().click();
	wu.acceptAlertPopUp(Driver.getDriver());
	
}
}
