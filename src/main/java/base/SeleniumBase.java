package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;

public class SeleniumBase {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();
		Log.info("String the web browse");
		driver.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver != null) {
			Log.info("Closing the browser");
			driver.quit();
		}
	}
	
	
	
	
		
	

}
