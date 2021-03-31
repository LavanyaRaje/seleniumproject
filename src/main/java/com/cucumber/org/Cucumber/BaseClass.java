package com.cucumber.org.Cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;


	public static WebDriver browserLaunch(String option) { // option means browsername
		try {
			if (option.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (option.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\");
				driver = new FirefoxDriver();
			} else if (option.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid BrowserName");

			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
		
	}

	// ============Get URL or Browser launch==============//
	public static void getUrl(String url) {
		driver.get(url);
	}

	// ===========Dropdown===============//
	public static void DropDownDemo(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

	// =========x path and common methods to click on any element=========//
	public static void click(WebElement element) {
		element.click();
	}
	// ===============click===============//
	// public static void click(WebElement element) {
	// element.click();

	// ========send keys======//
	public static void sendKeys(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void sendKeys(WebElement element, Integer input1) {
		element.sendKeys("input1");
	}

	// =========close==========//
	public static void close() {
		driver.close();
	}

	// ==========quit==========//
	public static void quit() {
		driver.quit();
	}

	// ============navigate to==============//
	public static void navigateTo(String input) {
		driver.navigate().to(input);
	}

	// ===============navigateURL==========//
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	// =============navigate back=================//
	public static void navigateBack() {
		driver.navigate().back();
	}

	// ===========navigate forward===========//
	public static void navigateForward() {
		driver.navigate().forward();
	}

	// ============navigate refresh========//
	public static void refresh() {
		driver.navigate().refresh();
	}

	// ==========simple alert=============//
	public static void alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// ============confirm alert=========//
	public static void calert(String option) {
		Alert alert = driver.switchTo().alert();
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}

	// ===============promt alert=========//
	public static void promAlert(String input, String option) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}

	// ============actions=========//
	public static void actions(String option, WebElement element) {
		Actions ac=new Actions(driver);
		if (option.equalsIgnoreCase("rightclick")) {
			ac.contextClick(element).build().perform();
		} else if (option.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		} else if (option.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();
		}
	}

	// else if(option.equalsIgnoreCase("dragdrop")) {
	// ac.dragAndDrop(source element,dest element).build().perform();
	// ============DragDrop============//
	public static void actionDragAndDrop(WebElement source, WebElement destination) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destination);
	}

	// =============frame===============//

	public static void frames(String parameter, String value) {
		if (parameter.equalsIgnoreCase("Integer")) {
			driver.switchTo().frame(value);
		} else if (parameter.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(value);
		} else if (parameter.equalsIgnoreCase("id_or_name")) {
			driver.switchTo().frame(value);
		}
	}

	// =============parent Frame==========//
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// ==============DefaultFrame============//
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}

	// ===============Robot============//
	public static void robot(String option) throws AWTException {
		Robot r = new Robot();
		if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (option.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
	}

	// ==============Check box=================//
	public static void checkBox(WebElement element) {
		element.click();
	}

	// ===============isEnabled===========//
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	// =============isDisplayed===========//
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	// =============isSelected===========//
	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	// ============getOptions==========//
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		java.util.List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}

	// ==============getTitle===============//
	public static void getTitle() {
		driver.getTitle();
	}

	// ===============getURL===============//
	public static void getCurrentURL() {
		driver.getCurrentUrl();
	}

	// ==============getAttribute============//
	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// ==============isMultiple=============//
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}

	// ==============Get all Selected option=============//
	public static void getrAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		java.util.List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	}

	// ==============Get First Selected Option==========//
	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
	}

	// ===============Take ScreenShot=============//
	public static void takeScreenshot(String element, String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

	}

	// ================scrollUp And Down axis================//
	public static void ScrollUpDownAxis(String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("up")) {
			js.executeAsyncScript("window.scrollBy(0,3000)");
		} else if (value.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollBy(0,-3000)");

		}

	}

	public void windowhandles(String name) {
		driver.switchTo().window(name);

	}

	public void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void implicitwait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);

	}
	public void explicitwait(WebElement element,int timeOut) {
	 WebDriverWait wait=new WebDriverWait(driver, timeOut);
	 wait.until(ExpectedConditions.visibilityOf(element));
	 
	}

}
