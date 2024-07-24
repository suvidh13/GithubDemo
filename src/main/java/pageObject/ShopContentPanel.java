package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class ShopContentPanel extends baseClass{
	
	public WebDriver driver;
	
	By continueShop=By.cssSelector(".cart-content-btn [data-dismiss]");
	By checkoutbtn=By.linkText("PROCEED TO CHECKOUT");
	
	public ShopContentPanel() throws IOException{
		super();
	}

	public WebElement continueShoping() throws IOException {
		this.driver=getDriver();
		return driver.findElement(continueShop);
		
	}
	
	public WebElement CheckOut() throws IOException {
		this.driver=getDriver();
		return driver.findElement(checkoutbtn);
	}
}
