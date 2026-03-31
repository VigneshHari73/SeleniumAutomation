package tests;

import org.testng.annotations.Test;

import base.SeleniumBase;
import pages.LoginPage;

public class LoginTest extends SeleniumBase{
	
	@Test
	public void loginVlaidaton() {
		LoginPage logIn = new LoginPage(driver);

		logIn.enterUsername("admin@yourstore.com");
		logIn.enterPassword("admin");
		logIn.clickLoginButton();
		
		System.out.println(" Page title is"+driver.getTitle());
	}
	
	
	

}
