package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;

public class SeleniumBase {
	
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


	public WebDriver getDriver() {
	    return driver.get();
	}

	
	
	@BeforeMethod(groups= {"sanity", "regression"}, alwaysRun=true)
	public void setUp() {
		
		driver.set(new ChromeDriver());
		Log.info("String the web browse");
		driver.get().get("https://selectorshub.com/xpath-practice-page/");
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod(groups= {"sanity","regression"}, alwaysRun=true)
	public void tearDown() {
		
		if(driver != null) {
			Log.info("Closing the browser");
			driver.get().quit();
		}
	}
	
	
	
	
		
	

}
