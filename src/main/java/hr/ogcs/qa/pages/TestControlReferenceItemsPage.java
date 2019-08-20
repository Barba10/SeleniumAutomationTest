package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class TestControlReferenceItemsPage extends TestBase {

	// Initializing the Page Objects:
	public TestControlReferenceItemsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[3]/div/div/div/div/button/span")
	WebElement create;

	@FindBy(xpath = "//span/div/div[2]/a")
	WebElement chooseObject;

	@FindBy(linkText = "Test Item")
	WebElement testItem;
	
	@FindBy(linkText = "Control Item")
	WebElement controlItem;
	
	@FindBy(linkText = "Reference Item")
	WebElement referenceItem;
	
	@FindBy(xpath = "//div[2]/div[2]/div/a/span")
	WebElement continueButton;

	public void ChooseTestType() {
		TestUtil.click(create, "Create Button");
		TestUtil.click(chooseObject, "Choose Object");
		TestUtil.click(testItem, "Test Item");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void ChooseControlType() {
		TestUtil.click(create, "Create Button");
		TestUtil.click(chooseObject, "Choose Object");
		TestUtil.click(controlItem, "Control Item");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void ChooseReferenceType() {
		TestUtil.click(create, "Create Button");
		TestUtil.click(chooseObject, "Choose Object");
		TestUtil.click(referenceItem, "Reference Item");
		TestUtil.click(continueButton, "Continue Button");
	}

}
