package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.regulusit.common.WebDriverFactory;

public class HomePage {
	@FindBy(id="welcome")
	WebElement welcomText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimTab;
	
	/*@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployeeTab;*/
	
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}

	public void verifyWelcomeText(String expectedWelcomeText)
	{
		Assert.assertEquals(welcomText.getText(), expectedWelcomeText);
	}
	
	public void navigateToAdminPage()
	{
		adminTab.click();
	}
	
	public void navigateToPIMPage()
	{
		pimTab.click();
		
	}
	
	/*public void navigateToAddEmployee()
	{
		addEmployeeTab.click();
	}*/

}
