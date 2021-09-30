package com.celt.menus;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.celt.userauthentication.Login;
import base_class.DriverSetup;
import pagefactory.NewsletterPF;

public class SearchNewsletter extends DriverSetup {
	//public static String newsletterUrl = "https://www.celtabroad.com/admin/newsletter";

	@Test
	public void testSearch() throws InterruptedException {
		Login login = new Login();
		login.testLogin();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get(newsletterUrl);
		NewsletterPF newsletter = PageFactory.initElements(driver, NewsletterPF.class);

		newsletter.verifyNewsletter();

	}

}
