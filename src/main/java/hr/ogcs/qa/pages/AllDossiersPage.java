package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

public class AllDossiersPage extends TestBase {
	
	public AllDossiersPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='doc_6304']//span[contains(@class,'docName vv_doc_title_name vv_keep_whitespace')][contains(text(),'BAS 750 01 F FR (v0.1)')]")
	WebElement binder;
	
	public void goToBinder() {
		binder.click();
	}
}
