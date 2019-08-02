package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

public class DocumentPage extends TestBase{
	
	@FindBy(css="a[title='Actions menu']")
	WebElement wheel;
	
	@FindBy(linkText="Where Used")
	WebElement where_used;
	
	// Initializing the Page Objects:
	public DocumentPage() {
		PageFactory.initElements(driver, this);
	}

	public void WhereUsed() {
		wheel.click();
		where_used.click();
	}
	
	
	
}
