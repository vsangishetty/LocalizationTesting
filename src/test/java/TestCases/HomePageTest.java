package TestCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configreader.ConfigPropReader;
import driver.DriverFactory;
import pages.HomePage;

public class HomePageTest {
	
	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;
	WebDriver driver;
	HomePage homepage;
	
	@BeforeMethod
	public void setUp() {
		cp = new ConfigPropReader();
		prop = cp.initLangProp("chinese");
		df = new DriverFactory();
		driver = df.initDriver("edge", prop);
		homepage = new HomePage(driver);
	}
	
	@Test
	public void headerTest() {
		Assert.assertTrue(homepage.isHeaderExist(prop.getProperty("header")));
	}
	
	@Test
	public void contactTest() {
		Assert.assertTrue(homepage.isContactExist(prop.getProperty("contact")));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
