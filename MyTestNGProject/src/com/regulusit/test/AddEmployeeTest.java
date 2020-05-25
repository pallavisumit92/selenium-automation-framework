package com.regulusit.test;

import org.testng.annotations.Test;

import com.regulusit.common.BasetTest;
import com.regulusit.page.AddEmployeePage;
import com.regulusit.page.HomePage;
import com.regulusit.page.LoginPage;
import com.regulusit.page.PIMPage;

public class AddEmployeeTest  extends BasetTest{
	@Test
	public void addNewEmployeeToSystem()
	{
		LoginPage lp=new LoginPage();
		lp.navigateToLoginPage();
		lp.loginWithUserNamePassword("Monali", "Monali@123");
		
		HomePage hp=new HomePage();
		hp.verifyWelcomeText("Welcome Admin");
		hp.navigateToPIMPage();
		//hp.navigateToAddEmployee();
		
		PIMPage pimp=new PIMPage();
		pimp.navigateToAddEmployee();
		
		AddEmployeePage aemp=new AddEmployeePage();
		aemp.addNewEmployee("MonaliTest1", "GhumatkarTest1");
		
		
		
	}

}
