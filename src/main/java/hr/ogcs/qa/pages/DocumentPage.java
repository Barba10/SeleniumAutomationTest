package hr.ogcs.qa.pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

	

public class DocumentPage extends TestBase{
	
	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy"); 
	Date now = new Date();
	
	@FindBy(css="a[title='Actions menu']")
	WebElement wheel;
	
	@FindBy(linkText="Where Used")
	WebElement where_used;
	
	//A1
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\\\"di3Form\\\"]/div[2]/div[1]/h3/div/span[1]")
	WebElement verification;

	@FindBy(xpath="//tr[2]/td/div/div[2]/div[2]/a")
	WebElement documentSelect;
	
	@FindBy(linkText="Edit")
	WebElement editButton;
	
	@FindBy(xpath="//*[contains(text(), 'General')]")
	WebElement generalTab;
	
	@FindBy(xpath="//*[contains(text(), 'Archive Information')]")
	WebElement archival_information_tab;
	
	@FindBy(id="pDFA1BConformityYES")
	WebElement electronicallyArchivedYes;
	
	@FindBy(name="internalStorage")
	WebElement internalStorage;

	@FindBy(name="boxNumber")
	WebElement boxNumber;
	
	@FindBy(name="externalStorage")
	WebElement externalStorage;
	
	@FindBy(xpath="//*[contains(text(), 'Comments/ Remarks')]")
	WebElement commentsTab;
	
	@FindBy(name="remarks")
	WebElement name_remarks;
	
	@FindBy(linkText="Save")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[2]/div[2]/div/div/a")
	WebElement actionWheel;
	
	@FindBy(linkText="Archive Document")
	WebElement archiveDocument;
	
	@FindBy(linkText="No")
	WebElement archiveDocumentNo;
	
	@FindBy(linkText="Yes")
	WebElement archiveDocumentYes;
	
	@FindBy(xpath="//*[@id=\\\"di3Form\\\"]/div[2]/div[1]/h3/div/span[1]")
	WebElement waitForArchiveInformationTabVerifycation;
	
	@FindBy(xpath="//*[contains(text(), 'Archive Information')]")
	WebElement archiveInformationTab;
	
	@FindBy(xpath="//*[@attrkey='archivedDate']")
	WebElement verifyArchivedDate;
	
	@FindBy(xpath="//*[@attrkey='pDFA1BConformity']")
	WebElement verifyElectorinallyArchivedYes;
	
	@FindBy(xpath="//*[@attrkey='internalStorage']")
	WebElement verifyInternalStorage;
	
	@FindBy(xpath="//*[@attrkey='boxNumber']")
	WebElement verifyBoxNumber;
	
	@FindBy(xpath="//*[@attrkey='externalStorage']")
	WebElement verifyExternalStorage;
	
	@FindBy(xpath="//*[@attrkey='divestedDocumentsReceipt']")
	WebElement verifyDivestedDocumentsReceipt;
	
	@FindBy(xpath="//*[@attrkey='divestedTo']")
	WebElement verifyDivestedto;
	
	@FindBy(xpath="//*[@attrkey='divestedOn']")
	WebElement verifyDivestedon;
	
	@FindBy(xpath="//*[@attrkey='remarks']")
	WebElement verifyremarks;
	
	@FindBy(xpath="//*[contains(text(), 'Remarks')]")
	WebElement waitForRemarksVerification;
	
	@FindBy(xpath="//a[contains(@class, 'classifyDocLink')]")
	WebElement classify_link;
	
	@FindBy(linkText="Advanced")
	WebElement advanced_link;
	
	@FindBy(id="uploadTypeSelect")
	WebElement type;
	
	@FindBy(id="uploadSubTypeSelect")
	WebElement subtype;
	
	@FindBy(id="uploadClassificationSelect")
	WebElement classification;
	
	@FindBy(linkText="OK")
	WebElement ok_btn;
	
	@FindBy(xpath="//form[@id='di3Form']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/button/span")
	WebElement form_application_binocular;

	@FindBy(className="veevaSearch_searchInput")
	WebElement form_search_label;
	
	@FindBy(xpath="//div[2]/span/a")
	WebElement form_binocular_value;
	
	@FindBy(xpath="//form[@id='di3Form']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/button/span")
	WebElement form_submission_binocular;
	
	@FindBy(linkText="Close")
	WebElement close_btn;
	
	@FindBy(className="pageimage")
	WebElement page_image;
	
	@FindBy(linkText="Cancel")
	WebElement cancel_btn;
	
	@FindBy(css="div[attrkey='name']")
	WebElement name_value;

	@FindBy(css="div[attrkey='documentType']")
	WebElement type_value;
	
	@FindBy(css="div[attrkey='documentSubType']")
	WebElement subtype_value;
	
	@FindBy(css="div[attrkey='documentClassification']")
	WebElement classification_value;
	
	@FindBy(css="a[data-doc-attr-public-key='application__c']")
	WebElement application_value;
	
	@FindBy(css="a[data-doc-attr-public-key='submission__c']")
	WebElement submission_value;
	
	@FindBy(xpath="//*[contains(text(), 'Regulatory Information')]")
	WebElement regulatory_information_tab;
	 

	// Initializing the Page Objects:
	public DocumentPage() {
		PageFactory.initElements(driver, this);
	}

	public void WhereUsed() {
		TestUtil.click(wheel, "Action wheel");
		TestUtil.click(where_used, "Where Used");
	}
	
	//A1
	public void VerificationTab() {
		TestUtil.click(verification, "Verification");
	}
	
	public void SelectDocument() {
		//wait.until(ExpectedConditions.elementToBeClickable(documentSelect));
		TestUtil.click(documentSelect, "Document");
	}

	
	public void ClickEditButton() {
		//wait.until(ExpectedConditions.elementToBeClickable(editButton));
		TestUtil.click(editButton, "Edit Button");
	}
	
	public void FillForm(){
		TestUtil.click(generalTab, "General Tab (Closing tab)");
		jse.executeScript("window.scrollBy(0,250)", "");
		TestUtil.click(archival_information_tab, "Archival information tab");
		TestUtil.click(electronicallyArchivedYes, "Electronically Archived Yes");
		TestUtil.type(internalStorage, "Internal Storage" ,"Li445");
		TestUtil.type(boxNumber, "Box Number", "7A");
		TestUtil.type(externalStorage, "External Storage", "NA");
		TestUtil.click(commentsTab, "Comments Tab");		
		TestUtil.type(name_remarks, "Name Remarks",  "EAGLES Validation of: Document archiving of internal GLP study documents");
		jse.executeScript("window.scrollBy(0,-1000)", "");
		TestUtil.click(saveBtn, "Save Button");
	}
	
	public void ArchiveNegative() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestUtil.click(actionWheel, "Action Wheel");
		TestUtil.click(archiveDocument, "Archive Document");
		TestUtil.click(archiveDocumentNo, "Archive Document - No");
	}
	
	public void ArchivePositive() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestUtil.click(actionWheel, "Action Wheel");
		TestUtil.click(archiveDocument, "Archive Document");
		TestUtil.click(archiveDocumentYes, "Archive Document - Yes");
	}
		
	public void Verifycation() throws InterruptedException, IOException {
		Thread.sleep(2000);
		TestUtil.click(generalTab, "General Tab");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(waitForArchiveInformationTabVerifycation));
		jse.executeScript("window.scrollBy(0,250)", "");
