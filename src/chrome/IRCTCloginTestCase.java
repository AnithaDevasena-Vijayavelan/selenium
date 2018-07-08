package chrome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTCloginTestCase {

	private static Scanner Scan;

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.gecko.driver","/Applications/Eclipse/xyz/geckodriver");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().window().maximize();
		
		Properties prop = new Properties();
		InputStream input = new FileInputStream("/Applications/Eclipse/Amirtha/selenium/chrome/src/chrome/config.properties");
		prop.load(input);
		
		driver.findElement(By.xpath("//input[@id='usernameId']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@class='loginPassword']")).sendKeys(prop.getProperty("password"));;
		Scan = new Scanner(System.in);
		System.out.println("Enter the captcha");
		String captcha = Scan.nextLine();
		driver.findElement(By.xpath("//input[@id='nlpAnswer']")).sendKeys(captcha);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginbutton")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("login is successful");
		}
		else
		{
			System.out.println("login failed");
		}
		
		driver.close();
		driver.quit();
	}
}
