package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;
import org.utilities.SearchProductPojo;

import io.cucumber.java.en.*;

public class SelectProductStepDefinition extends BaseClass {
	

@When("User should login with valid username and password")
public void userShouldLoginWithValidUsernameAndPassword() throws IOException {

	LoginPojo h = new LoginPojo();
	mousehover(h.getDeclinecookies());
	clickActions(h.getDeclinecookies());
	mousehover(h.getSavePref());
	clickActions(h.getSavePref());
	h.getAccount().click();
	fillTextBox(h.getUsername(), readData("LoginDetails", 1, 0));
	fillTextBox(h.getPassword(), readData("LoginDetails", 1, 1));
	System.out.println("User Logged in Successfully");
}

	@When("User search for the products to be selected")
	public void userSearchForTheProductsToBeSelected() throws InterruptedException {
		
		SearchProductPojo s = new SearchProductPojo();
		
		ImplicitWait();
		
		WebElement mmenu1 = s.getMainMenu();
		if(mmenu1.isDisplayed()) {
		mousehover(mmenu1);
		}
		
		WebElement smenu1= s.getSubMenu1();
		
		if(smenu1.isDisplayed()) {
			mousehover(smenu1);
			}
		
		WebElement smenu2 = s.getSubMenu2();
		toClick(smenu2);
		System.out.println("Selected Product successfully"); 
			
		
	}

	@When("User should add the product to the cart")
	public void userShouldAddTheProductToTheCart() throws InterruptedException {
		
		SearchProductPojo s = new SearchProductPojo();
		WebElement scroll = s.getAddtocart();
		elementClickable(scroll);
		clickUsingJs(scroll);
		
		ImplicitWait();
		
			}

	@Then("Product selected by the user should be added to the cart")
	public void productSelectedByTheUserShouldBeAddedToTheCart() throws InterruptedException {
		
		SearchProductPojo s = new SearchProductPojo();
		
		ImplicitWait();
		
		WebElement contWithoutInsurance = s.getWithoutInsurance();
		elementClickable(contWithoutInsurance);
		clickUsingJs(contWithoutInsurance);
		
		System.out.println("Product added to cart successfully");
	}

	
}
