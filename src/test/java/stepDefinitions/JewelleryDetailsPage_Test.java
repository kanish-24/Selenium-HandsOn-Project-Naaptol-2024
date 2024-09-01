package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JewelleryDetailsPage_Test {
	
	WebDriver driver;
	
	@Given("open the Browser and Enter the Naaptol url")
	public void open_the_browser_and_enter_the_naaptol_url() {
	   
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
	}

	@Given("mousehover to categories dropdown")
	public void mousehover_to_categories_dropdown() {
	  
		Actions act = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.cssSelector("[class='arrowNav']"));
		
		act.moveToElement(mouseHover).build().perform();
		
	}

	@Given("select jewellery and watches option then click on jewellery")
	public void select_jewellery_and_watches_option_then_click_on_jewellery() {
	   
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
		
		driver.findElement(By.cssSelector("[title='Jewellery']")).click();
		
	}

	@When("user enter the brandname as Tanishq gold jewelleries")
	public void user_enter_the_brandname_as_tanishq_gold_jewelleries() {
	    
		WebElement searchBybrandName = driver.findElement(By.cssSelector("[placeholder='Search Brand']"));
		
		Actions act = new Actions(driver);
		
		searchBybrandName.sendKeys("Tanishq gold jewelleries");
		
		act.keyDown(searchBybrandName,Keys.ENTER).keyUp(searchBybrandName,Keys.ENTER).build().perform();
		
	}

	@When("scroll down and click on a jewellery product")
	public void scroll_down_and_click_on_a_jewellery_product() {
	    
		// I want to call javascriptexecutor(Interface)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// scroll action using javascriptexecuter
		//js.executeScript("window.scrollBy(0, 100)");
				
		WebElement productLink = driver.findElement(By.partialLinkText("Diamond Ring + Free Di"));
				
		js.executeScript("arguments[0].scrollIntoView()", productLink);
		
		productLink.click();
		
	}

	@When("mouseHover each image of the jewellery")
	public void mouse_hover_each_image_of_the_jewellery() {
	    
		WebElement image1 = driver.findElement(By.xpath("(//img[@alt='2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)'])[1]"));
		
		WebElement image2 = driver.findElement(By.xpath("(//img[@alt='2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)'])[2]"));
		
		WebElement image3 = driver.findElement(By.xpath("(//img[@alt='2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)'])[3]"));
		
		WebElement image4 = driver.findElement(By.xpath("(//img[@alt='2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)'])[4]"));
	
		WebElement image5 = driver.findElement(By.xpath("(//img[@alt='2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)'])[5]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(image1).build().perform();
		act.moveToElement(image2).build().perform();
		act.moveToElement(image3).build().perform();
		act.moveToElement(image4).build().perform();
		act.moveToElement(image5).build().perform();
		
	}

	@When("click on add in wishlist icon")
	public void click_on_add_in_wishlist_icon() {
	  
		// add the desired jewellery in the wishlist
		driver.findElement(By.xpath("(//b[@class='wish2'])[1]")).click();
		
		driver.findElement(By.cssSelector("[title='Close']")).click();
		
	}

	@Then("Golden Chain + Bracelet + Diamond Ring + Free Digital Watch heading should be visible")
	public void golden_chain_bracelet_diamond_ring_free_digital_watch_heading_should_be_visible() {
	    
		String actualText = driver.findElement(By.xpath("//h1[contains(text(),'2 Golden Chain + Bracelet +')]")).getText();
		
		String expectedText = "2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)";
		
		Assert.assertEquals(actualText, expectedText);
		//(//h1[text()='2 Golden Chain + Bracelet + Diamond Ring + Free Digital Watch (2GCBRW9)'])
		
	}

	@Then("click on click here to buy button")
	public void click_on_click_here_to_buy_button() {
	    
		driver.findElement(By.xpath("//span[text()='Click here to Buy']")).click();
		
	}

	@Then("change the quantity from one to two and click on ProceedtoCheckout button")
	public void change_the_quantity_from_one_to_two_and_click_on_proceedto_checkout_button() {
	    
		// change the quantity
		driver.findElement(By.cssSelector("[qty='1']")).sendKeys("2");
		// enter the gift voucher code
		driver.findElement(By.cssSelector("[placeholder='Enter your gift voucher code']")).sendKeys("34dd4566tty");
		// click on apply button
		driver.findElement(By.id("cvApplybtn")).click();
		
		driver.findElement(By.xpath("(//a[@class='red_button2'])[2]")).click();
	
		driver.close();
	}


}
