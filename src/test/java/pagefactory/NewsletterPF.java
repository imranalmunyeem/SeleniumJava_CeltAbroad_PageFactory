package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base_class.DriverSetup;

public class NewsletterPF extends DriverSetup {
	// Search
	@FindBy(how = How.XPATH, using = "//*[@id=\"newsletterdatatable-table_filter\"]/label/input")
	@CacheLookup
	WebElement clickOnSearch;

	// Next
	@FindBy(how = How.XPATH, using = "//*[@id=\"newsletterdatatable-table_next\"]/a")
	@CacheLookup
	WebElement clickOnNext;

	// Next
	@FindBy(how = How.XPATH, using = "//*[@id=\"newsletterdatatable-table_previous\"]")
	@CacheLookup
	WebElement clickOnPrevious;

	// Method for clicking on Search Box
	public void Search() {
		clickOnSearch.click();

	}
	
	//Method for Clicking on Next
	public void next() {
		clickOnNext.click();
	}
	
	//Method for Clicking on Previous
	public void previous() {
		clickOnPrevious.click();
	}
	

}
