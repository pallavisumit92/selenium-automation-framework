package com.regulusit.test;

import org.testng.annotations.Test;

import com.regulusit.common.BasetTest;
import com.regulusit.page.HomePage;
import com.regulusit.page.LoginPage;

public class LoginTest extends BasetTest
{
@Test
public void verifyAdminLoginSuccessfull()
{

	LoginPage lp=new LoginPage();
	lp.navigateToLoginPage();
	lp.loginWithUserNamePassword("Admin", "admin@123");
	
	HomePage hp=new HomePage();
	hp.verifyWelcomeText("Welcome Admin");
	hp.navigateToAdminPage();
}
}
