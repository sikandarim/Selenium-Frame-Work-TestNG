package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class HomePage extends BasePage {
	
	
        WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath = "//*[@type = \"submit\"]")
	WebElement linkMyAccount;
	
	public void clickMyAccount() {
		linkMyAccount.click();
	}

}
