package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductToCartPage {      //HOME
   
	WebDriver driver;
	@FindBy(xpath="//a[contains(@href,'add-to-cart?id=101')][1]")
	private WebElement firstItemAddedToCart;

	@FindBy(linkText="Home")
	private WebElement home;
	public AddProductToCartPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	public void oneItemAdded() throws InterruptedException {
	
		Thread.sleep(2000); 
		firstItemAddedToCart.click();
	}
	public void clickHome() {
		home.click();
	}

}	
