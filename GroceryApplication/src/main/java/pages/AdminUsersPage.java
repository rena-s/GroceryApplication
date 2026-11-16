package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
public WebDriver driver;
PageUtility pu = new PageUtility();
public AdminUsersPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
@FindBy(xpath="//input[@id='username']") WebElement userName;
@FindBy(xpath="//input[@id='password']") WebElement passWord;
@FindBy(xpath="//select[@id='user_type']") WebElement selectusertype;
@FindBy(xpath="//button[@name='Create']") WebElement save;
@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement search;
@FindBy(xpath="//input[@id='un']") WebElement usernamesearch;
@FindBy(xpath="//select[@id='ut']") WebElement selectsearchusertype;
@FindBy(xpath="//button[@value='sr']") WebElement redsearchbutton;
@FindBy(xpath="//h1[text()='Admin Users']") WebElement adminuserstext;
@FindBy(xpath="//h4[text()='Search Admin Users']") WebElement adminsearchtitle;

public AdminUsersPage clickNewButton()
{
	newbutton.click();
	return this;
}
public AdminUsersPage enterUsernameOnUsernameField(String usernameval)
{
	userName.sendKeys(usernameval);
	return this;
}
public AdminUsersPage enterPasswordOnPasswordField(String passwordval)
{
	passWord.sendKeys(passwordval);
	return this;
}
public AdminUsersPage selectUserType()
{
	pu.selectDropdownWithVisibleText(selectusertype, "Admin");
	return this;
}
public AdminUsersPage clickSaveButton()
{
	save.click();
	return this;
}
public AdminUsersPage clickBlueSearchButton()
{
	search.click();
	return this;
}
public AdminUsersPage enterUsernameToSearch(String usernamevl)
{
	usernamesearch.sendKeys(usernamevl);
	return this;
}
public AdminUsersPage selectSearchUserType()
{
	pu.selectDropdownWithVisibleText(selectsearchusertype, "Admin");
	return this;
}
public AdminUsersPage clickRedSearchButton()
{
	redsearchbutton.click();
	return this;
}
public String verifyAdminusersTextIsDisplayed()
{
	return adminuserstext.getText();
}
public String verifyAdminUsersSearchTitleIsDisplayed()
{
	return adminsearchtitle.getText();
}
}
/*
1. create webElement for new,UserName,Password,and saveButton.
2. create new excel sheet(AdminUser).
3. drop down.
*/