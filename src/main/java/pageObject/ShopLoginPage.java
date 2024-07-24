package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class ShopLoginPage extends baseClass {
	
	public WebDriver driver;
	
	By email=By.cssSelector("input#field-email");
	By password=By.cssSelector("input#field-password");
	By submitBtn=By.cssSelector("button#submit-login");


	public ShopLoginPage() throws IOException {
		super();
	}
	
	public WebElement email() throws IOException  {
		this.driver=getDriver();
		return driver.findElement(email);	
	}
	
	public WebElement password() throws IOException  {
		this.driver=getDriver();
		return driver.findElement(password);	
	}
	
	public WebElement submitBtn() throws IOException  {
		this.driver=getDriver();
		return driver.findElement(submitBtn);	
	}

}
