package page_factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base_class.DriverSetup;

public class Dashboard_PF extends DriverSetup {

	// Email Locator
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"sidebar-menu\\\"]/ul/li[1]/a/span")
	@CacheLookup
	WebElement clickOnDashboard;

	// Method for navigate to Dashboard
	public void navigateToDashboard() {
		clickOnDashboard.click();

	}

}
