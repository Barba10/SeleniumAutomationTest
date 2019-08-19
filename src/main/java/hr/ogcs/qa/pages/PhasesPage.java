package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

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
		create_button.click();
		choose_phase_type.click();
		inlife.click();
		continueButton.click();
	}
	
	public void createAnalyticalPhases() {
		create_button.click();
		choose_phase_type.click();
		analytical.click();
		continueButton.click();
	}
	
	public void createBiologicalPhases() {
		create_button.click();
		choose_phase_type.click();
		biological.click();
		continueButton.click();
	}
	
	public void createFieldPhases() {
		create_button.click();
		choose_phase_type.click();
		field.click();
		continueButton.click();
	}
	
	public void createSpecimentManagementPhases() {
		create_button.click();
		choose_phase_type.click();
		speciment_management.click();
		continueButton.click();
	}
}
