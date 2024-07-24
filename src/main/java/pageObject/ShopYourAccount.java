package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class ShopYourAccount extends baseClass {
	
	public WebDriver driver;
	
	By heading=By.cssSelector("h1");
	By signOut=By.linkText(" Sign out");


	public ShopYourAccount() throws IOException {
		super();
	}
	
	public WebElement heading() throws IOException  {
		this.driver=getDriver();
		return driver.findElement(heading);	
	}

	public WebElement SignOut() throws IOException  {
		this.driver=getDriver();
		return driver.findElement(signOut);	
	}

	
}
