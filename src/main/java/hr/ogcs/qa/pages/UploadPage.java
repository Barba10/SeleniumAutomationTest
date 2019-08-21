package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class UploadPage extends TestBase{
	
	@FindBy(linkText="Upload")
	WebElement upload_btn;
	
	@FindBy(linkText="Cancel")
	WebElement cancel_btn;
	

	
	// Initializing the Page Objects:
	public UploadPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void UploadFile(){
		TestUtil.UploadFile();
	}
	
	public void ClickUpload() {
		TestUtil.click(upload_btn, "Upload Button");
	}
	
	public void ClickCancel() {
		TestUtil.click(cancel_btn, "Cancel Button");
	}
	
	
}
