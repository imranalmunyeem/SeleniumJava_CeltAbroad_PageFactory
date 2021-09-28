package com.celt.userauthentication;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import pagefactory.LoginPage_PF;

@Test
public class Login extends DriverSetup {
	public static String baseUrl = "https://www.celtabroad.com/admin/login";

	@Test
	public void TestLogin() throws InterruptedException {

		driver.get(baseUrl);

		LoginPage_PF login = PageFactory.initElements(driver, LoginPage_PF.class);

		login.enterEmail();
		login.enterPassword();
		login.clickOnLogin();

	}

}