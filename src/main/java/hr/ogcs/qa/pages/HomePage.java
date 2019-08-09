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
	
	@FindBy(linkText="Applications")
	WebElement applications;
	
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
	
	//D4
	public void GoToUpload() {
		create_btn.click();
		upload_btn.click();
	}
	
	public void GoToBinder() {
		create_btn.click();
        selectBinder.click();
    }
	
	public void GoToInspections() {
		study_qau.click();
		inspections.click();
    }
}
