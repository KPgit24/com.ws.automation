package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class PasswordRecoveryPage extends DriverScript {
//*******************************Page Elements*****************//
	
		@FindBy(xpath = "//a[@href='/passwordrecovery']")WebElement forgotPasswordLink;
		@FindBy(id = "Email") WebElement emailTextBox;
		@FindBy(name = "send-email") WebElement recoverbutton;
		@FindBy(className = "result") WebElement resulttxt;
		@FindBy(xpath = "//div[@class='result']") WebElement PRfailuretxt;
//*****************************Page Initialization***********//
		public PasswordRecoveryPage()
		{
			PageFactory.initElements(driver, this);
		}
//******************************Page Actions/Methods**********//	
		public void clickforgotPassword()
		{
			forgotPasswordLink.click();
		}
		public String getpasswordRecoveryPageTitle()
		{
			return driver.getTitle();
		}
		public void enterEmail(String email)
		{
			emailTextBox.sendKeys(email);
		}
		public void clickrecover()
		{
			recoverbutton.click();
		}
		public String getresultmessage()
		{
			return resulttxt.getText();
		}
		public String getrecoverymailfailuretext()
		{
			return PRfailuretxt.getText();
		}
}
