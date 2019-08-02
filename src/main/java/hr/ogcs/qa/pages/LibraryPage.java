package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

public class LibraryPage extends TestBase {
	
	@FindBy(linkText="2018/2001297")
	WebElement basf_doc_id;
	
	// Initializing the Page Objects:
	public LibraryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void goToDocId() {
		basf_doc_id.click();
	}
	
}
