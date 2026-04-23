package tests;

import org.testng.annotations.Test;

import base.SeleniumBase;
import pages.LoginPage;

public class LoginTest extends SeleniumBase {
	
	@Test(priority = 2)
	public void loginVlaidaton() {
		LoginPage logIn = new LoginPage(driver);

		logIn.enterUsername("admin@yourstore.com");
		logIn.enterPassword("admin");
		logIn.verifyTitle();
		
		System.out.println(" Page title is"+driver.getTitle());
	}
	
	
	@Test(groups= {"sanity, regression"}, priority = 1)
	public void loginVlaidatonNegative() {
		LoginPage logIn = new LoginPage(driver);

	    logIn.verifyTitle();
		System.out.println(" Page title is for regression an sanity"+driver.getTitle());
	}
	
	@Test(groups= {"Regression"},priority = 1)
	public void loginVlaidatonNegative1() {
		LoginPage logIn = new LoginPage(driver);

	    logIn.verifyTitle();
		System.out.println(" Page title is for Regression"+driver.getTitle());
	}
	
	@Test(groups= {"Smoke"},priority = 1)
	public void loginVlaidatonNegative3() {
		LoginPage logIn = new LoginPage(driver);

	    logIn.verifyTitle();
		System.out.println(" Page title is Smoke"+driver.getTitle());
	}

}
