package com.celt.menus;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.celt.userauthentication.Login;

import base_class.DriverSetup;
import pagefactory.LoginPagePF;
import pagefactory.NewsletterPF;

public class searchNewsletter extends DriverSetup{
	public static String newsletter = "https://www.celtabroad.com/admin/newsletter";
	
	@Test
	public void TestSearch() throws InterruptedException {
		Login login = new Login();
		login.testLogin();
		driver.get(newsletter);
		
		NewsletterPF newsletter = PageFactory.initElements(driver, NewsletterPF.class);
		
		
		newsletter.Search();
	
		
		
	}

}
