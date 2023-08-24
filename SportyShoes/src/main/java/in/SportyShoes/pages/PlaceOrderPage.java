package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {

	@FindBy(linkText="Cart")
	private WebElement cart;
	@FindBy(linkText="Place Order")
	private WebElement placeOrder;
	@FindBy(css="body > div:nth-child(3) > div > strong")
	private WebElement verifyTxt;
	
	
	
	public PlaceOrderPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	public void clickCart() {
		cart.click();
	}
	public void clickOnPlaceOrder() throws InterruptedException {
		Thread.sleep(2000);
		placeOrder.click();
	}
	public String verifyText() {
		String text=verifyTxt.getText();
		return text;
	}
}