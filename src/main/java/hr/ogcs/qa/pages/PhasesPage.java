package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class PhasesPage extends TestBase{

	public PhasesPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='vv_button CreateObject vv_primary']")
	WebElement create_button;
	
	@FindBy(xpath = "//div[@class='multiItemSelectContainer vv_single_item vv_required_value_select_field']")
	WebElement choose_phase_type;
	
	@FindBy(linkText="Inlife")
	WebElement inlife;

	@FindBy(linkText="Analytical")
	WebElement analytical;
	
	@FindBy(linkText="Biological")
	WebElement biological;
	
	@FindBy(linkText="Field")
	WebElement field;
	
	@FindBy(linkText="Specimen Management")
	WebElement speciment_management;
	
	@FindBy(xpath = "//a[@class='ok vv_primary vv_button vv_ellipsis']")
	WebElement continueButton;
	
	
	public void createInlifePhases() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(choose_phase_type, "Choose Phase Type");
		TestUtil.click(inlife, "InLife");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void createAnalyticalPhases() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(choose_phase_type, "Choose Phase Type");
		TestUtil.click(analytical, "Analytical");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void createBiologicalPhases() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(choose_phase_type, "Choose Phase Type");
		TestUtil.click(biological, "Biological");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void createFieldPhases() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(choose_phase_type, "Choose Phase Type");
		TestUtil.click(field, "Field");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void createSpecimentManagementPhases() {
		TestUtil.click(create_button, "Create Button");
		TestUtil.click(choose_phase_type, "Choose Phase Type");
		TestUtil.click(speciment_management, "Speciment Management");
		TestUtil.click(continueButton, "Continue Button");

	}
}
