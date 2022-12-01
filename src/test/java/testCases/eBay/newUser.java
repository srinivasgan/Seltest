package testCases.eBay;

import org.testng.annotations.Test;

//import logintest1.test12;
import objectRepository.ebay.EbayHomePage;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

//import static variables.mytheresa.UserVariables.USER_EMAIL;
//import static variables.mytheresa.UserVariables.USER_FIRST_NAME;
//import static variables.mytheresa.UserVariables.USER_LAST_NAME;
//import static variables.mytheresa.UserVariables.USER_PASSWORD;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;

public class newUser {
  @Test
  public void createAccount() {
	  
	  BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		accountCreate(driver);
	  
		Logger log = Logger.getLogger(newUser.class);
		
		log.info("opening the driver");
  }
  
  public void accountCreate(WebDriver driver) {
	  
	// account create
			// homepage's object access
			EbayHomePage ehp = new EbayHomePage(driver);
			//log.info("opening eb driver");
			ehp.registerlinkpath().click();
			
			
			ehp.personalAcctRadiopath().click();
			ehp.personalAcctRadiopath().isEnabled();
			ehp.registerbuttonpath().isSelected();
			
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			ehp.firstNameEditpath().sendKeys("Srinivas");
			ehp.lastNameEditpath().sendKeys("gandrathi");
			ehp.emailEditpath().sendKeys("vasu108@gmail.com");
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			ehp.passEditpath().sendKeys("testqwerq");
			
			ehp.registerbuttonpath().isDisplayed();
			ehp.registerbuttonpath().isEnabled();
			
			ehp.registerbuttonpath().click();
			driver.quit();

//			// account create page's object access
//			MytheresaCreateAccountPage mcap = new MytheresaCreateAccountPage(driver);
//
//			mcap.genderButtonPath().click();
//
//			Select s = new Select(mcap.academicTitlePath());
//			s.selectByValue("");
//
//			mcap.firstNamePath().sendKeys(USER_FIRST_NAME);
//			mcap.lastNamePath().sendKeys(USER_LAST_NAME);
//			mcap.emailAddressPath().sendKeys(USER_EMAIL);
//			mcap.passwordPath().sendKeys(USER_PASSWORD);
//			mcap.confirmPasswordPath().sendKeys(USER_PASSWORD);
//			mcap.registrationButtonPath().click();
  }

//  @AfterMethod
//  public void afterMethod() {
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//  }

}
