package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPojo extends BaseClass {

	public ForgotPasswordPojo() {
		PageFactory.initElements(driver, this);
	}
	
	//Private WebElements
	
	@CacheLookup
	@FindBy(xpath="//a[@class=\'button-link forgotten-password-link\']")
	private WebElement forgotLink;

	public WebElement getForgotLink() {
		return forgotLink;
	}
	
	
	
	
}
