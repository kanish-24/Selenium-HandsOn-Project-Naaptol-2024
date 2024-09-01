package page_Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchDetailsPage {

	WebDriver driver;

	public WatchDetailsPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Austrian Diamond Watch +')]")
	private WebElement AustrianDiamondWatchLink;

	@FindBy(linkText = "Add in Wishlist")
	private WebElement addToWishList;

	@FindBy(linkText = "Expert Review")
	private WebElement expertReviewLink;

	@FindBy(linkText = "User Review")
	private WebElement userReviewLink;

	@FindBy(linkText = "Q & A")
	private WebElement qAndALink;

	@FindBy(linkText = "Specifications")
	private WebElement specificationsLink;

	@FindBy(linkText = "Change Pincode")
	private WebElement changePincodeLink;

	@FindBy(id = "pincodeDeliveryId_0")
	private WebElement enterPincodeTextfield;

	@FindBy(xpath = "//span[text()=' Check ']")
	private WebElement availabilityCheckButton;

	@FindBy(id = "featureDropdown")
	private WebElement sortByDropdown;

	@FindBy(xpath = "//b[text()='See all details']")
	private WebElement seeAllDetailsOption;

	@FindBy(xpath = "(//a[@class='spl_viewAll'])[2]")
	private WebElement similarPriceViewAllLink;

	@FindBy(css = "[pname='Golden Watch + Wireless Bluetooth']")
	private WebElement addToCompareCheckBox;

	@FindBy(linkText = "Golden Watch + Wireless Bluetooth")
	private WebElement goldenWatchLink;

	@FindBy(xpath = "//span[text()='Click here to Buy']")
	private WebElement clickHereToBuyButton;

	@FindBy(xpath = "(//li[@class='head_qty'])[2]")
	private WebElement qtyTextfield;

	@FindBy(xpath = "(//a[@class='red_button2'])[2]")
	private WebElement proceedToCheckoutButton;

	public WebElement getAustrianDiamondWatchLink() {
		return AustrianDiamondWatchLink;
	}

	public WebElement getAddToWishList() {
		return addToWishList;
	}

	public WebElement getExpertReviewLink() {
		return expertReviewLink;
	}

	public WebElement getUserReviewLink() {
		return userReviewLink;
	}

	public WebElement getqAndALink() {
		return qAndALink;
	}

	public WebElement getSpecificationsLink() {
		return specificationsLink;
	}

	public WebElement getChangePincodeLink() {
		return changePincodeLink;
	}

	public WebElement getEnterPincodeTextfield() {
		return enterPincodeTextfield;
	}

	public WebElement getAvailabilityCheckButton() {
		return availabilityCheckButton;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getSeeAllDetailsOption() {
		return seeAllDetailsOption;
	}

	public WebElement getSimilarPriceViewAllLink() {
		return similarPriceViewAllLink;
	}

	public WebElement getAddToCompareCheckBox() {
		return addToCompareCheckBox;
	}

	public WebElement getGoldenWatchLink() {
		return goldenWatchLink;
	}

	public WebElement getClickHereToBuyButton() {
		return clickHereToBuyButton;
	}

	public WebElement getQtyTextfield() {
		return qtyTextfield;
	}

	public WebElement getProceedToCheckoutButton() {
		return proceedToCheckoutButton;
	}

	// Business methods

	public void shoppingcategoryDropdown() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Actions actions = new Actions(driver);

		WebElement dropDown = driver.findElement(By.className("arrowNav"));

		actions.moveToElement(dropDown).build().perform();

		// jewelleryAndWatches link
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();

		// watches link
		driver.findElement(By.linkText("Watches")).click();

	}

	public void watchDetailsFunctionality(String changePIN, String changeQty) {

		AustrianDiamondWatchLink.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(addToWishList));
		addToWishList.click();

		wait.until(ExpectedConditions.elementToBeClickable(expertReviewLink));
		expertReviewLink.click();

		wait.until(ExpectedConditions.elementToBeClickable(userReviewLink));
		userReviewLink.click();

		wait.until(ExpectedConditions.elementToBeClickable(qAndALink));
		qAndALink.click();

		specificationsLink.click();

		changePincodeLink.sendKeys(changePIN);

		enterPincodeTextfield.click();

		availabilityCheckButton.click();

		sortByDropdown.click();

		seeAllDetailsOption.click();

		similarPriceViewAllLink.click();

		addToCompareCheckBox.click();

		goldenWatchLink.click();

		clickHereToBuyButton.click();

		qtyTextfield.sendKeys(changeQty);

		proceedToCheckoutButton.click();

	}

}
