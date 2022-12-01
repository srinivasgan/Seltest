package objectRepository.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	WebElement editUserId;
	
	@FindBy(xpath="//button[@id='signin-continue-btn']")
	WebElement buttonContinue;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement editPassword;
	
	@FindBy(css="#sgnBt")
	WebElement buttonSignIn;
	
	@FindBy(css="#errormsg")
	WebElement elementError;
	
	
	
	
	//Constructor
		public signIn (WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public WebElement editUserpath() {
			return editUserId;
		}
		
		public WebElement continueButtonpath() {
			return buttonContinue;
		}
		
		public WebElement editPasspath() {
			return editPassword;
		}

		
		public WebElement signInButtonpath() {
			return buttonSignIn;
		}
		
		public WebElement elementErrorPath() {
			return elementError;
		}
}
