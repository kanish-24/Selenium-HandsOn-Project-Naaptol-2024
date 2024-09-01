package testSuite;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generics.Basetest;
import page_Classes.WatchDetailsPage;
import page_Classes.WatchDisplayPage;

public class WatchDisplayANDDetails_Test extends Basetest {

	// The base class should be parent class for all the test classes
	WatchDisplayPage wdP;
	WatchDetailsPage watchdp;

	@Test
	public void watchDisplayPage_Test() {

		test = extent.createTest("testWatchdisplayfunctionality");

		wdP = new WatchDisplayPage(driver);

		wdP.navigateToWatchesSection();
		test.log(Status.INFO, "Navigate to watch section");

		wdP.applyFilters(pinCode, brand, priceRangefrom, priceRangeto);
		test.log(Status.INFO, "applied required filters");

	}

	@Test
	public void watchDetailspage_Test() {

		test = extent.createTest("testWatchDetailsfunctionality");

		watchdp = new WatchDetailsPage(driver);

		watchdp.shoppingcategoryDropdown();

		watchdp.watchDetailsFunctionality(changePIN, changeQty);

		test.log(Status.INFO, "changed pincode and quantity");

	}

}
