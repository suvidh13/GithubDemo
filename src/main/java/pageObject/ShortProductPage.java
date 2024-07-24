package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.baseClass;

public class ShortProductPage extends baseClass {

	public WebDriver driver;
	
	By sizeOption=By.cssSelector("select[name='group[1]']");
	By quantityIncrease=By.cssSelector(".touchspin-up");
	By quantityDecrease=By.cssSelector(".touchspin-down");
	By addToCart=By.cssSelector("[data-button-action]");
	By homePage=By.xpath("//span[.='Home']");
	
	public ShortProductPage() throws IOException {
	super();	
	}
	
	public WebElement getSizeOption() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sizeOption);
	}
	
	public WebElement quantityIncre() throws IOException {
		this.driver=getDriver();
		return driver.findElement(quantityIncrease);
	}
	
	public WebElement quantitydecrea() throws IOException {
		this.driver=getDriver();
		return driver.findElement(quantityDecrease);
	}
	
	public WebElement addCart() throws IOException {
		this.driver=getDriver();
		return driver.findElement(addToCart);
	}
	
	public WebElement HomePage() throws IOException {
		this.driver=getDriver();
		return driver.findElement(homePage);
	}
}
