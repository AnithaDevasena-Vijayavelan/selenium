package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHover {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//mouse hover
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Fly For Sure")).click();
		
		System.out.println(driver.getCurrentUrl());
	
		
		
}

}
