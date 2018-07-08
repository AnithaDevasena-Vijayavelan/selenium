package Java.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestCase {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=2,groups="google")
	public void googleTitle(){
		System.out.println(driver.getTitle());	
	}
	
	
	@Test(priority=1,groups="google")
	public void googlelogo(){
		System.out.println(driver.findElement(By.cssSelector("#hplogo")).isDisplayed());	
	}
	
	@Test(priority=3,groups="fail")
	public void googlemail(){
		boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=4,groups="gmail")
	public void gmail(){
		driver.findElement(By.className("gb_P")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("identifierId")).isDisplayed());
		System.out.println(driver.findElement(By.id("identifierId")).isEnabled());
		driver.findElement(By.id("identifierId")).sendKeys("devasena.rainba@gmail.com");
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("data-initial-value"));
		driver.findElement(By.cssSelector("#identifierNext")).click();
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=5,groups="simple")
	public void test5(){
		System.out.println("test5");
	}
	
	@Test(priority=7, groups="simple")
	public void test6(){
		System.out.println("test6");
	}
	
	@Test(priority=6, groups="simple", invocationCount=5)
	public void test7(){
		System.out.println("test7");
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.close();
		driver.quit();
	}
	
	

}
