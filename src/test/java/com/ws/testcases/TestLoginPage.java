package com.ws.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {
	//ctrl+shift o to clear unused imports
	@Test(priority = 1, enabled = false)
	public void testLoginPageTitle()
	{
		homePage.clickLoginLink();
		String title = loginPage.getLoginPageTitle();
		System.out.println("Page title: "+title);
		Assert.assertTrue(title.contains("Login"));
	}
	@Test(priority = 2, enabled = false)
	public void testLoginFunction()
	{
		homePage.clickLoginLink();
		loginPage.enterEmail("selauto1@test.com");
		loginPage.enterPassword("Pass@123");	
		loginPage.clickLoginButton();
		boolean flag = userHomepage.isLogoutLinkDisplayed();
		Assert.assertTrue(flag);
		userHomepage.clickLogout();
	}
	
	@Test(priority = 3, enabled = false)
	public void testForgotPasswordDisplayed()
	{
		homePage.clickLoginLink();
		boolean flag = loginPage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority = 4, enabled = false)
	public void testPasswordRecovery()
	{
		homePage.clickLoginLink();
		passwordrecoverypage.clickforgotPassword();
		String title = passwordrecoverypage.getpasswordRecoveryPageTitle();
		System.out.println("Password Recovery page title: "+title);
		passwordrecoverypage.enterEmail("selauto1@test.com");
		passwordrecoverypage.clickrecover();
		String txt = passwordrecoverypage.getresultmessage();
		Assert.assertTrue(txt.contains("Email"));
		System.out.println("Result text: "+txt);
	}
	@Test(priority = 5, enabled = true)
	public void testPasswordRecoveryFailure()
	{
		homePage.clickLoginLink();
		passwordrecoverypage.clickforgotPassword();
		passwordrecoverypage.enterEmail("santosh1@test.com");
		passwordrecoverypage.clickrecover();
		String failuretxt = passwordrecoverypage.getrecoverymailfailuretext();
		Assert.assertTrue(failuretxt.contains("not found"));
		System.out.println("Incorrect email result text: "+failuretxt);
	}

}
