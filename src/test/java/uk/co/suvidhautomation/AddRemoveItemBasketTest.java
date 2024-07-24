package uk.co.suvidhautomation;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Extendmanager;
import base.L03_Basepage;
import base.hooks;
import pageObject.ShopContentPanel;
import pageObject.ShopHomepage;
import pageObject.ShopingCart;
import pageObject.ShortProductPage;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends hooks {
	public AddRemoveItemBasketTest() throws IOException {
		super();
	}

	@Test
	public void endToEndtest() throws InterruptedException, IOException {

		Extendmanager.log("Starting AddRemoveItemBasketTest....");

		ShopHomepage shophome = new ShopHomepage();
		Extendmanager.pass("Reached the Shop homepage");
		shophome.getProdOne().click();

		ShortProductPage shopProd = new ShortProductPage();
		Extendmanager.pass("Reached the Shop product page");
		Select option = new Select(shopProd.getSizeOption());
		option.selectByVisibleText("M");
		Extendmanager.pass("Have successfully selected product size");
		shopProd.quantityIncre().click();
		Extendmanager.pass("Have successfully selected increased quantity");
		shopProd.addCart().click();
		Extendmanager.pass("Have succsfully added product to basket");

		Thread.sleep(5000);

		ShopContentPanel cpanel1 = new ShopContentPanel();
		cpanel1.continueShoping().click();

		shopProd.HomePage().click();

		shophome.getProdTwo().click();

		shopProd.addCart().click();

		cpanel1.CheckOut().click();

		ShopingCart shopcart = new ShopingCart();
		shopcart.deleteItemTwo().click();

		// error fluent wait(amount value is showing for two products)

		/*
		 * waitForElementInvisible(shopcart.deleteItemTwo(), 10);
		 */

		System.out.println(shopcart.totalValue().getText());

		try {
			Assert.assertEquals(shopcart.totalValue().getText(), "$73.96");
			Extendmanager.pass("The total amount matches the expected amount.");
		} catch (AssertionError e) {
			Assert.fail("Cart amount did not match the extend amount, it found" + shopcart.totalValue().getText()
					+ "expected $45.23");
			Extendmanager.fail("Total amount did not match the expected amount");
		}

	}
}
