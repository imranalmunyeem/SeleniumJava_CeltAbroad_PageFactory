package listeners;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_class.DriverSetup;

@Listeners(CustomListener.class)
public class Screenshots extends DriverSetup {
	
	public void TakeScreenshots() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mediusware\\eclipse-workspace\\SeleniumJava_CeltAbroad_PageFactory\\Screenshots\\TestFailure.jpg"));

	}
	
	@Test
	public void TakeScreenshotTest() {
		Assert.assertEquals(false, true);
	}

}
