package org.pojo;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class SearchProduct extends UtilityClass {
	public SearchProduct() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "small-searchterms")
	private WebElement enterProductname;
	@FindBy(xpath = "//input[@type='submit']")
    private WebElement clicksearch;
	
	@FindBy(id = "products-viewmode")
	private WebElement SelectviewList;
	
	public WebElement getSelectviewList() {
		return SelectviewList;
	}
	
	
	public WebElement getEnterProductname() {
		return enterProductname;
	}
	public WebElement getClicksearch() {
		return clicksearch;
	}
}
