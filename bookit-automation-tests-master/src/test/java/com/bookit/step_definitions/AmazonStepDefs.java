package com.bookit.step_definitions;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookit.pages.amazonPage;
import com.bookit.utilities.BrowserUtils;
import com.bookit.utilities.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;;

public class AmazonStepDefs {

	WebDriver driver = Driver.getDriver();
	amazonPage AmzP = new amazonPage();
	WebDriverWait wait = new WebDriverWait(driver, 5);
	Logger logger = LogManager.getLogger(AmazonStepDefs.class.getName());

	@Given("I opened amazon homepage")
	public Logger I_opened_amazon_homepage() {

		String url = "Https://www.amazon.com";
		driver.manage().window().setPosition(new Point(-2000, 0));
		driver.manage().window().maximize();
		driver.get(url);
		logger.error("oops");
		return logger;
//		Scanner scanner = new Scanner(System.in);

	}

	@When("I Landed on the splash screen")

	public void I_Landed_on_the_splash_screen() {

//		wait.until(ExpectedConditions.visibilityOf(AmzP.amazonLogo));
//		boolean foundOrNot = AmzP.amazonLogo.isDisplayed();
//		System.out.println(foundOrNot);

//		assertEquals(true, AmzP.amazonLogo.isDisplayed());
		assertTrue(AmzP.amazonLogo.isDisplayed());
	}

//}
	@Then("Search for {string} and landed on next page")
	public void Search_for_and_landed_on_next_page(String whatToFind) {
//		// String whatToSend = scanner.nextLine();
////		System.out.println(whatToSend);
//
//		String whatToFind = "Bluetooth Headphones Around The Neck"; // not user input
		AmzP.searchBox.sendKeys(whatToFind + Keys.ENTER);
		assertTrue(AmzP.amazonLogo.isDisplayed());
	}

	@And("sort by customer rating and landed on next page")
	public void sort_by_customer_rating_and_landed_on_next_page() {

		BrowserUtils.hover(AmzP.sortByDropDown);
		BrowserUtils.waitForClickablility(AmzP.sortByDropDown, 5).click();
		BrowserUtils.waitForClickablility(AmzP.avgCustRev, 5).click();
//		driver.get("https://www.google.com");
		BrowserUtils.fluentWait(AmzP.amazonLogo, 30, 2).click();

//		assertTrue(AmzP.amazonLogo.isDisplayed());
//		System.out.println(AmzP.amazonLogo.isDisplayed());
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {

//		Thread.sleep(5000);
//		scanner.close();
		System.out.println("browser is already closed");
	}
//
//	@FindBy(id = "twotabsearchtextbox")
//	public WebElement searchBox;
//
//	@FindBy(id = "nav-logo")
//	public WebElement amazonLogo;
//
//	@FindBy(css = ".a-dropdown-label")
//	public WebElement sortByDropDown;
//
//	@FindBy(linkText = "Avg. Customer Review")
//	public WebElement avgCustRev;

}