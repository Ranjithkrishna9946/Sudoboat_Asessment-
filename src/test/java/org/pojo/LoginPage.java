package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class LoginPage extends UtilityClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement clickLoginbutton;

	@FindBy(id = "Email")
	private WebElement enterEmail;
	@FindBy(id = "Password")
	private WebElement enterPasswors;
	@FindBy(id = "RememberMe")
	private WebElement clickRememberMe;
	@FindBy(xpath = "//input[@type='submit']//parent::div")
	private WebElement clickLogin;
	public WebElement getClickLoginbutton() {
		return clickLoginbutton;
	}
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	public WebElement getEnterPasswors() {
		return enterPasswors;
	}
	public WebElement getClickRememberMe() {
		return clickRememberMe;
	}
	public WebElement getClickLogin() {
		return clickLogin;
	}

}
