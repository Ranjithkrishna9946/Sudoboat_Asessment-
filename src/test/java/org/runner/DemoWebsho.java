package org.runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.Addtocart;
import org.pojo.LoginPage;
import org.pojo.PaymentPojo;
import org.pojo.SearchProduct;
import org.reusable.UtilityClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebsho extends UtilityClass {

	@BeforeTest

	public void OpenBrowser() throws IOException {
		// driver=new ChromeDriver();

		launchBrowser("Chrome");
		launchUrl(readFromExcel("Sheet1", 1, 2));
		implitWait();
		Windowmaximize();
	}

	@Test
	public void Login() throws InterruptedException, IOException {
		LoginPage l = new LoginPage();
		// WebDriverWait wait=new WebDriverWait(driver, 30);
		Thread.sleep(3000);
		clickWebElement(l.getClickLoginbutton());
		l.getEnterEmail().sendKeys(readFromExcel("Sheet1", 1, 0));
		l.getEnterPasswors().sendKeys(readFromExcel("Sheet1", 1, 1));
		clickWebElement(l.getClickRememberMe());
		clickWebElement(l.getClickLogin());
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//a[text()='ranjithkrishna9946@gmail.com']"));
		String text = element.getText();
		System.out.println(text);
		String text2 = "ranjithkrishna9946@gmail.com";
		Assert.assertEquals(text, text2);

	}

	@Test(priority = 1)

	public void SerachProduct() {

		SearchProduct s = new SearchProduct();
		s.getEnterProductname().sendKeys("Computer");
		s.getClicksearch().click();
		selectDropDowen(s.getSelectviewList(), "List");
	}

	@Test(priority = 2)
	public void proudctAdd() throws InterruptedException {
		Addtocart a = new Addtocart();
		a.getClickProduct().click();
		a.getClickProcessor().click();
		a.getClickProcessor().click();
		a.getClickAddtobutton().click();
		a.getClickshoppingcart().click();
		a.getClickpop().click();
		a.getClickCheckout().click();

	}

	@Test(priority = 3)
	public void paymentPage() throws IOException, InterruptedException {
		PaymentPojo p = new PaymentPojo();
		selectDropDowen(p.getEnterNewAddress(), "New Address");
		p.getEnterCompanyNamu().sendKeys(readFromExcel("Sheet1", 1, 3));
		selectDropDowen(p.getSelectCountry(), "India");
		p.getEnterCity().sendKeys(readFromExcel("Sheet1", 2, 3));
		p.getEnterAddres1().sendKeys(readFromExcel("Sheet1", 3, 3));
		p.getEnterAddres2().sendKeys(readFromExcel("Sheet1", 4, 3));
		p.getEnterZipcode().sendKeys(readFromExcel("Sheet1", 5, 3));
		p.getEnterPhone().sendKeys(readFromExcel("Sheet1", 6, 3));
		p.getClickContinue().click();
		p.getClickPop().click();
		Thread.sleep(3000);
		p.getClickcontinueAddres().click();
		p.getClickcreitcard().click();
		p.getClickPyamentMethod().click();
		p.getEnterCradholderName().sendKeys(readFromExcel("Sheet1", 1, 4));
		p.getEnterCradnumber().sendKeys(readFromExcel("Sheet1", 2, 4));
		selectDropDowen(p.getEnterExpiremonth(), "12");
		selectDropDowen(p.getEnterExipreyear(), "2029");
		p.getEnterCvvcode().sendKeys(readFromExcel("Sheet1", 3, 4));
		p.getClickcardContinue().click();
		Thread.sleep(3000);
		p.getClickBack().click();
		Thread.sleep(3000);
		p.getClickCash().click();
		Thread.sleep(3000);

		p.getClickfinal().click();
		Thread.sleep(3000);
		p.getClickLast().click();

		p.getClickorder().click();
		String text = p.getFinaltest().getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your order has been successfully processed!");
		//=====================================
		TakesScreenshot take = (TakesScreenshot) driver;
		File screenshotAs = take.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\ranji\\eclipse-workspace\\DemoWebshopSudoboat\\Secreenshort\\sc1.png");
		FileUtils.copyFile(screenshotAs, f);
	
	}

	@AfterTest

	public void closBroswer() {

		driver.quit();

	}

}
