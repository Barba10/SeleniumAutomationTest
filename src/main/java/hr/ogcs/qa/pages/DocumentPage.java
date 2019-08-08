package hr.ogcs.qa.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

	
	// Initializing the Page Objects:
	public DocumentPage() {
		PageFactory.initElements(driver, this);
	}

	public void WhereUsed() {
		wheel.click();
		where_used.click();
	}
	
	//A1
	public void VerificationTab() {
		verification.click();
	}
	
	public void SelectDocument() {
		wait.until(ExpectedConditions.elementToBeClickable(documentSelect));
		documentSelect.click();
	}

	
	public void ClickEditButton() {
		wait.until(ExpectedConditions.elementToBeClickable(editButton));
		editButton.click();
	}
	
	public void FillForm(){
		wait.until(ExpectedConditions.elementToBeClickable(generalTab));
		generalTab.click();
		wait.until(ExpectedConditions.invisibilityOf(name));
		jse.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.elementToBeClickable(archival_information_tab));
		archival_information_tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(archival_information_tab));
		electronicallyArchivedYes.click();
		wait.until(ExpectedConditions.elementToBeClickable(electronicallyArchivedYes));
		internalStorage.clear();
		internalStorage.sendKeys("Li445");
		boxNumber.clear();
		boxNumber.sendKeys("7A");
		externalStorage.clear();
		externalStorage.sendKeys("NA");
		commentsTab.click();
		name_remarks.click();
		wait.until(ExpectedConditions.elementToBeClickable(name_remarks));
		name_remarks.clear();
		name_remarks.sendKeys("EAGLES Validation of: Document archiving of internal GLP study documents");
		jse.executeScript("window.scrollBy(0,-1000)", "");
		saveBtn.click();
	}
	

		public void ActionWheel() {
			wait.until(ExpectedConditions.elementToBeClickable(actionWheel));
			actionWheel.click();
		}
		
		public void Archive() {
			wait.until(ExpectedConditions.elementToBeClickable(archiveDocument));
			archiveDocument.click();
			archiveDocumentNo.click();
			actionWheel.click();
			wait.until(ExpectedConditions.elementToBeClickable(actionWheel));
			archiveDocument.click();
			archiveDocumentYes.click();
		}
		
		public void Verifycation() throws InterruptedException, IOException {
			Thread.sleep(2000);
			generalTab.click();
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.elementToBeClickable(waitForArchiveInformationTabVerifycation));
			jse.executeScript("window.scrollBy(0,250)", "");
			archiveInformationTab.click();
			/* TestUtil.verifyEquals(verifyArchivedDate ); */
			TestUtil.verifyEquals(verifyElectorinallyArchivedYes, "Yes");
			TestUtil.verifyEquals(verifyInternalStorage, "Li445");
			TestUtil.verifyEquals(verifyBoxNumber, "7A");
			TestUtil.verifyEquals(verifyExternalStorage, "NA");		
			TestUtil.verifyEquals(verifyDivestedDocumentsReceipt, "Divested Documents Receipt");
			TestUtil.verifyEquals(verifyDivestedto, "Divested to");
			TestUtil.verifyEquals(verifyDivestedon, "Divested on");			
		}
		
		public void VeryficationRemarks() throws IOException, InterruptedException {
			commentsTab.click();
			wait.until(ExpectedConditions.elementToBeClickable(waitForRemarksVerification));
			TestUtil.verifyEquals(verifyremarks, "EAGLES Validation of: Document archiving of internal GLP study documents");
			jse.executeScript("window.scrollBy(0,-250)", "");
			editButton.click();
			name.sendKeys("Test Script Descriptions");
		}
		
		public void SaveButton() {
			saveBtn.click();
		}
		
}
