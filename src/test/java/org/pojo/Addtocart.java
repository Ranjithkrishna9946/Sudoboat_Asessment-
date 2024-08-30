package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class Addtocart  extends UtilityClass{
	public Addtocart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Show details for Build your own cheap computer']")
	private WebElement clickProduct;
	@FindBy(id = "product_attribute_72_5_18_65")
	private WebElement clickProcessor;
	
	@FindBy(id = "add-to-cart-button-72")
	private WebElement clickAddtobutton;
	@FindBy(xpath = "//a[text()='Shopping cart']")
	private WebElement clickshoppingcart;
	@FindBy(id = "termsofservice")
	private WebElement clickpop;
	@FindBy(id = "checkout")
	private WebElement clickCheckout;
	

	public WebElement getClickshoppingcart() {
		return clickshoppingcart;
	}

	public WebElement getClickpop() {
		return clickpop;
	}

	public WebElement getClickCheckout() {
		return clickCheckout;
	}

	public WebElement getClickProduct() {
		return clickProduct;
	}

	public WebElement getClickProcessor() {
		return clickProcessor;
	}

	public WebElement getClickAddtobutton() {
		return clickAddtobutton;
	}
	

}
