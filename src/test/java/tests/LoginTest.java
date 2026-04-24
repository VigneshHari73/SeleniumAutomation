package tests;

import org.testng.annotations.Test;

import base.SeleniumBase;
import pages.LoginPage;

public class LoginTest extends SeleniumBase {
	
	@Test(priority = 2)
	public void loginVlaidaton() {
		LoginPage logIn = new LoginPage(driver.get());

		logIn.enterUsername("admin@yourstore.com");
		logIn.enterPassword("admin");
		logIn.verifyTitle();
		
		System.out.println(" Page title is"+driver.get().getTitle());
	}
	
	
	@Test(groups= {"smoke"}, priority = 1)
	public void loginVlaidatonNegative() {
		LoginPage logIn = new LoginPage(driver.get());

	    logIn.verifyTitle();
		System.out.println(" Page title is for smoke an sanity "+driver.get().getTitle());
	}
	
	@Test(dependsOnGroups = {"sanity"}, groups= {"regression"},priority = 1)
	public void loginVlaidatonNegative1() {
		LoginPage logIn = new LoginPage(driver.get());

	    logIn.verifyTitle();
		System.out.println(" Page title is for Regression "+driver.get().getTitle());
	}
	
	@Test(dependsOnGroups = {"smoke"}, groups= {"sanity"},priority = 1)
	public void loginVlaidatonNegative3() {
		LoginPage logIn = new LoginPage(driver.get());

	    logIn.verifyTitle();
		System.out.println(" Page title is sanity "+driver.get().getTitle());
	}

}
