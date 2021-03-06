package com.celt.userauthentication;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import pagefactory.LoginPagePF;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.*;

@Test
public class Login extends DriverSetup {

	// private static Logger log = LogManager.getLogger(Login.class.getName());

	@Test
	public void testLogin() throws InterruptedException {

		LoginPagePF login = PageFactory.initElements(driver, LoginPagePF.class);

		login.loginToCeltabroad("admin@admin.com", "admin123");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

}