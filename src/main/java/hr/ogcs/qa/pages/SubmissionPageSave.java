package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

public class SubmissionPageSave extends TestBase{

	@FindBy(xpath="//button[3]")
	WebElement save_btn;
	
	public SubmissionPageSave(){
		PageFactory.initElements(driver, this);
	}
	
	public void SaveBtn() {
		save_btn.click();
	}
	
}
