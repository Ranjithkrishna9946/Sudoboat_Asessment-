package org.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class PaymentPojo extends UtilityClass {

	public PaymentPojo() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id = "billing-address-select")
	private WebElement enterNewAddress;

	public WebElement getEnterNewAddress() {
		return enterNewAddress;
	}
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement enterCompanyNamu;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement selectCountry;
	@FindBy(id = "BillingNewAddress_City")
	private WebElement enterCity;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement enterAddres1;

	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement enterAddres2;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement enterZipcode;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement enterPhone;

	@FindBy(xpath = "//div[@id='billing-buttons-container']//child::input")
	private WebElement clickContinue2;
	
	@FindBy(id = "PickUpInStore")
	private WebElement clickPop;
	
	
	@FindBy(xpath = "//div[@id='shipping-buttons-container']//child::input")
	private WebElement clickcontinueAddres;
	
	@FindBy (id = "paymentmethod_2")
	private WebElement clickcreitcard;
	
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']//child::input")
	private WebElement clickPyamentMethod;
	@FindBy(id = "CreditCardType")
	private WebElement selectCrad;
	@FindBy(id = "CardholderName")
	private WebElement enterCradholderName;
	
	@FindBy(id = "CardNumber")
	private WebElement enterCradnumber;
	
	@FindBy(id = "ExpireMonth")
	private WebElement enterExpiremonth;
	
	@FindBy(id = "ExpireYear")
	private WebElement enterExipreyear;
	@FindBy(id = "CardCode")
	private WebElement enterCvvcode;
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']//child::input")
	private WebElement clickcardContinue;
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']//child::a")
	private WebElement clickBack;
	@FindBy(id = "paymentmethod_0")
	private WebElement clickCash;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement clickfinal;
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	private WebElement clickLast;
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	private WebElement clickorder;
	@FindBy(xpath = "//div[@class='title']")
	private WebElement finaltest;

	public WebElement getClickorder() {
		return clickorder;
	}

	public WebElement getFinaltest() {
		return finaltest;
	}

	public WebElement getClickLast() {
		return clickLast;
	}

	public WebElement getClickBack() {
		return clickBack;
	}

	public WebElement getClickCash() {
		return clickCash;
	}

	public WebElement getClickfinal() {
		return clickfinal;
	}

	public WebElement getClickcreitcard() {
		return clickcreitcard;
	}

	public WebElement getClickPyamentMethod() {
		return clickPyamentMethod;
	}

	public WebElement getSelectCrad() {
		return selectCrad;
	}

	public WebElement getEnterCradholderName() {
		return enterCradholderName;
	}

	public WebElement getEnterCradnumber() {
		return enterCradnumber;
	}

	public WebElement getEnterExpiremonth() {
		return enterExpiremonth;
	}

	

	public WebElement getEnterExipreyear() {
		return enterExipreyear;
	}

	public WebElement getEnterCvvcode() {
		return enterCvvcode;
	}

	public WebElement getClickcardContinue() {
		return clickcardContinue;
	}

	public WebElement getClickContinue2() {
		return clickContinue2;
	}

	public WebElement getClickcontinueAddres() {
		return clickcontinueAddres;
	}

	public WebElement getClickPop() {
		return clickPop;
	}

	public WebElement getEnterCompanyNamu() {
		return enterCompanyNamu;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getEnterCity() {
		return enterCity;
	}

	public WebElement getEnterAddres1() {
		return enterAddres1;
	}

	public WebElement getEnterAddres2() {
		return enterAddres2;
	}

	public WebElement getEnterZipcode() {
		return enterZipcode;
	}

	public WebElement getEnterPhone() {
		return enterPhone;
	}

	public WebElement getClickContinue() {
		return clickContinue2;
	}
}
