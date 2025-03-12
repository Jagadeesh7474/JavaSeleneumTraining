package TestCaseDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.browser;
import Pages.page1;
import Pages.page2;
import Screenshot.capture;

public class demo {

	public static void main(String[] args) throws Exception {
		
		browser.openBrowser();
		browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page1.enterusername("Admin");
		capture.screenShot("username");
		page1.enterpassword("admin123");
		page1.click();

		if(page1.Title().equals("OrangeHRM"))
		{
			System.out.println("Title matched with expected");
		}
		else
		{
			System.out.println("Title is not matched with expected");
			
		}
		browser.closeBrowser();
	
		browser.openBrowser();
		browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page1.enterusername("Admin");
		capture.screenShot("username");
		page1.enterpassword("admin123");
		page1.click();
	
		if(page2.Username().equals("Ankit Singh"))
		{
			System.out.println("user matched with expected");
		}
		else
		{
			System.out.println("login user namepage2: "+page2.Username());
			
		}
		
		page2.optionclick("Time");
		
		browser.closeBrowser();
		

	}

}
