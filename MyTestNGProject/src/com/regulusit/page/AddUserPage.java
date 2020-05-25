package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.regulusit.common.WebDriverFactory;

public class AddUserPage {
	@FindBy(id="systemUser_userType")
	WebElement userRoleDropDown;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement employeeUserName;
	
	@FindBy(id="systemUser_status")
	WebElement statusDropDown;
	
	@FindBy(id="systemUser_password")
	WebElement employeePassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmEmployeePassword;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}

	public void addUser(int intUserRole, String strEmployeeName, String strEmployeeUserName, int intUserStatus, String strEmployeePassword, String strEmployeeConfirmPassword)
	{
		Select userRoleObj=new Select(userRoleDropDown);
		userRoleObj.selectByIndex(intUserRole);
		
		employeeName.sendKeys(strEmployeeName);
		employeeUserName.sendKeys(strEmployeeUserName);
		
		Select statusObj=new Select(statusDropDown);
		statusObj.selectByIndex(intUserStatus);
		
		employeePassword.sendKeys(strEmployeePassword);
		confirmEmployeePassword.sendKeys(strEmployeeConfirmPassword);
		
		saveButton.click();
	}

}
