package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tofugear {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tofugear.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"Contact-menu\"]/a")).click();
		driver.findElement(By.id("g572-firstname")).sendKeys("Anitha");
		driver.findElement(By.id("g572-lastname")).sendKeys("devasena");
		driver.findElement(By.id("g572-emailaddress")).sendKeys("shdjs");
		driver.findElement(By.id("g572-companyname")).sendKeys("fico");
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		Alert Alert1 = driver.switchTo().alert();
		String Errormsg = Alert1.getText();
		System.out.println(Errormsg);
		
		
}
}
