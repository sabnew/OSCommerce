package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.osCommerceBuyingProduct;

public class buyingProductosCommerce {
	
	WebDriver driver;

	@Given("^the user is visiting catalog page$")
	public void the_user_is_visiting_catalog_page() throws Throwable {
		System.setProperty("WebDriver.chrome.driver", "C:/WebDrivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com/index.php");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@When("^user click on a product$")
	public void user_click_on_a_product() throws Throwable {
		osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
		obp.Catalog().click();
	}

	@When("^user click on add to cart$")
	public void user_click_on_add_to_cart() throws Throwable {
		osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
		obp.SamsungGalaxyTab().click();
	}

	@When("^user enters the Cart content page$")
	public void user_enters_the_Cart_content_page() throws Throwable {
		osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
		obp.AddToCart().click();
	}

	@When("^select quantity of the product, continue$")
	public void select_quantity_of_the_product_continue() throws Throwable {
		osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
		obp.cart_quantity().click();
		obp.Checkout().click();
	}

	
	@When("^select payment method, continue$")
	public void select_payment_method_continue() throws Throwable {
		osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
		obp.Continue().click();
		obp.payment().click();
		obp.Continue().click();
	}

	//@When("^receive order confirmation$")
	//public void receive_order_confirmation() throws Throwable {
		//osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
	
	//}

	@Then("^select Pay Now$")
	public void select_Pay_Now() throws Throwable {
		osCommerceBuyingProduct obp = new osCommerceBuyingProduct(driver);
		obp.PayNow().click();
	}

	
}
