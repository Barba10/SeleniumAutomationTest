package hr.ogcs.qa.pages;

import java.io.IOException;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class BinderPage extends TestBase {
	
	public BinderPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@class='editBinder vv_button']")
	WebElement editBinder;
	
	@FindBy(xpath="//button[@class = 'addToBinder vv_button vv_button_dropdown']")
	WebElement addButton;
	
	@FindBy(linkText = "Existing Documents")
	WebElement existingDocuments;
	
	@FindBy(xpath = "//input[contains(@class,'searchInput vv_rd_search_input')]")
	WebElement searchBar;
	
	@FindBy(xpath= "//svg[@class='svg-inline--fa fa-plus-circle fa-w-16 docAction vv_action_link']")
	WebElement addItem;
	
	@FindBy(css=".ui-icon-closethick")
	WebElement closeExistingDocuments;
	
	@FindBy(xpath="//span[contains(text(),'Done Editing')]")
	WebElement doneEditing;
	
	@FindBy(xpath = "//body[@id='veevaBasePage']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front vv_binders persist vv_search_dialog vv_palette ui-draggable']/div[@id='ui-id-1']/div[@class='dialogContent vv_body_content vv_uniform_forms']/div[@class='vv_binders_right']/div[@class='searchContainer vv_scrollable_list']/div[@class='searchBody ui-selectable']/div[1]/div[1]")
	WebElement dragElement;
	
	@FindBy(xpath="//div[2]/div/div[2]/div[4]")
	WebElement dropTo;
	
	@FindBy(xpath="//div[@class='vv_binders_sections']//a[@class='vv_vpage_viewTile vv_button vv_outlineView outlineView_off']")
	WebElement outlineView;
	
	public void dragAndDropeSupporting() {
        WebElement from = dragElement;
        WebElement to = dropTo;
        Actions move = new Actions(driver);
        move.dragAndDrop(from, to).build().perform();
    }
	
	public void editBinder() throws IOException, InterruptedException {
		editBinder.click();
		outlineView.click();
		wait.until(ExpectedConditions.visibilityOf((addButton)));
		addButton.click();
		wait.until(ExpectedConditions.visibilityOf((existingDocuments)));
		existingDocuments.click();
		searchBar.sendKeys("EAGLES Exercise 2 (v0.1)"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf((dragElement)));
		dragAndDropeSupporting();
		Thread.sleep(5000);
		searchBar.clear();
		searchBar.sendKeys("BAS 455 37 H FR ReReg (v0.1)"+Keys.ENTER);
		dragAndDropeSupporting();
		Thread.sleep(5000);
		searchBar.clear();
		searchBar.sendKeys("BAS 455 37 H Core S ReReg (v0.1)"+Keys.ENTER);
		dragAndDropeSupporting();
		closeExistingDocuments.click();
		doneEditing.click();
		TestUtil.takeScreenshotAtEndOfTest();
	}
}
