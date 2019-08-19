package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

public class TrialsPage extends TestBase{
	
	public TrialsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='vv_button CreateObject vv_primary']")
	WebElement createButton;
	
	public void createTrial() {
		createButton.click();
	}
	
}
