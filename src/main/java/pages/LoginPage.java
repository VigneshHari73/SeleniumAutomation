package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver driver;

	private By userName = By.id("Email");
	private By password = By.id("Password");

	private By button = By.xpath("//button[@type='submit']");
	
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

	
}
