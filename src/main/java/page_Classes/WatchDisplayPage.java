package page_Classes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchDisplayPage {

	WebDriver driver;

	// Constructor
	public WatchDisplayPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// Web elements with locators
	@FindBy(css = "[class='arrowNav']")
	private WebElement jewelleryAndWatchesDropdown;

	@FindBy(partialLinkText = "Jewellery & Watches")
	private WebElement jewelleryAndWatchesLink;

	@FindBy(linkText = "Watches")
	private WebElement watchesLink;

	@FindBy(id = "iscod")
	private WebElement codCheckbox;

	@FindBy(id = "isexoutStock")
	private WebElement excludeOutOfStockCheckbox;

	@FindBy(id = "isfreeship")
	private WebElement freeShippingCheckbox;

	@FindBy(css = "[placeholder='Search product by Pincode']")
	private WebElement searchProductByPincodeTextField;

	@FindBy(xpath = "//span[text()=' Set ']")
	private WebElement setButton;

	@FindBy(name = "brand")
	private WebElement searchBrandTextField;

	@FindBy(id = "brandFilterBox38493")
	private WebElement scottishClubCheckbox;

	@FindBy(id = "brandFilterBox38931")
	private WebElement AbrexoCheckbox;

	@FindBy(id = "fromPriceRange")
	private WebElement fromPriceRangeTextField;

	@FindBy(id = "toPriceRange")
	private WebElement toPriceRangeTextField;

	@FindBy(xpath = "//span[text()=' Go ']")
	private WebElement goButton;

	@FindBy(css = "[id='discountFilterBox1']")
	private WebElement discountCheckbox;

	@FindBy(xpath = "//input[@name='Men']")
	private WebElement searchByGenderCheckbox;

	@FindBy(id = "featureFilterBox2f2")
	private WebElement searchByDialShapeRoundCheckbox;

	@FindBy(css = "[name='Casual']")
	private WebElement searchByUsageCasualCheckbox;

	@FindBy(css = "[name='Analog']")
	private WebElement searchByTypeAnalogCheckbox;

	@FindBy(css = "[name='Digital']")
	private WebElement searchByTypeDigitalCheckbox;

	public WebElement getJewelleryAndWatchesDropdown() {
		return jewelleryAndWatchesDropdown;
	}

	public WebElement getJewelleryAndWatchesLink() {
		return jewelleryAndWatchesLink;
	}

	public WebElement getWatchesLink() {
		return watchesLink;
	}

	public WebElement getCodCheckbox() {
		return codCheckbox;
	}

	public WebElement getExcludeOutOfStockCheckbox() {
		return excludeOutOfStockCheckbox;
	}

	public WebElement getFreeShippingCheckbox() {
		return freeShippingCheckbox;
	}

	public WebElement getSearchProductByPincodeTextField() {
		return searchProductByPincodeTextField;
	}

	public WebElement getSetButton() {
		return setButton;
	}

	public WebElement getSearchBrandTextField() {
		return searchBrandTextField;
	}

	public WebElement getScottishClubCheckbox() {
		return scottishClubCheckbox;
	}

	public WebElement getAbrexoCheckbox() {
		return AbrexoCheckbox;
	}

	public WebElement getFromPriceRangeTextField() {
		return fromPriceRangeTextField;
	}

	public WebElement getToPriceRangeTextField() {
		return toPriceRangeTextField;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getDiscountCheckbox() {
		return discountCheckbox;
	}

	public WebElement getSearchByGenderCheckbox() {
		return searchByGenderCheckbox;
	}

	public WebElement getSearchByDialShapeRoundCheckbox() {
		return searchByDialShapeRoundCheckbox;
	}

	public WebElement getSearchByUsageCasualCheckbox() {
		return searchByUsageCasualCheckbox;
	}

	public WebElement getSearchByTypeAnalogCheckbox() {
		return searchByTypeAnalogCheckbox;
	}

	public WebElement getSearchByTypeDigitalCheckbox() {
		return searchByTypeDigitalCheckbox;
	}

	// Business methods
	public void navigateToWatchesSection() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Wait for the dropdown to be visible and perform action
		wait.until(ExpectedConditions.visibilityOf(jewelleryAndWatchesDropdown));

		Actions actions = new Actions(driver);

		actions.moveToElement(jewelleryAndWatchesDropdown).build().perform();

		// jewelleryAndWatchesDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(jewelleryAndWatchesLink));
		jewelleryAndWatchesLink.click();

		wait.until(ExpectedConditions.elementToBeClickable(watchesLink));
		watchesLink.click();
	}

	public void applyFilters(String pincode, String brandName, String fromPrice, String toPrice) {

		codCheckbox.click();

		excludeOutOfStockCheckbox.click();

		Actions act = new Actions(driver);

		act.doubleClick(freeShippingCheckbox).build().perform();
		// freeShippingCheckbox.click();

		searchProductByPincodeTextField.sendKeys(pincode);

		setButton.click();

		// searchBrandTextField.sendKeys(brandName);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// I want to call javascriptexecutor(Interface)
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scottishClubCheckbox
		// wait.until(ExpectedConditions.elementToBeClickable(scottishClubCheckbox));
		js.executeScript("document.getElementById('brandFilterBox38493').click();");

		// AbrexoCheckbox
		// wait.until(ExpectedConditions.elementToBeClickable(AbrexoCheckbox));
		js.executeScript("document.getElementById('brandFilterBox38931').click();");

		// scroll action using javascriptexecuter
		js.executeScript("window.scrollBy(0, 600)");
		// wait.until(ExpectedConditions.visibilityOf(fromPriceRangeTextField)).sendKeys(fromPrice);
		fromPriceRangeTextField.sendKeys(fromPrice);
		// wait.until(ExpectedConditions.visibilityOf(toPriceRangeTextField)).sendKeys(toPrice);
		toPriceRangeTextField.sendKeys(toPrice);
		// js.executeScript("arguments[0].scrollIntoView(true);", goButton);
		// goButton.click();

		// wait.until(ExpectedConditions.visibilityOf(discountCheckbox)).click();
		js.executeScript("document.getElementById('discountFilterBox1').click();");

		// scroll action using javascriptexecuter
		// js.executeScript("window.scrollBy(0, 800)");
		wait.until(ExpectedConditions.elementToBeClickable(searchByGenderCheckbox));
		js.executeScript("document.getElementById('featureFilterBox0f1').click();");
		// searchByGenderCheckbox.click();

		wait.until(ExpectedConditions.elementToBeClickable(searchByDialShapeRoundCheckbox));
		js.executeScript("document.getElementById('featureFilterBox2f2').click();");
		// searchByDialShapeRoundCheckbox.click();

		wait.until(ExpectedConditions.elementToBeClickable(searchByUsageCasualCheckbox));
		js.executeScript("document.getElementById('featureFilterBox0f3').click();");
		// searchByUsageCasualCheckbox.click();

		wait.until(ExpectedConditions.elementToBeClickable(searchByTypeAnalogCheckbox));
		searchByTypeAnalogCheckbox.click();

		wait.until(ExpectedConditions.elementToBeClickable(searchByTypeDigitalCheckbox));
		searchByTypeDigitalCheckbox.click();
	}
}
