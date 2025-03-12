package StepDefinition;

import org.testng.Assert;

import Browsers.browser;
import Locators.page2object;
import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.*;

public class SecondScenario {
	
	

	@When("User Enters {string} username")
	public void user_enters_username(String string) throws InterruptedException {
//		Thread.sleep(5000);
		page1.enterusername(string);
	}

	@And("User Enters {string} password")
	public void user_enters_password(String string) {
		page1.enterpassword(string);
	}

	@And("User Clicks login button")
	public void user_clicks_login_button() {
		page1.click();
	}

	@Then("User checks the functionality of login")
	public void user_checks_the_functionality_of_login() throws InterruptedException {
		Assert.assertEquals(page2.Username(), page2.Username());
	}

}




