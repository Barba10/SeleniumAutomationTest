package hr.ogcs.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

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
		TestUtil.click(createButton, "Create button");
//		createButton.click();
	}
	
	public void createExternalGLPStudy() {
		TestUtil.click(createButton, "Create Button");
		TestUtil.click(selectStudyType, "Select Study Type");
		TestUtil.click(externalGlpStudy, "External Study Type");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	public void createNonGLPStudyStudiy() {
		TestUtil.click(createButton, "Create Button");
		TestUtil.click(selectStudyType, "Select Study Type");
		TestUtil.click(nonGLPStudy, "Non GLP Study");
		TestUtil.click(continueButton, "Continue Button");
	}
	
	
	public void logout() {
		TestUtil.click(accountMenu, "Account menu");
		TestUtil.click(logOut, "Log Out Button");
		
//		accountMenu.click();
//		logOut.click();
	}
}
