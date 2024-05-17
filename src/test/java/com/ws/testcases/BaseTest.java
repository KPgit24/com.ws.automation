package com.ws.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ws.base.DriverScript;
import com.ws.pages.HomePage;
import com.ws.pages.LoginPage;
import com.ws.pages.PasswordRecoveryPage;
import com.ws.pages.UserHomePage;

public class BaseTest extends DriverScript {
	HomePage homePage;
	LoginPage loginPage;
	UserHomePage userHomepage;
	PasswordRecoveryPage passwordrecoverypage;
	
	@BeforeMethod
	public void setup()
	{
		initApplication();
		homePage = new HomePage();
		loginPage = new LoginPage();
		userHomepage = new UserHomePage();
		passwordrecoverypage = new PasswordRecoveryPage();
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		quitDriver();
	}
}
