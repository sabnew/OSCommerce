package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.osCommerceSignUp;

public class signUposCommerce {
	
	WebDriver driver;
	
	@Given("^the user is visiting Log in page$")
	public void the_user_is_visiting_Log_in_page() throws Throwable {
		System.setProperty("WebDriver.chrome.driver", "C:/WebDrivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	}

	@When("^user click on continue under New Customer$")
	public void user_click_on_continue_under_New_Customer() throws Throwable {
		osCommerceSignUp oc = new osCommerceSignUp(driver);
		oc.button().click();
		oc.Continue().click();
		
	}

	@When("^user enters gender, first name, last name, date of birth, email address, company name, street address, suburb, post code, city, state, province, country,  telephone no, fax no and password$")
	public void user_enters_gender_first_name_last_name_date_of_birth_email_address_company_name_street_address_suburb_post_code_city_state_province_country_telephone_no_fax_no_and_password() throws Throwable {
		osCommerceSignUp oc = new osCommerceSignUp(driver);
		oc.gender().click();
		oc.firstname().sendKeys("Sab");
		oc.lastname().sendKeys("New");
		oc.dob().sendKeys("04/17/1983");
		oc.email_address().sendKeys("sabnew6@gmail.com");
		oc.street_address().sendKeys("73-40 73rd st");
		oc.postcode().sendKeys("11377");
		oc.city().sendKeys("Queens");
		oc.state().sendKeys("New York");
		oc.country().sendKeys("United States");
		oc.telephone().sendKeys("135697969");
		oc.password().sendKeys("brooklyn");
		oc.confirmation().sendKeys("brooklyn");
		
		
	}

	@When("^user click continue$")
	public void user_click_continue() throws Throwable {
		osCommerceSignUp oc = new osCommerceSignUp(driver);
		oc.submit().click();
	}

	@Then("^user receives congratulation and confirmation message of successful registration$")
	public void user_receives_congratulation_and_confirmation_message_of_successful_registration() throws Throwable {
	   String msg = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/h1")).getText();
	   if (msg.matches("Your Account Has Been Created!"))
		   System.out.println("Test passed");
	   else
		   System.out.println("Test failed: "+msg);
	   driver.quit();
	}

	

}
