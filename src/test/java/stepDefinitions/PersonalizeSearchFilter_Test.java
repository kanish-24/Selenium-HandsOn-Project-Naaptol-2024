package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalizeSearchFilter_Test {
	
	WebDriver driver;
	
	@Given("Open the browser, enter the Naaptol url")
	public void open_the_browser_enter_the_naaptol_url() {
	    
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@Given("click on jewellery and watches link")
	public void click_on_jewellery_and_watches_link() {
		
		Actions act = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.cssSelector("[class='arrowNav']"));
		
		act.moveToElement(mouseHover).build().perform();
	    
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
		
		//driver.findElement(By.partialLinkText("Jewellery & Watches"));
			
	}

	@Given("then click watches link")
	public void then_click_watches_link() {
	    
		driver.findElement(By.linkText("Watches")).click();
		
	}

	@When("user clicks on CashondeliveryCheckbox,ExcludeOutofstockCheckbox,ProductswithfreeShippingCheckbox")
	public void user_clicks_on_cashondelivery_checkbox_exclude_outofstock_checkbox_productswithfree_shipping_checkbox() {
	    
		// Cash on delivery checkbox
		driver.findElement(By.id("iscod")).click();
		
		// Exclude out of stock checkbox
		driver.findElement(By.id("isexoutStock")).click();
		
		// Product with free shipping checkbox
		driver.findElement(By.id("isfreeship")).click();
		
	}

	@When("enter the pincode")
	public void enter_the_pincode() {
	   
		driver.findElement(By.cssSelector("[placeholder='Search product by Pincode']")).sendKeys("201001");
		
	}

	@When("click on set button")
	public void click_on_set_button() {
	    
		// click on set button
		driver.findElement(By.xpath("//span[text()=' Set ']")).click();
		
		
	}

	@Then("Couple Watch \\(MLGW6) title should be displayed")
	public void couple_watch_mlgw6_title_should_be_displayed() {
	   
		String actualTitle = driver.findElement(By.linkText("Couple Watch (MLGW6)")).getText();
		
		String expectedTitle = "Couple Watch (MLGW6)";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}

	@Then("Personalize search status should be diplayed [ON]")
	public void personalize_search_status_should_be_diplayed_on() {
	   
		// soft assertion
		SoftAssert sA = new SoftAssert();

		// Find elements and extract the text
		List<WebElement> elements = driver.findElements(By.id("ps_on"));

		// Check if there's at least one element and get the first one's text
		if (!elements.isEmpty()) {
		    String actualText = elements.get(0).getText(); // Assuming you want the text of the first element
		    sA.assertEquals(actualText, "[ON]", "Text does not match expected value");
		} else {
		    sA.fail("No elements found with the specified ID");
		}

		sA.assertAll();
		
		driver.close();
		
	}


}
