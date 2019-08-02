package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class WhereUsedPage extends TestBase {


	// Initializing the Page Objects:
	public WhereUsedPage() {
		PageFactory.initElements(driver, this);
	}

	public void TakingScreenShoot() throws IOException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td/div/div/a")));
		TestUtil.takeScreenshotAtEndOfTest();
	}

	
	
}
