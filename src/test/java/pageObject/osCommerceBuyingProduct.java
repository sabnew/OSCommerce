package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class osCommerceBuyingProduct {
	WebDriver driver;
	public osCommerceBuyingProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy(linkText = "Catalog")
 WebElement lnk_Catalog;
	
 @FindBy(linkText = "Samsung Galaxy Tab")
 WebElement lnk_SamsungGalaxyTab;
	
 @FindBy(xpath = "//*[@id=\"tdb5\"]/span[2]")
 WebElement btn_AddToCart;
 
 @FindBy(xpath = "//*[@id=\"tdb4\"]/span[2]")
 WebElement btn_Addtocart;
 
 @FindBy(name = "//input[@name='cart_quantity[]']")
 WebElement edt_cart_quantity;
 
 @FindBy(linkText = "Checkout")
 WebElement edt_Checkout;
 
 @FindBy(name = "payment")
 WebElement btn_payment;
 
 @FindBy(linkText = "Continue")
 WebElement lnk_Continue;
 
 @FindBy(linkText = "Pay Now")
 WebElement lnk_payNow;
 
 public WebElement Catalog() {
		return lnk_Catalog;
	}
 
public WebElement SamsungGalaxyTab() {
		return lnk_SamsungGalaxyTab;
	}

public WebElement AddToCart() {
	   return btn_AddToCart;
    }

public WebElement AddtoCart() {
		return btn_Addtocart;
}
public WebElement cart_quantity() {
		return edt_cart_quantity;
    }

public WebElement Checkout() {
		return edt_Checkout;
    }

public WebElement payment() {
	return btn_payment;
    }

public WebElement Continue() {
	return lnk_Continue;
    }

public WebElement PayNow() {
	return lnk_payNow;
    }


}
