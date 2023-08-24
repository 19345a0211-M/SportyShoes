package in.SportyShoes.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//1.open the Browser
	    driver = new ChromeDriver();
	    
	    //2.Maximize it
	    driver.manage().window().maximize();
				
		//3.Navigate to application
		driver .get("http://localhost:9010/");
	}
	
	// close the browser
		@AfterTest
		public void closeBrowser() {
		driver.quit();
		}

}
