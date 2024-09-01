package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String takeScreenshot(WebDriver driver, String screenshotName) {

		String dateName = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + dateName + ".png";

		File finalDestination = new File(destination);

		// Check if the 'screenshots' directory exists, create it if not
		File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots/");
		if (!screenshotsDir.exists()) {
			screenshotsDir.mkdirs(); // Creates the directory if it doesn't exist
		}

		try {
			Files.copy(source.toPath(), finalDestination.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destination;
	}

}
