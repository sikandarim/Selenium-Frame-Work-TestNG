package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage  {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		
		//It helps to implement the pageObject Model in selenium Frame work
		// sPageFactory.initElements(driver, this) statement initializes the page element so that you can work directly on the element without getting the NullPointerException (since the page object has been initialized implicitly).
		PageFactory.initElements(driver, this);
	}

}
