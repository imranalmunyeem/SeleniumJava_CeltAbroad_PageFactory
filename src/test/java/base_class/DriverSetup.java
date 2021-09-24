package base_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public static WebDriver driver;

	@BeforeSuite
	public static void setDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterSuite
	public static void close() {
		driver.close();
	}
	
	public void failed() throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\Mediusware\\eclipse-workspace\\SeleniumJava_CeltAbroad_PageFactory\\Screenshots\\TestFailure.jpg"));
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Mediusware\\eclipse-workspace\\SeleniumJava_CeltAbroad_PageFactory\\Screenshots\\TestFailure.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


		
	}

