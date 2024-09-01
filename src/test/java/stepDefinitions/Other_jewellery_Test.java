package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class Other_jewellery_Test {
	
	WebDriver driver;
	
	@Given("Open the Chromebrowser and enter the Naaptol.com Url")
	public void open_the_chromebrowser_and_enter_the_naaptol_com_url() {
	    
	    driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}

	@Given("mouseHover on Shopping categories dropdown")
	public void mouse_hover_on_shopping_categories_dropdown() {
		
		Actions act = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.cssSelector("[class='arrowNav']"));
		
		act.moveToElement(mouseHover).build().perform();
	    
		
	   
	}

	@Given("click on Jewellery&watch link")
	public void click_on_jewellery_watch_link() {
	  
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
		
		driver.findElement(By.cssSelector("[title='Jewellery']")).click();
	}

	@Given("click on other jewellery link")
	public void click_on_other_jewellery_link() {
		
		driver.findElement(By.linkText("Other Jewellery")).click();
	   
	}

	@When("user uncheck all the checkboxes")
	public void user_uncheck_all_the_checkboxes() {
		
		// cash on delivery checkbox
		WebElement checkBox1 = driver.findElement(By.id("iscod"));
		
		// exclude out of stock checkbox
		WebElement checkBox2 = driver.findElement(By.cssSelector("[name='isexoutStock']"));
		
		// free shipping checkbox
		WebElement checkBox3 = driver.findElement(By.id("isfreeship"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(checkBox1).build().perform();
		
		act.doubleClick(checkBox2).build().perform();
		
		act.doubleClick(checkBox3).build().perform();
	   
	}

	@When("enter the price range and click on Go button")
	public void enter_the_price_range_and_click_on_go_button() {
		
		driver.findElement(By.cssSelector("[placeholder='Search product by Pincode']")).clear();
		
		// click on set button
		driver.findElement(By.xpath("//span[text()=' Set ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fromPriceRange"))).sendKeys("300");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toPriceRange"))).sendKeys("500");
		
		driver.findElement(By.xpath("//span[contains(text(),' Go ')]")).click();
	    
	}

	@Then("Only this Golden Chain + Bracelet + Ring with Free Watch product should be displayed")
	public void only_this_golden_chain_bracelet_ring_with_free_watch_product_should_be_displayed() {
	   
		String actualText = driver.findElement(By.cssSelector("[class='item_title']")).getText();
		
		String expectedText = "Golden Chain + Bracelet + Ring with Free Watch (GCBRW2)";
		
		Assert.assertEquals(actualText, expectedText);
		
		driver.close();
	}

}
