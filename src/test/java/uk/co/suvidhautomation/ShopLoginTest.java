package uk.co.suvidhautomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import base.Extendmanager;
import base.L03_Basepage;
import base.hooks;
import pageObject.ShopContentPanel;
import pageObject.ShopHomepage;
import pageObject.ShopLoginPage;
import pageObject.ShopYourAccount;
import pageObject.ShopingCart;
import pageObject.ShortProductPage;

@Listeners(resources.Listeners.class)

public class ShopLoginTest extends hooks {
	public ShopLoginTest() throws IOException {
		super();
	}

	@Test
	public void endToEndtest() throws InterruptedException, IOException {

		Extendmanager.log("Starting AddRemoveItemBasketTest....");

		ShopHomepage shophome = new ShopHomepage();
		Extendmanager.pass("Reached the Shop homepage");
		shophome.loginBtn().click();
		
		FileInputStream workLocation=new FileInputStream(System.getProperty("user.dir") + 
				"src\\main\\java\\resources\\credentials.xlsx" );
		
		XSSFWorkbook workbook=new XSSFWorkbook(workLocation);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cellR1C0 =row1.getCell(0);
		XSSFCell cellR1C1 =row1.getCell(1);
		
		String emailRow1=cellR1C0.toString();
		String passwordRow1=cellR1C1.toString();
		
		System.out.println(emailRow1);
		System.out.println(passwordRow1);
		
		ShopLoginPage shop=new ShopLoginPage();
		shop.email().sendKeys(emailRow1);
		shop.password().sendKeys(passwordRow1);
		shop.submitBtn().click();
		
		ShopYourAccount yourAcc=new ShopYourAccount();
		try {
		yourAcc.SignOut().click();
		Extendmanager.pass("User has Signed In");
		}catch(Exception e) {
			Extendmanager.fail("User could not signed in");
			Assert.fail();
		}
		
		XSSFRow row2=sheet.getRow(2);
		XSSFCell cellR2C0 =row1.getCell(0);
		XSSFCell cellR2C1 =row1.getCell(1);
		

		String emailRow2=cellR2C0.toString();
		String passwordRow2=cellR2C1.toString();
		
		shop.email().sendKeys(emailRow2);
		shop.password().sendKeys(passwordRow2);
		shop.submitBtn().click();
		
		try {
			yourAcc.SignOut().click();
			Extendmanager.pass("User has Signed In");
			}catch(Exception e) {
				Extendmanager.fail("User could not signed in");
				Assert.fail();
			}
		
		
		
			}
}
