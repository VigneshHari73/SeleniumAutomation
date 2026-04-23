package pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	
	private WebDriver driver;

	private By userName = By.id("shub46");
	private By password = By.id("pass");
	private By button = By.xpath("//button[@type='submit']");
	private By companyName = By.xpath("//input[@name=\"company\"]");
	
	public LoginPage(WebDriver driver) {		
		this.driver = driver;
	}
	
	public void enterUsername(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void enterPassword(String pWord) {
		driver.findElement(password).sendKeys(pWord);
	}
	
	public void clickLoginButton() {
		driver.findElement(button).click();
	}
	
	public void verifyTitle() {
		String extitle = "Xpath Practice Page | Shadow dom, nested shadow dom, iframe, nested iframe and more complex automation scenarios.";
		String title = driver.getTitle();
		Assert.assertEquals(title, extitle);
	}
	

	
}
