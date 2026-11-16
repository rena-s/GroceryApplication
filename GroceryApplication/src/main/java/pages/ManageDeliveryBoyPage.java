package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
public WebDriver driver;
public ManageDeliveryBoyPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newbutton;
@FindBy(xpath="//input[@id='name']") WebElement name;
@FindBy(xpath="//input[@id='email']") WebElement email;
@FindBy(xpath="//input[@id='phone']") WebElement phone;
@FindBy(xpath="//textarea[@id='address']") WebElement address;
@FindBy(xpath="//input[@id='username']") WebElement userNAME;
@FindBy(xpath="//input[@id='password']") WebElement passWORD;
@FindBy(xpath="//button[@type='submit' and text()='Save']")WebElement redsavebutton;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement greenalertmsg;
//button[@type='submit']

public ManageDeliveryBoyPage clickNewButton()
{
	newbutton.click();
	return this;
}
public ManageDeliveryBoyPage enterNameOnNameField(String nameval)
{
	name.sendKeys(nameval);
	return this;
}
public ManageDeliveryBoyPage enterEmailOnEmailField(String emailval)
{
	email.sendKeys(emailval);
	return this;
}
public ManageDeliveryBoyPage enterPhoneOnPhoneField(String phoneval)
{
	phone.sendKeys(phoneval);
	return this;
}
public ManageDeliveryBoyPage enterAddressOnAddressField(String addressval)
{
	address.sendKeys(addressval);
	return this;
}
public ManageDeliveryBoyPage enterUserNameOnUsernameField(String urnameval)
{
	userNAME.sendKeys(urnameval);
	return this;
}
public ManageDeliveryBoyPage enterPasswordOnPasswordField(String passval)
{
	passWORD.sendKeys(passval);
	return this;
}
public ManageDeliveryBoyPage scrollPage()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)", "");
	return this;
}
public ManageDeliveryBoyPage clickRedSaveButton()
{
	redsavebutton.click();
	/*Actions action = new Actions(driver);
	action.click(redsavebutton).perform();*/
	return this;
}
public String verifyAlertIsDisplayed()
{
	return greenalertmsg.getText();
}
}
//button[@type='submit' and text()='Save']