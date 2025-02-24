package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AccountRegistrationPage extends BasePage{
	
	//WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(xpath = "")
	WebElement linkMyAccount;
	
	public void clickMyAccount() {
		linkMyAccount.click();
	}

}
