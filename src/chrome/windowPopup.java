package chrome;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		//String parent = driver.getWindowHandle();
		
		Set <String> Handles = driver.getWindowHandles();
		int BrowserCount = Handles.size();
		System.out.println(BrowserCount);
		
	   Iterator iter = Handles.iterator();
	   
	   String maintab=(String) iter.next();//maintab holds the 1st browser window
	
	   
	   String childtab=(String) iter.next();//childtab holds the next browser window

	   driver.switchTo().window(childtab); //move to child browser window
	   System.out.println(childtab + driver.getTitle());
	   driver.close();
		   
	   driver.switchTo().window(maintab); //move to parent browser window
	   System.out.println(maintab+driver.getTitle());
	   driver.close();
		/*
		for(String s1:Handles)
		{
			if(!s1.equals(parent))
			{
				driver.switchTo().window(s1);
				System.out.println(driver.getCurrentUrl());
			}
			driver.switchTo().window(parent);
			System.out.println(driver.getCurrentUrl());
		}
		*/
	}

}
