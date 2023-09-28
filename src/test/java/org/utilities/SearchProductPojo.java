package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPojo extends BaseClass {
	
	public SearchProductPojo() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath="(//span[@class=\'_13iYl\'])[1]")
	private WebElement mainMenu;
	
	@FindBy(xpath="(//a[@data-test=\'megamenu-category-0\'])[1]")
	private WebElement subMenu1;
	
	@FindBy(xpath="(//a[@class=\'_3H2CN\'])[43]")
	private WebElement subMenu2;
	
	@FindBy(xpath="(//button[@data-test=\'component-att-button\'])[1]")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@class=\'Buttonstyles__Button-sc-42scm2-2 cfMrAm\']")
	private WebElement withoutInsurance;
	
	public WebElement getMainMenu() {
		return mainMenu;
	}	
	
	public WebElement getSubMenu1() {
		return subMenu1;
	}

	public WebElement getSubMenu2() {
		return subMenu2;
	}
	
	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getWithoutInsurance() {
		return withoutInsurance;
	}

	
	
}
