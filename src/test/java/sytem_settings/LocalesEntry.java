package sytem_settings;

import org.testng.annotations.Test;

import base_class.DriverSetup;
import base_class.WebsiteURL;

public class LocalesEntry extends DriverSetup {
	@Test
	public void EntryFunctionality() {
		
		//Navigate to Website
		WebsiteURL url = new WebsiteURL();
		url.siteUrl();
		

	}
}
