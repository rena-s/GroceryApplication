package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
	HomePage hp;
	@Test(description="User is trying to logout")
public void verifyWhetherUserIsAbleToSuccessfullyLoggedout() throws IOException
{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		hp=lp.clickSignInButton();
		
		hp.clickAdminButton();
		lp=hp.clickLogoutButton();
		
		
	String actual = hp.verifyLoginTextIsDisplayed();
	String expected = "7rmart supermarket";
	Assert.assertEquals(actual, expected,Constant.LOGOUTERROR);
}
}
