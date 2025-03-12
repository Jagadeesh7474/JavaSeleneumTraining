package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.browser;

public class page2object extends browser {
	
	public page2object()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(css="[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]"))
	public List<WebElement> list;  
	
	@FindBy(css="[class=\"oxd-userdropdown-name\"]")
	@CacheLookup
	public WebElement dashboardelement;
	
	
	
	


}
