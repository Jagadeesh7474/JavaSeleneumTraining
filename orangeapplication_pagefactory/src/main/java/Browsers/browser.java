package Browsers;

import java.time.Duration;
import java.util.Properties;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browser {
	
	/* Neccessary objects declared globally */
	
	
	public static WebDriver driver;
	public static WebElement element;
	public static WebDriverWait wait;
	public static Actions act;
	public static Select select;
	

	
	/*
	 * Open the browser based on the choice
	 */
	public static void openBrowser()  {
		
		 
		try {
			
			String choice = utility.properties("browser"); 
			if (choice.equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
			}
		 catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Browser - openBrowser "+e);
		 }
		 
	}
	
		/*
		 * Pauses the URL of the application
		 */
		public static void navigateToUrl(String str)  {
			try {
//				String Url = utility.properties("url");
				driver.get(str); 
				driver.manage().window().maximize();
				act = new Actions(driver);
				String title=driver.getTitle();
				wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.titleIs(title));
			} catch (Exception e) {
				System.out.println("Browser - navigatetoUrl "+e);
			}
		}
		/*
		 * Closes the Browser
		 */
		public static void closeBrowser() {
			try {
				 
					  driver.quit();
				 
			} catch (Exception e) {
				System.out.println("Browser - closeBrowser "+e);
			}
		}
			

}

