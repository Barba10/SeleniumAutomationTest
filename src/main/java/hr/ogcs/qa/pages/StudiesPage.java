package hr.ogcs.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;

public class StudiesPage extends TestBase {

	// Initializing the Page Objects:
	public StudiesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='vv_button CreateObject vv_primary']")
	WebElement createButton;
	
	//logout
		@FindBy(xpath="//button[@id='userMenu']")
		WebElement accountMenu;
		
		@FindBy(xpath="//span[contains(text(),'Log out')]")
		WebElement logOut;
		
		@FindBy(linkText="Non GLP Study")
		WebElement nonGLPStudy;
		
		@FindBy(xpath = "//a[@class='ok vv_primary vv_button vv_ellipsis']")
		WebElement continueButton;
		
		@FindBy(xpath = "//div[@class='multiItemSelectContainer vv_single_item vv_required_value_select_field']")
		WebElement selectStudyType;
		
		@FindBy(linkText="External GLP Study")
		WebElement externalGlpStudy;
	
	public void createStudies() {
		createButton.click();
	}
	
	public void createExternalGLPStudy() {
		createButton.click();
		selectStudyType.click();
		externalGlpStudy.click();
		continueButton.click();
	}
	
	public void createNonGLPStudyStudiy() {
		createButton.click();
		selectStudyType.click();
		nonGLPStudy.click();
		continueButton.click();
	}
	
	
	public void logout() {
		accountMenu.click();
		logOut.click();
	}
}
