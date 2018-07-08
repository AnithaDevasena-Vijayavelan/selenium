package chrome;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javaScriptChrome {
	
	 public static void main(String[] args) throws IOException{
	
		
		
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();	
		
		
 		driver.get("https://www.freecrm.com/index.html");
		
 		driver.manage().window().maximize();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		driver.findElement(By.xpath("//input[contains(@name, 'username')]")).sendKeys("Anitha");
 		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("Anitha");
 		
 		
 		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("devasena.Vijay");
		//driver.findElement(By.xpath("//input[contains(@type, 'button')]")).click();
	
		WebElement btn = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));
		
		
		flash(btn, driver);
		
		drawBorder(btn, driver);
		
		generateAlert(driver,"There is an issue with login button");
		Alert Alert1 = driver.switchTo().alert();
		String Errormsg = Alert1.getText();
		System.out.println(Errormsg);
		Alert1.accept();
		
		/*
		//to take screenshot and store in externalfile
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/mariappanvijayavelan/Desktop/element.png"));
		*/
		
		//btn.click();
		clickElement(btn,driver);
		
		//refershment by js 
		refreshbrowser(driver);
		System.out.println(driver.getCurrentUrl()); 
		//scrolldown(driver);
		
		//System.out.println(pageText(driver));
		
		
		WebElement PP = driver.findElement(By.linkText("Terms & Conditions"));
		
		scrollIntoView(PP, driver);
		//driver.findElement(By.linkText("Privacy Policy")).click();
		clickOn(driver, PP, 20);
		//driver.close();
		//driver.quit();
		
		}
	
	 /*
	  * Explicitwait to make the privacy policy clickable
	  */
	 public static void clickOn(WebDriver driver, WebElement Element, int timeout) {
		 new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Element));
		 Element.click();
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}

	public static void refreshbrowser(WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
			System.out.println(js.executeScript("return document.title;"));
			System.out.println(js.executeScript("return window.innerHeight;"));
			System.out.println(js.executeScript("return window.innerWidth;"));
			System.out.println(js.executeScript("return document.URL")); 
			js.executeScript("window.location = 'https://www.freecrm.com/index.html'");
			//driver.navigate().back();
			/*//scroll down by yaxis 150 pixels
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			*/
	 }
	 
	 private static String pageText(WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
			String data = js.executeScript("return document.documentElement.innerText();").toString();
			return data;
	 }
	 
	 private static void scrolldown(WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 }
	 
	 

	public static void flash(WebElement element,WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 String bgcolor = element.getCssValue("backgroundColor");
		 for(int i=1; i<=20; i++) {
			 changeColor("rgb(0,200,0)", element, driver);
			 changeColor(bgcolor, element, driver);
		 }
		 
	 }

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+ color +"'", element );
		try {
			Thread.sleep(20);
		}
		catch (InterruptedException e)
		{
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String Message)
	{
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("alert('"+Message+"')");
	}
	
	public static void clickElement(WebElement element, WebDriver driver)
	{
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();",element);
	}
	
}
