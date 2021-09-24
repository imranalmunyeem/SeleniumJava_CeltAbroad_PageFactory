package title;

import org.testng.annotations.Test;
import base_class.DriverSetup;

@Test
public class PageTitle extends DriverSetup {
	@Test
	public void TestTitle() {

		// Navigate to the Website
		String actualTitle = driver.getTitle();
		String expectedTitle = "Celt Abroad";
		if (actualTitle.equalsIgnoreCase(expectedTitle))

			System.out.println("Title Matched");
		else

			System.out.println("Title didn't match");
		
		

		driver.close();

	}

}