package testCases.eBay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
//	public class WebdriverSetting {
		
		public WebDriver driverSettings() {
			System.setProperty("webdriver.chrome.driver", "F:\\Automation_Selenium\\WS\\eBay\\src\\test\\resources\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
		}
	}

//}