//		TestUtil.click(archiveInformationTab, "Archive Information Tab");
		TestUtil.verifyEquals(verifyArchivedDate, d.format(now)); 
		TestUtil.verifyEquals(verifyElectorinallyArchivedYes, "Yes");
		TestUtil.verifyEquals(verifyInternalStorage, "Li445");
		TestUtil.verifyEquals(verifyBoxNumber, "7A");
		TestUtil.verifyEquals(verifyExternalStorage, "NA");		
		TestUtil.verifyEquals(verifyDivestedDocumentsReceipt, "Divested Documents Receipt");
		TestUtil.verifyEquals(verifyDivestedto, "Divested to");
		TestUtil.verifyEquals(verifyDivestedon, "Divested on");	
		TestUtil.click(commentsTab, "Comments Tab - Open Tab");
		TestUtil.verifyEquals(verifyremarks, "EAGLES Validation of: Document archiving of internal GLP study documents");
	}
	
	public void FillAfterDocumentStatusIsChanged() throws IOException, InterruptedException {
		jse.executeScript("window.scrollBy(0,-250)", "");
		TestUtil.click(editButton, "Edit Button");
		TestUtil.type(name, "Name", "Test Script Descriptions");
	}
	
	public void SaveButton() {
		TestUtil.click(saveBtn, "Save Button");
	}
	
	
	public void ClassificationOfUploadedDocument() throws InterruptedException {
		TestUtil.click(actionWheel, "Action Wheel");
	    jse.executeScript("arguments[0].click();", classify_link);
    	childTest.info("Classify "+ " is clicked (jse.executeScript)");
	    System.out.print("Classify is clicked \n");
		//classify_link.click();
		TestUtil.click(advanced_link, "Advanced");
		TestUtil.select(type, "Type" , "Dossier Document");
		TestUtil.select(subtype, "Subtype" , "Section Document");
		TestUtil.select(classification, "Classification" ,"dRR Core");
		TestUtil.click(ok_btn, "OK Button");
		TestUtil.click(ok_btn, "OK Button");
	}
	
	public void FillEditableFields() {
		wait.until(ExpectedConditions.visibilityOf(name));
		TestUtil.type(name, "Name", "BAS 750 01 F Core S Part B Section 00");
		TestUtil.click(form_application_binocular, "Application Binocular");
		TestUtil.type(form_search_label, "Search Label", "BAS 750 01 F Core S" + Keys.ENTER);
		TestUtil.click(form_binocular_value, "Add Button");
		TestUtil.click(form_submission_binocular, "Submission Binocular");
		TestUtil.type(form_search_label, "Search Label", "BAS 750 01 S / FR" + Keys.ENTER);
		TestUtil.click(form_binocular_value, "Add Button");
		TestUtil.click(close_btn, "Close Button");
		jse.executeScript("window.scrollBy(0,-500)", "");
		TestUtil.click(saveBtn, "Save Button");
		
		try {
			wait.until(ExpectedConditions.visibilityOf(page_image));
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{   
			WebElement page_image1 = driver.findElement(By.className("pageimage"));
			wait.until(ExpectedConditions.visibilityOf(page_image1));
		}
		
		TestUtil.click(editButton, "Edit Button");
		TestUtil.click(cancel_btn, "Cancel Button");
	}
	
	public void TextVerifycation() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name_value, "BAS 750 01 F Core S");
		TestUtil.verifyEquals(type_value, "Dossier Document");
		TestUtil.verifyEquals(subtype_value, "Section Document");
		TestUtil.verifyEquals(classification_value, "dRR Core");
		TestUtil.click(regulatory_information_tab, "Regulatory Information Tab");
		TestUtil.verifyEquals(application_value, "BAS 750 01 F Core S");
		TestUtil.verifyEquals(submission_value , "BAS 750 01 S / FR");
	}
		
}
