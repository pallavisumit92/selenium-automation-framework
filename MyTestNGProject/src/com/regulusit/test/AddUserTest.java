package com.regulusit.test;

import org.testng.annotations.Test;

import com.regulusit.common.BasetTest;
import com.regulusit.page.AddUserPage;
import com.regulusit.page.AdminPage;
import com.regulusit.page.HomePage;
import com.regulusit.page.LoginPage;



@Test
public class AddUserTest extends BasetTest
{
	
	public void addNewUser() 
	{
	LoginPage lp=new LoginPage();

	lp.navigateToLoginPage();
	lp.loginWithUserNamePassword("Monali", "Monali@123");
	
	HomePage hp=new HomePage();
	hp.verifyWelcomeText("Welcome Admin");
	hp.navigateToAdminPage();
	
	AdminPage ap=new AdminPage();
	ap.navigateToAddUserPage();
	
	AddUserPage aup=new AddUserPage();
	aup.addUser(0, "John Smith", "MonaliGhumatkar", 1, "Monali@#09876", "Monali@#09876");

}
}
