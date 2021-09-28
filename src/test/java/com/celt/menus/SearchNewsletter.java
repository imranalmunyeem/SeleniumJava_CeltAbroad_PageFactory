package com.celt.menus;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_class.DriverSetup;
import pagefactory.LoginPage_PF;
import pagefactory.Newsletter_PF;

public class SearchNewsletter extends DriverSetup{
	public static String newsletter = "https://www.celtabroad.com/admin/newsletter";
	
	@Test
	public void TestSearch() {
		driver.get(newsletter);
		Newsletter_PF newsletter = PageFactory.initElements(driver, Newsletter_PF.class);
		
		newsletter.Search();
		
		
	}

}
