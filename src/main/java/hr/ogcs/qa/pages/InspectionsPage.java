package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class InspectionsPage extends TestBase {
	
	@FindBy(xpath="//div[3]/div/div/div/div/button/span")
	WebElement create_button;
	
	@FindBy(xpath="//span/div/div[2]/a")
	WebElement inspection_type;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement continue_button;
	
	@FindBy(linkText="Computerized System Inspection")
	WebElement inspection_type_value_csi;
	
	@FindBy(linkText="Document Inspection")
	WebElement inspection_type_value_di;
	
	@FindBy(linkText="Facility Inspection")
	WebElement inspection_type_value_fi;
	
	@FindBy(linkText="Instrument Inspection")
	WebElement inspection_type_value_ii;
	
	@FindBy(linkText="Study based Inspection")
	WebElement inspection_type_value_sbi;
	
	public  InspectionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectComputerizedSystemInspection() {

		TestUtil.click(create_button, "Create Button");
		TestUtil.click(inspection_type, "Select Inspection Type.");
		TestUtil.click(inspection_type_value_csi, "Computerized System Inspection");
		TestUtil.click(continue_button, "Continue Button");
	}
	
	public void SelectDocumentInspection() {

		TestUtil.click(create_button, "Create Button");
		TestUtil.click(inspection_type, "Select Inspection Type.");
		TestUtil.click(inspection_type_value_di, "Document Inspection");
		TestUtil.click(continue_button, "Continue Button");
	}
	
	public void SelectFacilityInspection() {
	
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(inspection_type, "Select Inspection Type.");
		TestUtil.click(inspection_type_value_fi, "Facility Inspection");
		TestUtil.click(continue_button, "Continue Button");
	}
	
	public void SelectInstrumentInspection() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(inspection_type, "Select Inspection Type.");
		TestUtil.click(inspection_type_value_ii, "Instrument Inspection");
		TestUtil.click(continue_button, "Continue Button");
	}
	
	public void SelectStudyBasedInspection() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(inspection_type, "Select Inspection Type.");
		TestUtil.click(inspection_type_value_sbi, "Study based Inspection");
		TestUtil.click(continue_button, "Continue Button");
	}
	
}
