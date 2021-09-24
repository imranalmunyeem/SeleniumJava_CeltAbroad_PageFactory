package user_authentication;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import base_class.WebsiteURL;
import page_factory.LoginPage_PF;

@Test
public class Login extends DriverSetup {
	
	@Test
	public void TestLogin() throws InterruptedException {
		WebsiteURL url = new WebsiteURL();
		url.siteUrl();
		

		LoginPage_PF login = PageFactory.initElements(driver, LoginPage_PF.class);
		
		login.enterEmail();
		login.enterPassword();
		login.clickOnLogin();
		
		
	}
	

}