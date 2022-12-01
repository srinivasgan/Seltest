package testCases.eBay;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objectRepository.ebay.EbayHomePage;
import objectRepository.ebay.signIn;
import static myVariables.UserVariables.*;

public class addToCat {
	@Test
	public void addToCart() {
		  
		  BrowserSetting bs = new BrowserSetting();

			WebDriver driver = bs.BrowserSettings();

			ebayLogin(driver);
		  
			Logger log = Logger.getLogger(addToCat.class);
			
			log.info("opening the driver");
	  }
	  
	  public  void ebayLogin(WebDriver driver) {
		  
		// account create
				// homepage's object access
				EbayHomePage ehp = new EbayHomePage(driver);
				
				
				 //Logger log = Logger.getLogger("ebayLogin");
				//log.info("opening eb driver");
				ehp.signInlinkpath().click();
				//log.debug("click on sign in ");
				signIn signi= new signIn(driver);
				
				//signi.editUserpath().sendKeys("vasu108@gmail.com");
				signi.editUserpath().sendKeys(USER_NAME);
				//signi.editUserpath().
			
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				signi.continueButtonpath().click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				signi.editPasspath().sendKeys("testqwer");
				signi.signInButtonpath().click();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				if (signi.elementErrorPath().isDisplayed()) {
					System.out.println("Login was failed");
				
					
				} else {
//					
						System.out.println("Login was Passed");
//					
				}
				
				
//				ehp.firstNameEditpath().sendKeys("Srinivas");
//				ehp.lastNameEditpath().sendKeys("gandrathi");
//				ehp.emailEditpath().sendKeys("vasu108@gmail.com");
//				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//				ehp.passEditpath().sendKeys("testqwer");
//				
//				ehp.registerbuttonpath().isDisplayed();
//				ehp.registerbuttonpath().isEnabled();
//				
//				ehp.registerbuttonpath().click();
				driver.quit();

//				// account create page's object access
//				MytheresaCreateAccountPage mcap = new MytheresaCreateAccountPage(driver);
	//
//				mcap.genderButtonPath().click();
	//
//				Select s = new Select(mcap.academicTitlePath());
//				s.selectByValue("");
	//
//				mcap.firstNamePath().sendKeys(USER_FIRST_NAME);
//				mcap.lastNamePath().sendKeys(USER_LAST_NAME);
//				mcap.emailAddressPath().sendKeys(USER_EMAIL);
//				mcap.passwordPath().sendKeys(USER_PASSWORD);
//				mcap.confirmPasswordPath().sendKeys(USER_PASSWORD);
//				mcap.registrationButtonPath().click();
	  }

}
