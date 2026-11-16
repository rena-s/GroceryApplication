package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	WaitUtility wu = new WaitUtility();
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement loginpagetext;

	public LoginPage enterUsernameOnUsernameField(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
		return this;
	}
	public LoginPage enterPasswordOnPasswordField(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
		return this;
	}
	public HomePage clickSignInButton()
	{
		wu.waitUntilElementToBeClickable(driver, signin);
		signin.click();
		return new HomePage(driver);
	}
	public boolean verifyWhetherDashboardIsDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public String verifyLoginTextIsDisplayed()
	{
		return loginpagetext.getText();
	}
}
