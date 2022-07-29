package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtil;

public class HomePage {
	
	//private WebDriver driver;
	private ElementUtil elementutil;
	
	public HomePage(WebDriver driver) {
		//this.driver = driver;
		elementutil = new ElementUtil(driver);
	}
	
	private WebElement getHeader(String headerValue) {
		String headerXpath = "//a[contains(text(),'"+headerValue+"')]";
		return elementutil.getElement("xpath", headerXpath);
	}

	public boolean isHeaderExist(String headerValue) {
		return getHeader(headerValue).isDisplayed();
	}
	
	private WebElement getContactValue(String contactValue) {
		String contactXpath = "//a[contains(text(),'"+contactValue+"')]";
		return elementutil.getElement("xpath", contactXpath);
	}

	public boolean isContactExist(String contactValue) {
		return getContactValue(contactValue).isDisplayed();
	}
	
	
}
