package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class osCommerceSignUp {
	WebDriver driver;
	public osCommerceSignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
   @FindBy(linkText = "My Account")
   WebElement lnk_button;
   
   @FindBy(linkText = "Continue")
   WebElement lnk_Continue;
   
   @FindBy(name = "gender")
   WebElement clk_gender;
   
   @FindBy(name = "firstname")
   WebElement edt_firstname;
   
   @FindBy(name = "lastname")
   WebElement edt_lastname;
   
   @FindBy(name = "dob")
   WebElement edt_dob;
   
   @FindBy(name = "email_address")
   WebElement edt_email_address;
   
   @FindBy(name = "street_address")
   WebElement edt_street_address;
   
   @FindBy(name = "postcode")
   WebElement edt_postcode;
      
   @FindBy(name = "city")
   WebElement edt_city;
   
   @FindBy(name = "state")
   WebElement edt_state;
   
   @FindBy(name = "country")
   WebElement edt_country;
   
   @FindBy(name = "telephone")
   WebElement edt_telephone;
   
   @FindBy(name = "password")
   WebElement edt_password;
   
   @FindBy(name = "confirmation")
   WebElement edt_confirmation;
   
   @FindBy (xpath = "//*[@id=\"tdb4\"]/span[2]")
   WebElement btn_next;
   
   public WebElement button() {
		return lnk_button;
	}
    
   public WebElement Continue() {
		return lnk_Continue;
	}
   
   public WebElement gender() {
	   return clk_gender;
   }
   
   public WebElement firstname() {
		return edt_firstname;
	}
   public WebElement lastname() {
		return edt_lastname;
	}
   public WebElement dob() {
		return edt_dob;
	}
   public WebElement email_address() {
		return edt_email_address;
	}
   
   public WebElement street_address() {
		return edt_street_address;
	}
   
   public WebElement postcode() {
		return edt_postcode;
	}
   
   public WebElement city() {
		return edt_city;
	}
   
   public WebElement state() {
		return edt_state;
	}
   
   public WebElement country() {
		return edt_country;
	}
   
   public WebElement telephone() {
		return edt_telephone;
	}
   public WebElement password() {
		return edt_password;
	}
   public WebElement confirmation() {
		return edt_confirmation;
	}
   public WebElement submit() {
		return btn_next;
	}
   
}