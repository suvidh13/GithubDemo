package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class HomePage extends baseClass{

	public WebDriver driver;
	
	By toggle=By.cssSelector(".toggle");
	By homepageLink=By.linkText("HOMEPAGE");
	By accordian=By.linkText("ACCORDION");
	By browserTab=By.linkText("BROWSER TABS");
	By buttonsLink = By.linkText("BUTTONS");
	By calcLink = By.linkText("CALCULATOR (JS)");
	By contactUsLink = By.linkText("CONTACT US FORM TEST");
	By datePickerLink = By.linkText("DATE PICKER");
	By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
	By fileUpload = By.linkText("FILE UPLOAD");
	By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
	By iFrameLink = By.linkText("IFRAME");
	By loaderLink = By.linkText("LOADER");
	By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
	By mouseLink = By.linkText("MOUSE MOVEMENT");
	By popupLink = By.linkText("POP UPS & ALERTS");
	By predictiveLink = By.linkText("PREDICTIVE SEARCH");
	By tablesLink = By.linkText("TABLES");
	By testStoreLink = By.linkText("TEST STORE");
	By aboutMeLink = By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");

	//due to error this line is added


	public HomePage() throws IOException{
		super();
	}
	
	public WebElement getToggle() throws IOException {
		this.driver=getDriver();
		return driver.findElement(toggle);
	}
	
	public WebElement getHomepageLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(homepageLink);
	}
	
	public WebElement getAccordionLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(accordian);
	}	
	
	public WebElement getBrowserTabLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(browserTab);
	}	

	public WebElement getButtonLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(buttonsLink);
	}	
	
	public WebElement getCalcLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(calcLink);
	}	
	
	public WebElement getContactUsLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(contactUsLink);
	}	
	
	public WebElement getDatePickerLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(datePickerLink);
	}	
	
	public WebElement getDropdownLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(dropdownLink);
	}	
	
	public WebElement getFileUploadLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(fileUpload);
	}	
	
	public WebElement getHiddenElementsLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(hiddenElementsLink);
	}	
	
	public WebElement getIframeLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(iFrameLink);
	}	
	
	public WebElement getLoaderLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(loaderLink);
	}	
	
	public WebElement getLoginPortalLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(loginPortalLink);
	}	
	
	public WebElement getMouseLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(mouseLink);
	}	
	
	public WebElement getPopupLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(popupLink);
	}	
	
	public WebElement getPredictiveLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(predictiveLink);
	}	
	
	public WebElement getTablesLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(tablesLink);
	}	
	
	public WebElement getTestStoreLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(testStoreLink);
	}	
	
	public WebElement getAboutMeLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(aboutMeLink);
	}

	public WebElement getCookie() throws IOException {
		this.driver=getDriver();
		return driver.findElement(cookie);
	}
}
