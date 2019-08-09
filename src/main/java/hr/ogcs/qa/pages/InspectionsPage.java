package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;

public class InspectionsPage extends TestBase {
	
	@FindBy(xpath="//div[3]/div/div/div/div/button/span")
	WebElement create_button;
	
	@FindBy(xpath="//span/div/div[2]/a")
	WebElement inspection_type;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement continue_button;
	
	@FindBy(linkText="Computerized System Inspection")
	WebElement inspection_type_value_csi ;
	
	public  InspectionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectComputerizedSystemInspection() {
		wait.until(ExpectedConditions.visibilityOf(create_button));
		create_button.click();
		inspection_type.click();
		inspection_type_value_csi.click();
		continue_button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
