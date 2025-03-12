package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Browsers.browser;
import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FirstSample  {
	
	@Given("User opens the Browser")
	public void user_opens_the_browser() {
	
	  browser.openBrowser();
	
	}

	@And("User navigates to {string} the webpage")
	public void user_navigates_to_the_webpage(String string) {
	browser.navigateToUrl(string);
	 
	}
	
	@Then("User verifies the title of web page")
	public void user_verifies_the_title_of_web_page() {
		Assert.assertEquals(page1.Title(), "OrangeHRM");
	 
	}
	


	@And("User closes the browser")
	public void user_closes_the_browser() {
	 browser.closeBrowser();
	
	}




}
