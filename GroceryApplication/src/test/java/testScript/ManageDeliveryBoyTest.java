package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;


public class ManageDeliveryBoyTest extends Base{
	HomePage hp ;
	ManageDeliveryBoyPage mp ;
	@Test(description="User is trying to add new delivery boy")
public void verifyWhetherUserISAbleToAddNewDeliveryBoy() throws IOException
{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		hp=lp.clickSignInButton();
		
		
		mp=hp.clickMoreInfoOfManageDeliveryBoy();
		
		
		mp.clickNewButton();
		
		RandomDataUtility rd = new RandomDataUtility();
		String nameval = rd.generateRandomName();
		String emailval = rd.generateRandomEmailID();
		String phoneval = rd.generateRandomPhoneNumber();
		String addressval = rd.generateRandomAddress();
		String urnameval = rd.generateRandomUsername();
		String passval = rd.generateRandomPassword();
		
		mp.enterNameOnNameField(nameval).enterEmailOnEmailField(emailval).enterPhoneOnPhoneField(phoneval).enterAddressOnAddressField(addressval).enterUserNameOnUsernameField(urnameval).enterPasswordOnPasswordField(passval).scrollPage().clickRedSaveButton();
		
		String actual = mp.verifyAlertIsDisplayed();
		String expected =  "x\nAlert!\nDelivery Boy Details Created Successfully";
		Assert.assertEquals(actual, expected,Constant.ADDINGNEWDELIVERYBOYERROR);

	
}
}
