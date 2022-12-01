package objectRepository.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage {

	
	WebDriver driver;
	
	@FindBy(linkText="register")
	WebElement linkRegister;
	
	@FindBy(linkText="Sign in")
	WebElement linkSignIn;
	
	@FindBy(xpath="//input[@id='personalaccount-radio']")
	WebElement  radioPersonAccount;
	
	@FindBy(css="#firstname")
	WebElement  editboxFirstName;
	
	@FindBy(css="#lastname")
	WebElement  editboxLastName; 
	
	@FindBy(id="Email")
	WebElement  editboxEmail; 
	
	@FindBy(id="password")
	WebElement  editboxPassword;
	
	@FindBy(css="#EMAIL_REG_FORM_SUBMIT")
	WebElement  buttonRegister; 
	
	//Constructor
	public EbayHomePage (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement registerlinkpath() {
		return linkRegister;
	}
	
	public WebElement signInlinkpath() {
		return linkSignIn;
	}
	
	public WebElement personalAcctRadiopath() {
		return radioPersonAccount;
	}
	
   public WebElement firstNameEditpath() {
	    return editboxFirstName;
	}
   
   public WebElement lastNameEditpath() {
		return editboxLastName;
	}
   
   public WebElement emailEditpath() {
		return editboxEmail;
	}
   
   public WebElement passEditpath() {
		return editboxPassword;
	}
	
   public WebElement registerbuttonpath() {
		return buttonRegister;
	}
	
   
}
