package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RingsandEarings_Test {
	
	WebDriver driver;
	
	@Given("open the browser and enter the Naaptol.com Url")
	public void open_the_browser_and_enter_the_naaptol_com_url() {
	   
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}

	@Given("Click on jewellery&watches dropdown")
	public void click_on_jewellery_watches_dropdown() {
	    
		Actions act = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.cssSelector("[class='arrowNav']"));
		
		act.moveToElement(mouseHover).build().perform();
	    
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
		
	}

	@Given("click on Jewellery link")
	public void click_on_jewellery_link() {
	  
		driver.findElement(By.cssSelector("[title='Jewellery']")).click();
	}

	@When("user click on rings and earings link")
	public void user_click_on_rings_and_earings_link() {
	  
		driver.findElement(By.cssSelector("[title='Rings and Earrings']")).click();
		
	}

	@When("check all the checkboxes of personalize search section")
	public void check_all_the_checkboxes_of_personalize_search_section() {
	    
		// cash on delivery checkbox
		driver.findElement(By.id("iscod")).click();
		// exclude out of stock checkbox
		driver.findElement(By.cssSelector("[name='isexoutStock']")).click();
		// free shipping checkbox
		driver.findElement(By.id("isfreeship")).click();
	}

	@When("enter the pincode and click on set button")
	public void enter_the_pincode_and_click_on_set_button() {
	    
		driver.findElement(By.cssSelector("[placeholder='Search product by Pincode']")).clear();
		
		driver.findElement(By.cssSelector("[placeholder='Search product by Pincode']")).sendKeys("201002");
		
		// click on set button
		driver.findElement(By.xpath("//span[text()=' Set ']")).click();
	}

	@Then("No product found for this filter combination, message should be displayed")
	public void no_product_found_for_this_filter_combination_message_should_be_displayed() {
	   
		String actualText = driver.findElement(By.className("errorMsg")).getText();
		
		String expectedText = "No product found for this filter combination, remove some of the filters to see products";
		
		Assert.assertEquals(actualText, expectedText);
		
		driver.close();
	}

}
