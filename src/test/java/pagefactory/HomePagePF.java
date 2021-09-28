package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePF {
	//Button Locator
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div/div[1]/nav/ul[1]/li/div/a")
	WebElement btn_logout;

	public void CheckLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}
}
