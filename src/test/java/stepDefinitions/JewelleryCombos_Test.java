package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class JewelleryCombos_Test {
	
WebDriver driver;

@Given("open the browser, enter the Naaptol Url")
public void open_the_browser_enter_the_naaptol_url() {
    
	driver = new ChromeDriver();
	
	driver.get("https://www.naaptol.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
		
	
}

@Given("Click on jewelleryAndwatches link")
public void click_on_jewellery_andwatches_link() {
	
	Actions act = new Actions(driver);
	
	WebElement mouseHover = driver.findElement(By.cssSelector("[class='arrowNav']"));
	
	act.moveToElement(mouseHover).build().perform();
    
	driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
    
	
}

@Given("then click on jewellery link")
public void then_click_on_jewellery_link() {
    
	driver.findElement(By.cssSelector("[title='Jewellery']")).click();
	
}

@Given("Click on Jewellery combos link")
public void click_on_jewellery_combos_link() {
   
	driver.findElement(By.cssSelector("[title='Jewellery Combos']")).click();
	
	// cash on delivery checkbox
	driver.findElement(By.id("iscod")).click();
	// exclude out of stock checkbox
	driver.findElement(By.cssSelector("[name='isexoutStock']")).click();
	// free shipping checkbox
	driver.findElement(By.id("isfreeship")).click();
	
}

@When("user enter the pinCode and Brandname")
public void user_enter_the_pin_code_and_brandname() {
   
	driver.findElement(By.cssSelector("[placeholder='Search product by Pincode']")).clear();
	
	driver.findElement(By.cssSelector("[placeholder='Search product by Pincode']")).sendKeys("201001");
	
	// click on set button
	driver.findElement(By.xpath("//span[text()=' Set ']")).click();
	
	// Create an explicit wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement brandName = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[placeholder='search brand']")));
	brandName.sendKeys("Tanishq jewellers");
	
	//driver.findElement(By.cssSelector("[placeholder='search brand']")).sendKeys("Tanishq Jewellers");
	
}

@When("check the Vellani checkbox and Sukkhi checkbox")
public void check_the_vellani_checkbox_and_sukkhi_checkbox() {
	
	driver.findElement(By.name("Sukkhi")).click();
   
	
}

@When("user check the more than fiftyPercent discount checkbox")
public void user_check_the_more_than_fifty_percent_discount_checkbox() {
	
	// I want to call javascriptexecutor(Interface)
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("document.getElementById('discountFilterBox1').click();");
}

@When("user enter the price range limit and click on Go button")
public void user_enter_the_price_range_limit_and_click_on_go_button() {
   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fromPriceRange"))).sendKeys("1500");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toPriceRange"))).sendKeys("4000");
	
	driver.findElement(By.xpath("//span[contains(text(),' Go ')]")).click();
}

@Then("a error message No product found for this filter combination should be displayed")
public void a_error_message_no_product_found_for_this_filter_combination_should_be_displayed() {
    
	String actualText = driver.findElement(By.className("errorMsg")).getText();
	
	String expectedText = "No product found for this filter combination, remove some of the filters to see products";
	
	Assert.assertEquals(actualText, expectedText);
	
	driver.close();
	
}


}
