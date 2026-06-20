package com.Framework.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import utility.BrowserFactory;
import utility.ExcelDataReader;




public class LoginEasyCalculation extends BaseClass {
	
	@Test
	public void LoginUser() throws Exception {
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("TestData", 0, 0);
		
		LoginPage Report = PageFactory.initElements(driver, LoginPage.class);
		Report.login_EasyCal(excel.getStringData("TestData", 0, 0), excel.getStringData("TestData", 0, 1));
		Thread.sleep(1000);
		
		
	}
}
