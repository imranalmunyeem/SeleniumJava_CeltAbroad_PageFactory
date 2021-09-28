package com.celt.userauthentication;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import pagefactory.LoginPagePF;
import org.apache.logging.log4j.*;

@Test
public class Login extends DriverSetup {
	
	//private static Logger log = LogManager.getLogger(Login.class.getName());
	public static String loginUrl = "https://www.celtabroad.com/public/admin/login";

	@Test
	public void testLogin() throws InterruptedException {

		driver.get(loginUrl);

		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);

		login.loginToCeltabroad();

	}

}