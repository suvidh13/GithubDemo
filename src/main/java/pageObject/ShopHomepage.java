package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class ShopHomepage extends baseClass{
	
	public WebDriver driver;
	
	By productone= By.linkText("Hummingbird Printed T-Shirt");
	By producttwo= By.linkText("Hummingbird Printed Sweater");
	By productThree = By.linkText("The Best Is Yet To Come'...");
	By productFour = By.linkText("The Adventure Begins Framed...");
	By productFive = By.linkText("Today Is A Good Day Framed...");
	By productSix = By.linkText("Mug The Best Is Yet To Come");
	By productSeven = By.linkText("Mug The Adventure Begins");
	By productEight = By.linkText("Mug Today Is A Good Day");
	By loginBtn=By.cssSelector(".user-info .hidden-sm-down");

	
	public ShopHomepage() throws IOException {
		super();
	}
	
	public WebElement getProdOne() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productone);
	}
	
	public WebElement getProdTwo() throws IOException {
		this.driver=getDriver();
		return driver.findElement(producttwo);
	}

	public WebElement getProdThree() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productThree);
	}	
	
	public WebElement getProdFour() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productFour);
	}	

	public WebElement getProdFive() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productFive);
	}	
	
	public WebElement getProdSix() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productSix);
	}	
	
	public WebElement getProdSeven() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productSeven);
	}	
	
	public WebElement getProdEight() throws IOException {
		this.driver=getDriver();
		return driver.findElement(productEight);
	}
	
	public WebElement loginBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(loginBtn);
	}
	

}
