package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Men_Jewellery_Test {
	
	WebDriver driver;
	
	@Given("Browser open, enter url")
	public void browser_open_enter_url() {
	    
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		
		
	}

	@Given("click on categories dropdown")
	public void click_on_categories_dropdown() {
	    
		Actions act = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.cssSelector("[class='arrowNav']"));
		
		act.moveToElement(mouseHover).build().perform();
		
	}

	@Given("click on Jewellery and watch link")
	public void click_on_jewellery_and_watch_link() {
	 
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
		
		driver.findElement(By.cssSelector("[title='Jewellery']")).click();
		
	}

	@When("user click on Men jewellery link")
	public void user_click_on_men_jewellery_link() {
	   
		driver.findElement(By.linkText("Men's Jewellery")).click();
		
	}

	@When("check the exclude out of stock checkbox")
	public void check_the_exclude_out_of_stock_checkbox() {
	   
		// exclude out of stock checkbox
		driver.findElement(By.cssSelector("[name='isexoutStock']")).click();
		
	}

	@When("enter the brandname in the select by brands section")
	public void enter_the_brandname_in_the_select_by_brands_section() {
	   
		// Create an explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
		WebElement brandName = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[placeholder='search brand']")));
				
		Actions act = new Actions(driver);
		String text = "Kalyan jewellers";
				
		brandName.sendKeys(text);
				
		// keydown to press the key
		// keyup to release the key
		act.keyDown(brandName,Keys.ENTER).keyUp(brandName,Keys.ENTER).build().perform();
		
	}

	@When("check the Vellani checkbox and price range checkbox")
	public void check_the_vellani_checkbox_and_price_range_checkbox() {
		
		// Vellani brand checkbox
		driver.findElement(By.cssSelector("[name='Vellani']"));

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('priceFilterBox1').click();");
	}

	@Then("Golden Rakhi Bracelet jewellery should be visible")
	public void golden_rakhi_bracelet_jewellery_should_be_visible() {
	    
		
		
		String actualText = driver.findElement(By.cssSelector("[title='Golden Rakhi Bracelet (RB2) - B1G1']")).getText();
		
		String expectedText = "Golden Rakhi Bracelet (RB2) - B1G1";
		
		Assert.assertEquals(actualText, expectedText);
		
	}

	@Then("click on add to compare checkbox")
	public void click_on_add_to_compare_checkbox() {
	  
		// click on add to compare checkbox
		driver.findElement(By.cssSelector("[id='cpid12613643']")).click();
				
		// Add to wishlist
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
		WebElement wishList = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//b[@class='wish2'])[1]")));

		wishList.click();
		
		
	}

	@Then("click on the Golden Rakhi Bracelet product link")
	public void click_on_the_golden_rakhi_bracelet_product_link() {
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement productLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title='Golden Rakhi Bracelet (RB2) - B1G1']")));

		productLink.click();
		
		driver.close();
		
	}

	
}
