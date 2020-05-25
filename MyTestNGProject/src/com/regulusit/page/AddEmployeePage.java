package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.regulusit.common.WebDriverFactory;

public class AddEmployeePage 
	{
		@FindBy(id="firstName")
		WebElement userFirstName;
		
		@FindBy(id="lastName")
		WebElement userLastName;
		
		@FindBy(id="btnSave")
		WebElement saveButton;
		
		public AddEmployeePage()
		{
			PageFactory.initElements(WebDriverFactory.dr, this);
		}
		
		public void addNewEmployee(String strUserFirstName, String strUserLastName) 
		{
			userFirstName.sendKeys(strUserFirstName);
			userLastName.sendKeys(strUserLastName);
			saveButton.click();
			
		}


}
