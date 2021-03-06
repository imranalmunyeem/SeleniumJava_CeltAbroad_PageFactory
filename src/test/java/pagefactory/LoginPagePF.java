package pagefactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base_class.DriverSetup;

public class LoginPagePF extends DriverSetup {

	// Email Locator
	@FindBy(how = How.ID, using = "email")
	@CacheLookup
	WebElement txtEmail;

	// Password Locator
	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	WebElement txtPassword;

	// Button Locator
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button")
	@CacheLookup
	WebElement btnLogin;

	// login module in one method
	public void loginToCeltabroad(String sendEmail, String sendPassword) {
		txtEmail.sendKeys(sendEmail);
		txtPassword.sendKeys(sendPassword);
		btnLogin.click();

	}

}