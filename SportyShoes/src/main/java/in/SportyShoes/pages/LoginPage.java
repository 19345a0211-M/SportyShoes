package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		@FindBy(id="email")
		private WebElement loginEmailId ;
		
		@FindBy(id="password")
		private WebElement loginPassword ;
		
		@FindBy(xpath="//button[contains(@type,'submit')]")
		private WebElement loginBtn;
		
		
		public LoginPage(WebDriver driver) {
			 PageFactory.initElements(driver,this);
		}
		
	    public void enterEmail(String mailId)  {	
			loginEmailId.sendKeys(mailId);
	    }
	
	     public void enterPassword(String password)  {		   
			loginPassword.sendKeys(password);
	     }
	   
	   public void clickLogin() {		  
		   loginBtn.click();
	   }
		
}
