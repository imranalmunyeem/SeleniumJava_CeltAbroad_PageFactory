package com.celt.userauthentication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_class.DriverSetup;
import pagefactory.LoginPagePF;

public class InvalidLogin extends DriverSetup{
	@Test
	public void testLogin() throws InterruptedException {

		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);

		login.loginToCeltabroad("admin@wrong.com", "admin000");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
}