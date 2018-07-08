package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.tofuGear.qa.Util.TestUtil;

public class FirefoxTest {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver","/Applications/Eclipse/xyz/geckodriver");	
		WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tofugear.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"Contact-menu\"]/a")).click();
		//xpath = "//*[@id=\"Contact-menu\"]/a"
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("g572-firstname")).sendKeys("anithaDevasena");
		driver.findElement(By.xpath("//*[@id=\"player_uid_143471911_1\"]/div[4]/div")).click();
		//*[@id="player_uid_143471911_1"]/div[4]/div
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]")).getText());
	/*	Select ClientConcernlist = new Select(driver.findElement(By.id("categories-selector")));
		ClientConcernlist.selectByVisibleText("Digital Transformation");
		driver.findElement(By.id("front-page-learn-more")).click();
		String digiTransURL = driver.getCurrentUrl();
		System.out.println(digiTransURL);*/
		
		
	}

}
