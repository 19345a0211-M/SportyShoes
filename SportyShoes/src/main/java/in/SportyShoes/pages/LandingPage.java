package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	@FindBy(linkText ="New User? Register Here")
	private WebElement NewUserRegister;
	
	public LandingPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	
	public void clickNewUserRegister() throws InterruptedException {	
		NewUserRegister.click();	
	}
}
