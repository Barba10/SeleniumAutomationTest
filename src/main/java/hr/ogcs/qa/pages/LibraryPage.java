package hr.ogcs.qa.pages;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class LibraryPage extends TestBase {
	
	@FindBy(linkText="2018/2001297")
	WebElement basf_doc_id;
	
	//A1
	@FindBy(linkText="All Documents")
	WebElement basf_all_doc;
	//A1
	@FindBy(linkText="STATUS")
	WebElement status;

	@FindBy(id="status~en_facet_Pending Archival")
	WebElement pending;

	@FindBy(xpath="//td/div/div[2]/div[2]/a")
	WebElement filter;
	
	@FindBy(linkText="Edit")
	WebElement edit;
	
	@FindBy(xpath="//div/div/div[2]/div/a")
	WebElement filter_edit_btn;
	
	@FindBy(xpath="//*[@id=\\\"leftNavLibrary\\\"]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]/div/div[3]/button")
	WebElement status_binocular;
	
	@FindBy(linkText="restore_defaults")
	WebElement restore_defaults;
	
	@FindBy(linkText="applyBtn")
	WebElement applyBtn;
	
	@FindBy(xpath="//button[4]/span")
	WebElement tabularView;
	
	@FindBy(linkText="Document Inbox")
	WebElement doc_inbox;
	@FindBy(linkText = "All Dossiers")
	WebElement allDossiers;
	
	@FindBy(xpath="//div[2]/div/div[2]/div/a/span")
	WebElement uploaded_document;
	
	
	// Initializing the Page Objects:
	public LibraryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void goToDocId() {
		TestUtil.click(basf_doc_id, "Document ID");
	}
	
	//A1
	public void Filter() {
		if(!driver.findElements(By.linkText("STATUS")).isEmpty()){
			TestUtil.click(status, "Status - FILTER");
			wait.until(ExpectedConditions.elementToBeClickable(pending));
			TestUtil.click(pending, "Pending - Checkbox");
		}
		else
		{
			TestUtil.click(filter_edit_btn, "Filter Edit Button");
			TestUtil.click(status_binocular, "Status - Binocular");
			TestUtil.click(restore_defaults, "Restore Defaults");
			TestUtil.click(applyBtn, "Apply Button");
			TestUtil.click(status, "Status");
			wait.until(ExpectedConditions.elementToBeClickable(pending));
			TestUtil.click(pending, "Pending");
		}
	}
	
	public void SetTabularView() {
		wait.until(ExpectedConditions.elementToBeClickable(tabularView));
		TestUtil.click(tabularView, "Tabular view");
	}
	
	public void OpenUploadedDocument() {
		wait.until(ExpectedConditions.visibilityOf(doc_inbox));
		TestUtil.click(uploaded_document, "Uploaded document");
	}
	
	
	
	
	
	public void goToAllDossiers() throws IOException {
//		allDossiers.click();
		TestUtil.click(allDossiers, "All dossiers");
		
		
		
//		
		
	}
}
