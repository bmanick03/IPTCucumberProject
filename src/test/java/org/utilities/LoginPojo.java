package org.utilities;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginPojo extends BaseClass {

		//Non-parameterised Constructor
		public LoginPojo() {
			PageFactory.initElements(driver, this);
		}
		
		//Private WebElements
		@CacheLookup
	
		@FindBy(id="prefslink")
		private WebElement declinecookies;
		
		@FindBy(id="preferences_prompt_submit")
		private WebElement savePref;
		
		
		

		public WebElement getSavePref() {
			return savePref;
		}

		@FindBy(xpath="//input[@type=\'email\']")
		private WebElement username;
		
		@FindBy(xpath="//input[@type=\'password\']")
		private WebElement password;
		
		@FindBy(xpath="(//button[@type=\'submit\'])[2]")
		private WebElement btnLogin;
		
		@FindBy(xpath="(//span[@class=\'_2wsKA\'])[2]")
		private WebElement Account;
		
		
		//Getters
		public WebElement getUsername() {
			return username;
		}

		public WebElement getDeclinecookies() {
			return declinecookies;
		}

		public WebElement getAccount() {
			return Account;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		
	}



