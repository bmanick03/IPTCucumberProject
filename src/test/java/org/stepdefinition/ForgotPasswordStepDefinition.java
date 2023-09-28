package org.stepdefinition;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.ForgotPasswordPojo;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class ForgotPasswordStepDefinition extends BaseClass {

	@Given("User should launch the browser and load the url")
	public void userShouldLaunchTheBrowserAndLoadTheUrl() {
	    // Steps given in HooksClass
	}

	@When("User clicks on the Forgot Passwork link")
	public void userClicksOnTheForgotPassworkLink() {
		LoginPojo h = new LoginPojo();
		mousehover(h.getDeclinecookies());
		clickActions(h.getDeclinecookies());
		mousehover(h.getSavePref());
		clickActions(h.getSavePref());
		ForgotPasswordPojo f = new ForgotPasswordPojo();
		h.getAccount().click();
	    f.getForgotLink().click();
	}

	@Then("User should navigate to the Forgot Password Reset Page")
	public void userShouldNavigateToTheForgotPasswordResetPage() {
		printTitle();
		Assert.assertTrue("Check Link", printTitle().contains("Forgot"));
		System.out.println("TestCase Passed");
	}
}
