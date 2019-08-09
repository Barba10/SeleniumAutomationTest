package hr.ogcs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id="search_main_box")
	WebElement search_box;
	
	@FindBy(xpath = "//a[@name='products1__c']//span[contains(text(),'Products')]")
	WebElement products;
	
	@FindBy(linkText="Test/Control/Reference Items")
	WebElement testControlReferance;
	
	@FindBy(linkText="Library")
	WebElement library;
	//D1
	@FindBy(linkText="Archive & Regulatory")
	WebElement archive_regulatory;
	
<<<<<<< HEAD
	//D2
	@FindBy(linkText="Archive & Regulatory")
	WebElement arch_reg_tab;
	
	@FindBy(linkText="Submissions")
	WebElement submissions;
	
=======
	@FindBy(linkText="Applications")
	WebElement applications;
>>>>>>> 5c51e12a8fbf36a031c80d387e715d5efc805cfe
	
	@FindBy(linkText="Study & QAU")
	WebElement study_qau;
	
	@FindBy(linkText="Inspections")
	WebElement inspections;
	
	//D4
	@FindBy(xpath="//div[2]/div/div/div/button/span")
	WebElement create_btn;
	
	@FindBy(xpath="//li[4]/a/span[2]")
	WebElement upload_btn;
	
	@FindBy(linkText ="Binder")
    WebElement selectBinder;
	

	
	@FindBy(xpath="//button[@class='vv_button vv_button_nav vv_inbox_new_button inboxNewButton']")
	WebElement createButton;
	
	@FindBy(xpath="//div[@class='header_std vv_navbar']//li[3]//a[1]")
	WebElement binderButton;
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void  SearchDocument(){
		search_box.sendKeys("2018/2001297" + Keys.ENTER);
		//search_box.sendKeys(Keys.ENTER);
	}
	
	public void GoToApplications() {
		archive_regulatory.click();
		applications.click();
	}
	
	//C15
	public void GoToTestControlReferance() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='products1__c']//span[contains(text(),'Products')]")));
		products.click();
		testControlReferance.click();
	}
	
	//A1	
	public void GoToLibrary(){
		library.click();
		//search_box.sendKeys(Keys.ENTER);
	}
	
<<<<<<< HEAD
	//D2
	public void GoToArchive() {
		arch_reg_tab.click();
		submissions.click();
	}
	
=======
	//D4
	public void GoToUpload() {
		create_btn.click();
		upload_btn.click();
	}
	
	public void GoToBinder() {
		create_btn.click();
        selectBinder.click();
    }
>>>>>>> 5c51e12a8fbf36a031c80d387e715d5efc805cfe
	
	public void GoToInspections() {
		study_qau.click();
		inspections.click();
    }
}
