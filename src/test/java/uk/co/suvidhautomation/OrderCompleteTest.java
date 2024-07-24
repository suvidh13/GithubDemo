package uk.co.suvidhautomation;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Extendmanager;
import base.L03_Basepage;
import base.baseClass;
import base.hooks;
import pageObject.HomePage;
import pageObject.OrderFormDelivery;
import pageObject.OrderFormPayment;
import pageObject.OrderFormPersInfo;
import pageObject.OrderFormShippingMethod;
import pageObject.ShopContentPanel;
import pageObject.ShopHomepage;
import pageObject.ShopingCart;
import pageObject.ShortProductPage;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends hooks{

	public OrderCompleteTest()throws IOException{
		super();
	}
	
	
	@Test
	public void endToEndtest() throws InterruptedException, IOException {
		
		Extendmanager.log("Starting OrderCompleteTest...");
		
		//Main Page getting an error
		/*HomePage home=new HomePage(driver);
		home.getToggle().click();
		home.getTestStoreLink().click();*/
		
		ShopHomepage shophome=new ShopHomepage();
		shophome.getProdOne().click();
		
		Extendmanager.pass("Have successfully clicked on product");
		
		ShortProductPage shopProd=new ShortProductPage();
		Extendmanager.pass("Have successfully reached shopproduct page");
		Select option=new Select(shopProd.getSizeOption());
		option.selectByVisibleText("M");
		Extendmanager.pass("Have successfully selected product size");
		shopProd.quantityIncre().click();
		Extendmanager.pass("Have successfully increased quanity");
		shopProd.addCart().click();
		Extendmanager.pass("Have successfully added Item to cart");
		
		Thread.sleep(5000);
		
		ShopContentPanel cpanel1=new ShopContentPanel();
		cpanel1.CheckOut().click();
		
		ShopingCart cart=new ShopingCart();
		Extendmanager.pass("Have successfully reached shoping cart page");
		cart.promocode().click();
		Extendmanager.pass("Have successfully selected promo code button");
		cart.promoTextBox().sendKeys("20OFF");
		cart.promoadd().click();
		cart.proceedCheckOut().click();
		Extendmanager.pass("Have successfully selected checkout button");
		Thread.sleep(2000);
		
		OrderFormPersInfo pInfo=new OrderFormPersInfo();
		pInfo.getGenderMr().click();
		pInfo.getFirstNameField().sendKeys("Jonh");
		pInfo.getLastnameField().sendKeys("cena");
		pInfo.getEmailField().sendKeys("Johncena@test.com");
		pInfo.getTermsConditionsCheckbox().click();
		pInfo.getContinueBtn().click();
		Extendmanager.pass("Have successfully entered customer details");
		
		OrderFormDelivery orderDelivery=new OrderFormDelivery();
		orderDelivery.getAddressField().sendKeys("123 main street");
		orderDelivery.getCityField().sendKeys("karla");
		Select state=new Select(orderDelivery.getStateDropdown());
	    state.selectByVisibleText("Texas");
	    orderDelivery.getPostcodeField().sendKeys("77021");
	    orderDelivery.getContinueBtn()	.click();
	    Extendmanager.pass("Have successfully entered delivery details");
	    
	    OrderFormShippingMethod orderMethod=new OrderFormShippingMethod();
	    orderMethod.getDeliveryMsgTextbox().sendKeys("If im not in, please delivery on my proch.");
	    orderMethod.getContinueBtn().click();
	    Extendmanager.pass("Have successfully selected the shipping method");
	    
	    OrderFormPayment orderPayment=new OrderFormPayment();
	    orderPayment.getPayByCheckRadioBtn().click();
	    orderPayment.getTermsConditionsCheckbox().click();
	    orderPayment.getOrderBtn().click();
	    Extendmanager.pass("Have successfully placed order");
	    
	    
	    
	}
	
}
