package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AddCategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelCategory;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AddCategoryTest extends Base{
	HomePage hp ;
	AddCategoryPage cp ;
	@Test(description="User is trying to add new category")
public void verifyWhetherUserIsAbleAddNewCategory() throws IOException
{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		hp=lp.clickSignInButton();
		
		
		cp=hp.clickMoreInfoOfCategory();
		
		String categoryvalue = ExcelCategory.getStringData(0, 0, "CategoryData");		
		
		cp.clickNew().enterCategoryOnCategoryField(categoryvalue).selectGroups().fileChoosing().radioButtonChoosing().radioButtonChoosing2().scrollCategoryPage().clickCategorySave();
		
		String actual = cp.verifyCategoryAlertIsDisplayed();
		String expected =  "x\nAlert!\nCategory Created Successfully";
		Assert.assertEquals(actual, expected,Constant.ADDINGNEWCATEGORYERROR);

}
	@Test(description="User is trying to search the newly added category")
	public void verifyWhetherUserIsAbleToSearchTheNewlyAddedCategory() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		hp=lp.clickSignInButton();
		
		
		cp=hp.clickMoreInfoOfCategory();
		
		String categorysearchval = ExcelCategory.getStringData(0, 0, "CategoryData");
		AddCategoryPage cp = new AddCategoryPage(driver);
		cp.clickSearchButtonOnTop().enterCategoryToSearch(categorysearchval).clickSearchCategory();
		
		String actual = cp.verifySearchCategoryTitleAppear();
		String expected = "Search List Categories";
		Assert.assertEquals(actual, expected,Constant.SEARCHINGNEWLYADDEDCATEGORYERROR);
		
	}
}
