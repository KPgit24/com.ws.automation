package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class LoginPage extends DriverScript {
//***************************Page Elements*****************//
	
	@FindBy(id = "Email") WebElement emailTextBox;
	@FindBy(name = "Password") WebElement passwordTextBox;
	@FindBy(xpath = "//input[@value='Log in']") WebElement loginButton;
	@FindBy(xpath = "//a[@href='/passwordrecovery']")WebElement forgotPasswordLink;
	
//**************************Page Initialization***********//
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
//***************************Page Actions/Methods**********//	
	public void enterEmail(String email)
	{
		emailTextBox.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public boolean isForgotPasswordLinkDisplayed()
	{
		return forgotPasswordLink.isDisplayed();
	}
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}

}
