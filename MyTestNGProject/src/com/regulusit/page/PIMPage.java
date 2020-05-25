package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.regulusit.common.WebDriverFactory;

public class PIMPage {
	@FindBy(id="btnAdd")
	WebElement addButton;
	
	public PIMPage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}
	
	public void navigateToAddEmployee()
	{
		addButton.click();
	}
}
