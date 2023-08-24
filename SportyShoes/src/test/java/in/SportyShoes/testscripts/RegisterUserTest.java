package in.SportyShoes.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.SportyShoes.pages.LandingPage;
import in.SportyShoes.pages.LoginPage;
import in.SportyShoes.pages.PlaceOrderPage;
import in.SportyShoes.pages.RegisterPage;
import in.SportyShoes.pages.AddProductToCartPage;

public class RegisterUserTest extends BaseTest{

	     @Test
		public void buyShoes() throws InterruptedException {
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickNewUserRegister();
		
		
		RegisterPage registerPage= new RegisterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    registerPage.enterName("meesala");
		registerPage.enterEmail("meesala@gmail.com");
		registerPage.enterPassword("123456");
	    registerPage.clickRegisterButton();
	    registerPage.clickLogout();
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail("meesala@gmail.com");
		loginPage.enterPassword("123456");
		loginPage.clickLogin();
		
		AddProductToCartPage addProductToCartPage=new AddProductToCartPage(driver);
		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)", "");
		addProductToCartPage.oneItemAdded();
		addProductToCartPage.clickHome();
		
		PlaceOrderPage  placeOrderPage=new PlaceOrderPage(driver);
		placeOrderPage.clickCart();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)", "");
	    placeOrderPage.clickOnPlaceOrder();
		
		String exceptedErrmsg="Success!";
	    String actualErrmsg=placeOrderPage.verifyText();
	    Assert.assertEquals(exceptedErrmsg,actualErrmsg);
	}

}
