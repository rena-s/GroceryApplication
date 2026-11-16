package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelAdmin;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminUsersTest extends Base{
	HomePage hp ;
	AdminUsersPage ap ;
	@Test(description="User is trying to add new admin users")
public void verifyWhetherUserIsAbleToAddNewAdminUsers() throws IOException
{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		hp=lp.clickSignInButton();
		
		
		ap=hp.clickMoreInfoButtonOfAdminUsers();
		
		RandomDataUtility rd =new RandomDataUtility();
		String usernameval = rd.generateRandomUsername();
		String passwordval = rd.generateRandomPassword();
		
		ap.clickNewButton().enterUsernameOnUsernameField(usernameval).enterPasswordOnPasswordField(passwordval).selectUserType().clickSaveButton();
		
		String actual = ap.verifyAdminusersTextIsDisplayed();
		String expected = "Admin Users";
		Assert.assertEquals(actual, expected,Constant.ADDINDNEWADMINUSERERROR);
}
	@Test(description="User is trying to search the newly added admin user")
	public void verifyWhetherUserIsAbleToSearchTheNewlyAddedAdminUser() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		hp=lp.clickSignInButton();
		
		
		ap=hp.clickMoreInfoButtonOfAdminUsers();
		
		String usernamevl = ExcelAdmin.getStringData(0, 0, "AdminData");
		AdminUsersPage ap = new AdminUsersPage(driver);
		ap.clickBlueSearchButton().enterUsernameToSearch(usernamevl).selectSearchUserType().clickRedSearchButton();
		
		String actual = ap.verifyAdminUsersSearchTitleIsDisplayed();
		String expected = "Search Admin Users";
		Assert.assertEquals(actual, expected,Constant.SEARCHINGNEWLYADDEDDADMINUSERERROR);
	
	
	}
}
/*
1. verifyWhetherUserIsAbleToAddNewAdminUsers.
2. verifyWhetherUserIsAbleToSearchTheNewlyAddedAdminUser.
*/