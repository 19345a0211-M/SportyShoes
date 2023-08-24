package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class RegisterPage {
		
		WebDriver driver;
		@FindBy(id="name")
		private WebElement username ;
		@FindBy(id="email")
		private WebElement emailId ;
		@FindBy(id="password")
		private WebElement pass ;
	    @FindBy(xpath="//button[contains(@type,'submit')]")
	    private WebElement RegisterBtn;
	    @FindBy(linkText="Logout")
		private WebElement logout;
	    
	    
	public RegisterPage(WebDriver driver) {
			 PageFactory.initElements(driver,this);
		}
	
		public void enterName(String name) {
             username.sendKeys(name);
		}
		
	    public void enterEmail(String mailId) {
			emailId.sendKeys(mailId);
	    }
	    
	    public void enterPassword(String password) {	
			pass.sendKeys(password);
	    }
	   
	  public void clickRegisterButton()  {		  
	        RegisterBtn.click();
	    }
	  
	  public void clickLogout() {
		  logout.click();
	    }
} 
