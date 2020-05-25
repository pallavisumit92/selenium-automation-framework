package com.regulusit.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl  implements IInvokedMethodListener 

{

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) 
		// TODO Auto-generated method stub
		
		{
			WebDriverFactory.dr.quit();
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriverFactory.dr=new ChromeDriver();
		// TODO Auto-generated method stub
		
	}
	
	
}
