package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Browsers.browser;
import Browsers.utility;
import Locators.page1objects;

public class page1 extends browser{
	
	
	static page1objects obj; 
	
	//Method for getting the actual title
	public static String Title()
	{
		return driver.getTitle();
	}
	
	//Entering user name method
	
	public static void enterusername(String str) 
	{
		try 
		{	
			
			
			 wait=new WebDriverWait(browser.driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			obj=new page1objects();
			obj.userName.sendKeys(str);
		}
		catch(Exception E)
		{
			System.out.println("Username :"+E);
		}
		
	}
	
	//Entering password method
		
		public static void enterpassword(String str) 
		{
			try
			{
				obj.password.sendKeys(str);
			}
			catch(Exception E)
			{
				System.out.println("Password :"+E);
			}
			
			
		}
	
	//clicking method
	
	public static void click() 
	{
		try
		{
			obj.loginbutton.click();
		}
		catch(Exception E)
		{
			System.out.println("Click :"+E);
		}
	}
		
	

}
