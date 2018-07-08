package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragandDrop {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		//drag and drop
		Actions action = new Actions(driver);
		//action.clickAndHold(driver.findElement(By.id("draggable"))).
		//moveToElement(driver.findElement(By.id("droppable")))
		//.release().build().perform();
		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		
		//driver.close();
		//driver.quit();
		
	}
}
