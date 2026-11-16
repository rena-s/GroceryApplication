package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
public WebDriver driver;
public AddCategoryPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement cknew;
@FindBy(xpath="//input[@id='category']") WebElement category;
@FindBy(xpath="//li[@id='4-selectable']") WebElement organic;
@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
@FindBy(xpath="//input[@value='yes' and @name=\"top_menu\"]") WebElement topmenuyes;
@FindBy(xpath="//input[@value='yes' and @name='show_home']") WebElement leftmenuyes;
@FindBy(xpath="//button[@type='submit' and text()='Save']") WebElement savecategory;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement categoryalert;
@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement search;
@FindBy(xpath="//input[@placeholder='Category']") WebElement categoryfield;
@FindBy(xpath="//button[@name='Search']") WebElement searchcategory;
@FindBy(xpath="//h4[text()='Search List Categories']") WebElement title;

public AddCategoryPage clickNew()
{
	cknew.click();
	return this;
}
public AddCategoryPage enterCategoryOnCategoryField(String categoryvalue)
{
	category.sendKeys(categoryvalue);
	return this;
}
public AddCategoryPage selectGroups()
{
	organic.click();
	return this;
}
public AddCategoryPage fileChoosing()
{
	choosefile.sendKeys("C:\\Users\\Dell\\Pictures\\Screenshots\\Screenshot (56).png");
	return this;
}
public AddCategoryPage radioButtonChoosing()
{
	topmenuyes.click();
	return this;
}
public AddCategoryPage radioButtonChoosing2()
{
	leftmenuyes.click();
	return this;
}
public AddCategoryPage scrollCategoryPage()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,3500)", "");
	return this;
}
public AddCategoryPage clickCategorySave()
{
	//savecategory.click();
	Actions action = new Actions(driver);
	action.click(savecategory).perform();
	return this;
}
public String verifyCategoryAlertIsDisplayed()
{
	return categoryalert.getText();
}
public AddCategoryPage clickSearchButtonOnTop()
{
	search.click();
	return this;
}
public AddCategoryPage enterCategoryToSearch(String categorysearchval)
{
	categoryfield.sendKeys(categorysearchval);
	return this;
}
public AddCategoryPage clickSearchCategory()
{
	searchcategory.click();
	return this;
}
public String verifySearchCategoryTitleAppear()
{
	return title.getText();
}
}
