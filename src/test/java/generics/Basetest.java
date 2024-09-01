package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Utilities.ExtentManager;
import com.Utilities.ScreenshotUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Basetest {

	protected WebDriver driver;
	String origin;

	// Configuration properties
	protected String pinCode;
	protected String brand;
	protected String priceRangefrom;
	protected String priceRangeto;
	protected String changePIN;
	protected String changeQty;

	protected ExtentReports extent;
	protected ExtentTest test;

	@BeforeSuite
	public void setUpSuite() {
		extent = ExtentManager.createInstance();
	}

	@BeforeMethod
	public void setUP() throws IOException {

		// Example setup for ChromeDriver; adjust according to your browser/driver

		driver = new ChromeDriver();

		// Load configuration properties
		Properties pr = new Properties();

		FileInputStream fis = new FileInputStream(
				"/home/himanshu/Desktop/B38-SPR201-JAVA/PageObjectModel-Construct-Week-Project-B38/src/test/resources/config.properties");
		pr.load(fis);

		// Get property values
		origin = pr.getProperty("url");

		// Set up the driver
		driver.get(origin);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		pinCode = pr.getProperty("Pincode");

		brand = pr.getProperty("Brand");

		priceRangefrom = pr.getProperty("PriceRange_From");

		priceRangeto = pr.getProperty("PriceRange_To");

		changePIN = pr.getProperty("changePincode");

		changeQty = pr.getProperty("Qty");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getName());
			test.fail(result.getThrowable());
			test.addScreenCaptureFromPath(screenshotPath, result.getName());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test passed");

		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test skipped");

		}
		driver.quit();
	}

	@AfterSuite
	public void tearDownSuite() {
		ExtentManager.flush();
	}

}
