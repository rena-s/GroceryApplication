package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") WebElement logoutbutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and @class='small-box-footer']") WebElement moreinfobutton;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement loginpagetext;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy' and @class='small-box-footer']") WebElement moreinfomdb;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement moreinfo;
	
public HomePage clickAdminButton()
{
	admin.click();
	return this;
}
public LoginPage clickLogoutButton()
{
	logoutbutton.click();
	return new LoginPage(driver);
}
public AdminUsersPage clickMoreInfoButtonOfAdminUsers()
{
	moreinfobutton.click();
	return new AdminUsersPage(driver);
}
public String verifyLoginTextIsDisplayed()
{
	return loginpagetext.getText();
}
public ManageDeliveryBoyPage clickMoreInfoOfManageDeliveryBoy()
{
	moreinfomdb.click();
	return new ManageDeliveryBoyPage(driver);
}
public AddCategoryPage clickMoreInfoOfCategory()
{
	moreinfo.click();
	return new AddCategoryPage(driver);
}
}
/*
create WebElement for more info and a method to click more info.
*/