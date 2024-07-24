package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class ShopingCart extends baseClass {
	
	public WebDriver driver;
	
	By promocode=By.linkText("Have a promo code?");
	By promoTextbox=By.cssSelector("input[name='discount_name']");
	By promoAddbtn=By.cssSelector("form[method='post']  span");
	By proceedToCheckout=By.linkText("PROCEED TO CHECKOUT");
	By deleteItemone=By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By deleteItemtwo=By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalvalue=By.cssSelector(".cart-total .value");
	
	public ShopingCart() throws IOException {
		super();
	}
	
	public WebElement promocode() throws IOException  {
		this.driver=getDriver();
		return driver.findElement(promocode);	
	}
	
	public WebElement promoTextBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(promoTextbox);	
	}
	
	public WebElement promoadd() throws IOException {
		this.driver=getDriver();
		return driver.findElement(promoAddbtn);	
	}
	
	public WebElement proceedCheckOut() throws IOException {
		this.driver=getDriver();
		return driver.findElement(proceedToCheckout);	
	}
	
	public WebElement deleteItemOne() throws IOException {
		this.driver=getDriver();
		return driver.findElement(deleteItemone);	
	}
	
	public WebElement deleteItemTwo() throws IOException {
		this.driver=getDriver();
		return driver.findElement(deleteItemtwo);	
	}
	
	public WebElement totalValue() throws IOException {
		this.driver=getDriver();
		return driver.findElement(totalvalue);	
	}

}
