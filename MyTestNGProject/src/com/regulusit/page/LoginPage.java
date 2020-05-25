package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.regulusit.common.WebDriverFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement userPassword;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}
	
	public void navigateToLoginPage() 
	{
		WebDriverFactory.dr.get("https://opensource-demo.orangehrmlive.com");
	}
	
	public void loginWithUserNamePassword(String strUserName, String strUserPassword)
	{
		userName.sendKeys(strUserName);
		userPassword.sendKeys(strUserPassword);
		loginButton.click();
	}
}
