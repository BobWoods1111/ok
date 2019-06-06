package com.bookit.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookit.utilities.Driver;

public class everythingToTry {

	public void trying() throws InterruptedException {

		PageFactory.initElements(Driver.getDriver(), this);
//		String url = "Https://www.amazon.com";
//		WebDriver driver = Driver.getDriver();
//		driver.manage().window().setPosition(new Point(2000, 0));
//		driver.manage().window().maximize();
//		driver.get(url);
////		Scanner scanner = new Scanner(System.in);
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOf(amazonLogo));
//		boolean foundOrNot = amazonLogo.isDisplayed();
//		System.out.println(foundOrNot);
//
//		assertEquals(true, amazonLogo.isDisplayed());
//
//		// String whatToSend = scanner.nextLine();
////		System.out.println(whatToSend);
//
//		String whatToSend = "Bluetooth Headphones Around The Neck"; // not user input
//		searchBox.sendKeys(whatToSend + Keys.ENTER);
//		assertEquals(true, amazonLogo.isDisplayed());
//
//		BrowserUtils.hover(sortByDropDown);
//		BrowserUtils.waitForClickablility(sortByDropDown, 5).click();
//		BrowserUtils.waitForClickablility(avgCustRev, 5).click();
//
//		assertEquals(true, amazonLogo.isDisplayed());
//
//		Thread.sleep(5000);
////		scanner.close();
//		driver.close();

	}

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBox;

	@FindBy(id = "nav-logo")
	public WebElement amazonLogo;

	@FindBy(css = ".a-dropdown-label")
	public WebElement sortByDropDown;

	@FindBy(linkText = "Avg. Customer Review")
	public WebElement avgCustRev;

}
