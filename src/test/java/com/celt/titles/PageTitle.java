package com.celt.titles;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import base_class.DriverSetup;

@Test
public class PageTitle extends DriverSetup {
	private static Logger log = LogManager.getLogger(PageTitle.class.getName());
//	public static String baseUrl = "https://www.celtabroad.com/admin/login";

	@Test
	public void testTitle() {

		// Navigate to the Website
		String expectedTitle = "Celt";
//		driver.get(baseUrl);

		// Actual
		String actualTitle = driver.getTitle();
		log.info(actualTitle);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// Compare
		if(actualTitle==expectedTitle)
			log.info("Title is Matching");
		else 
			log.error("Title is not matching");
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();

	}

}