package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base_class.DriverSetup;

public class Logout_PF extends DriverSetup {
	//Admin Logo Locator
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div[2]/div/div[1]/nav/ul[1]/li/a/img")
	@CacheLookup
	WebElement profileAdmin;

	//Logout Button Locator
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div[2]/div/div[1]/nav/ul[1]/li/div/a")
	@CacheLookup
	WebElement btnLogout;


	// Method for Email
	public void adminCircle() {
		profileAdmin.click();
	}

	//Logout Button
	public void clickOnLogin() {
		btnLogout.click();

	}

}
