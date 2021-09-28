package com.celt.titles;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import base_class.DriverSetup;

@Test
public class PageTitle extends DriverSetup {
	public static String baseUrl = "https://www.celtabroad.com/admin/login";

	@Test
	public void TestTitle() {

		// Navigate to the Website
		String expectedTitle = "Celt";
		driver.get(baseUrl);

		// Actual
		String actualTitle = driver.getTitle();
		System.out.println("Title = " + actualTitle);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// Compare
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}

}