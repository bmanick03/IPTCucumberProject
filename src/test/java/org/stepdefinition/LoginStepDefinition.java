package org.stepdefinition;


import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;


import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass{

	WebDriver driver;
	
	@Given("User should open the chrome browser and launch the url")
	public void user_should_open_the_chrome_browser_and_launch_the_url() throws InterruptedException {
		//steps given in hooksclass
	}
	

	@When("User should enter the invalid username and valid password")
	public void user_should_enter_the_invalid_username_and_valid_password() {
		LoginPojo h = new LoginPojo();
		mousehover(h.getDeclinecookies());
		clickActions(h.getDeclinecookies());
		mousehover(h.getSavePref());
		clickActions(h.getSavePref());
		h.getAccount().click();
		fillTextBox(h.getUsername(), "DemoUser1@gmail.com");
		fillTextBox(h.getPassword(), "Password@123");
	}

	@When("User should click on login button")
	public void user_should_click_on_login_button() {
		LoginPojo h = new LoginPojo();
		elementClickable(h.getBtnLogin());
		h.getBtnLogin().click();
		
	}

	@Then("Invalid Credentials page should be displayed")
	public void invalid_Credentials_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		printUrl();
		Assert.assertTrue("Check Credentials", printUrl().contains("Origin") );
		System.out.println("Test Case Passed");
	}

	@When("User should enter the valid username and invalid password")
	public void userShouldEnterTheValidUsernameAndInvalidPassword() {
		LoginPojo h = new LoginPojo();
		mousehover(h.getDeclinecookies());
		clickActions(h.getDeclinecookies());
		mousehover(h.getSavePref());
		clickActions(h.getSavePref());
		h.getAccount().click();
		fillTextBox(h.getUsername(), "validuser1@gmail.com");
		fillTextBox(h.getPassword(), "Password@123");
	}
	
	@When("User should enter the valid {string} and invalid {string}")
	public void userShouldEnterTheValidAndInvalid(String uname, String pwd) {
		LoginPojo h = new LoginPojo();
		mousehover(h.getDeclinecookies());
		clickActions(h.getDeclinecookies());
		mousehover(h.getSavePref());
		clickActions(h.getSavePref());
		h.getAccount().click();
		fillTextBox(h.getUsername(), uname);
		fillTextBox(h.getPassword(), pwd);
	}

	@When("User should enter the valid username and password")
	public void userShouldEnterTheValidUsernameAndPassword() throws IOException {
		LoginPojo h = new LoginPojo();
		mousehover(h.getDeclinecookies());
		clickActions(h.getDeclinecookies());
		mousehover(h.getSavePref());
		clickActions(h.getSavePref());
		h.getAccount().click();
		fillTextBox(h.getUsername(), readData("LoginDetails", 1, 0));
		fillTextBox(h.getPassword(), readData("LoginDetails", 1, 1));
	}

	@Then("Home page should be displayed")
	public void homePageShouldBeDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		printTitle();
	    Assert.assertTrue("Invalid Credentials", printTitle().contains("Order"));
	    System.out.println("TestCase Passed");
	

	}

	
}
