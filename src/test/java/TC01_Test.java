import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_Test extends BaseClass {
	
	 public WebDriver driver;
	 
	 
	 
	 
	 @Test
		public void verify_account() {
			try{
				logger.info("My Login Information");
				HomePage home = new HomePage(driver);
				home.clickMyAccount();
				//creating the instance of the java class
				//Call the methods inside
			}catch(Exception e) {
				logger.error("Test failed");
			//	Assert.fail();
			}
			
			
		}

}
