package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;

public class CreateInspectionPage extends TestBase {

	@FindBy(xpath="//div[@id='computired_system__c']/div/input")
	WebElement form_computerized_system;
	
	@FindBy(linkText="QUARTS")
	WebElement form_computerized_system_select;
	
	@FindBy(xpath="//div[@id='glp_inspector__c']/div/input")
	WebElement form_glp_inspector;
	
	@FindBy(linkText= "QAU Writer1, Lihof")
	WebElement form_glp_inspector_select;
	
	@FindBy(name= "description__c")
	WebElement form_description;
	
	@FindBy(xpath = "//div[@id='plSection_1']/div[2]/form/div[2]/span[3]/div/div[2]/div/div/div/div/div/div/input")
	WebElement form_request_item;
	
	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[44]")
	WebElement form_request_item_text_select;
	
	@FindBy(name = "request_no__c")
	WebElement form_request_item_others;
	
	public  CreateInspectionPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void FillComputerizedSystemInspection() throws InterruptedException {
		form_computerized_system.sendKeys("QUARTS");
		form_computerized_system_select.click();
		form_glp_inspector.sendKeys("QAU Writer1, Lihof");
		form_glp_inspector_select.click();
		form_description.sendKeys("Validation - Description Inspection 001");
		form_request_item.sendKeys("Others");
		Thread.sleep(1000);
		form_request_item_text_select.click();
	    form_request_item_others.sendKeys("Validation - Description Inspection 001");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
