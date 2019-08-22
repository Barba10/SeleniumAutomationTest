package hr.ogcs.qa.util;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;

import hr.ogcs.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	static JavascriptExecutor js;
	
	static String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		String fileLocation = currentDir + "/screenshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(scrFile, new File(fileLocation));
		childTest.addScreenCaptureFromPath(fileLocation,"Screenshoot");
		childTest.info("Taking Screenshoot");
	}

	public static void runTimeInfo(String messageType, String message) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// Check for jQuery on the page, add it if need be
		js.executeScript("if (!window.jQuery) {"
				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
		Thread.sleep(5000);

		// Use jQuery to add jquery-growl to the page
		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

		// Use jQuery to add jquery-growl styles to the page
		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
		Thread.sleep(5000);

		// jquery-growl w/ no frills
		js.executeScript("$.growl({ title: 'GET', message: '/' });");
//'"+color+"'"
		if (messageType.equals("error")) {
			js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
		}else if(messageType.equals("info")){
			js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
		}else if(messageType.equals("warning")){
			js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
		}else
			System.out.println("no error message");
		// jquery-growl w/ colorized output
//		js.executeScript("$.growl.error({ title: 'ERROR', message: 'your error message goes here' });");
//		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
//		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
		Thread.sleep(5000);
		}
	
	
	public static void verifyEquals(WebElement element, String text) throws IOException, InterruptedException {
		Thread.sleep(1000);
		
		if(element.getText().isEmpty())
		{
		    System.out.println(text + " is blank");	
	    	childTest.info(text + " is blank");

		}
		else
		{
			try {
			    assertEquals(element.getText().replaceAll("\n", " "), text);
			    System.out.println(text + " is visible");
		    	childTest.info(text + " is visible");
				//logger.log(Status.PASS, text + " is visible");
	
			} catch (Throwable t) {
				//logger.log(Status.FAIL, "Error with verifying " + text);
				//logger.log(Status.FAIL, t.getMessage());
			    System.out.println("Error with verifying " + text);
			    System.out.println(t.getMessage());
		    	childTest.info("Error with verifying " + text + t.getMessage());
			}
		}
	}
	
	public static String RandomName(int length) {
		char[] chars2 = chars.toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			char c = chars2[random.nextInt(chars2.length)];
			sb.append(c);
		}
		String randomString = sb.toString();
		return randomString;
	}
	
	public static void editableField(WebElement element, String text) {
		if(element.isEnabled()) {
			System.out.println("Field : " + text + " is editable");
	    	childTest.info("Field : " + text + " is editable");

		}
		else{
			System.out.println("Field : " + text + " is not editable");
	    	childTest.info("Field : " + text + " is not editable");

		}	
	}
	
	public static void containText(WebElement element, String text) throws IOException {
		if(element.getText().contains(text)) {
		    System.out.println(element.getText() + " is displayed." +" "+ text + " is visible");
	    	childTest.info(element.getText() + " is displayed." +" "+ text + " is visible");

		}
		else
		{
		    System.out.println(element.getText() + " is displayed.");
	    	childTest.info(element.getText() + " is displayed.");

		}
	}
	
	public static void UploadFile() {
		
	    if(System.getProperty("os.name").toLowerCase().contains("windows")){ 
	    	//for local upload
		    driver.findElement(By.id("inboxFileChooserHTML5")).sendKeys(System.getProperty("user.dir")+ ".\\upload\\pdf1.pdf");
	    }
	    else{
		    //FOR LINUX RUNING FROM GIT
	    	driver.findElement(By.id("inboxFileChooserHTML5")).sendKeys("/builds/qa/eaglesAutomation/upload/pdf1.pdf");
	    }
	}
	
	public static void ClickOnFocusedItem(String elementName) throws InterruptedException{
		Thread.sleep(500);
		WebElement focusedItem;
		focusedItem = driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused"));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(focusedItem));
			focusedItem.click();
			System.out.print(elementName + " is clicked \n");	
	    	childTest.info(elementName + " is clicked");
		} catch (StaleElementReferenceException e) {
			for (int i = 0; i <= 30; i++) {
				try {
					boolean exists = false;
					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					focusedItem = driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused"));
					focusedItem.click();

					exists = true;
					if (exists) {
						System.out.print(elementName + " is clicked \n");	
				    	childTest.info(elementName + " is clicked");
						break;
					}
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				} catch (StaleElementReferenceException e1) {
					if (i == 30) {
						throw e1;
					}
				}
			}
		}
	}
	
	public static Boolean hasElementAtributeRadio(WebElement element){	
		
		if(element.getAttribute("type") != null)
		{	
			if(element.getAttribute("type").equals("radio")) {
				return true;
			}
		}
		return false;
	}
	
	public static void click(WebElement element, String elementName)  {		
		// wait doesn't work with radio button
		
		
		
		
		if(!hasElementAtributeRadio(element)) {	
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				System.out.print(elementName + " is clicked \n");	
		    	childTest.info(elementName + " is clicked");
			} catch (StaleElementReferenceException e) {
				for (int i = 0; i <= 30; i++) {
					try {
						boolean exists = false;
						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						element.click();
						exists = true;
						if (exists) {
							System.out.print(elementName + " is clicked \n");	
					    	childTest.info(elementName + " is clicked");
							break;
						}
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					} catch (StaleElementReferenceException e1) {
						if (i == 30) {
							throw e1;
						}
					}
				}
			}
		}else {
			element.click();
			System.out.print(elementName + " is clicked \n");	
			childTest.info(elementName + " is clicked");
		}
	}
	
	

		
	//Type function
	public static void type(WebElement element, String elementName, String typedText) {
		//clearing field before entering text
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"),typedText);
		System.out.println("Typed in " + elementName + ": " + typedText);
		
		childTest.info("Typed in " + elementName + ": " + typedText);
	}
	
	//Type function
		public static void select(WebElement element, String elementName, String elementToSelect) {
			//clearing field before entering text
		
			wait.until(ExpectedConditions.visibilityOf(element));
			Select Select = new Select(element);
			Select.selectByVisibleText(elementToSelect);
			System.out.println(elementToSelect + " is selected from " + elementName);
			childTest.info(elementToSelect + " is selected from " + elementName);

		}

}
