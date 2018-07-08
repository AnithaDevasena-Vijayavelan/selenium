package chrome;

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chrome_radiomsg {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");
		WebDriver driver = new ChromeDriver();
/*		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("gb_P")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("identifierId")).isDisplayed());
		System.out.println(driver.findElement(By.id("identifierId")).isEnabled());
		driver.findElement(By.id("identifierId")).sendKeys("devasena.rainba@gmail.com");
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("data-initial-value"));
		driver.findElement(By.cssSelector("#identifierNext")).click();
		System.out.println(driver.getCurrentUrl());
	
		//window dialogue box message
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("proceed")).click();
		
		Alert Alert1 = driver.switchTo().alert();
		String Errormsg = Alert1.getText();
		System.out.println(Errormsg);
		Alert1.accept();
*/		
		
/*
		//Radio button
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement radiomale = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		System.out.println(radiomale.isDisplayed());
		System.out.println(radiomale.isEnabled());
		System.out.println(radiomale.isSelected());
	
		WebElement radiofemale = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		radiofemale.click();
		System.out.println(radiomale.isSelected());
		System.out.println(radiofemale.isSelected());
		
		//drop Down Element
		Select dropDownCountry = new Select(driver.findElement(By.id("country")));
		//dropDownCountry.selectByValue("3");
		dropDownCountry.selectByVisibleText("India");
		Thread.sleep(3000);
		Select dropDownCity = new Select(driver.findElement(By.cssSelector("#div_city > table > tbody > tr:nth-child(1) > td:nth-child(3) > select")));
		dropDownCity.selectByValue("Madurai");
		
		java.util.List<WebElement> l = dropDownCountry.getOptions();
		int c1 = l.size();
		System.out.println("No of country items" +c1);
		
		java.util.List<WebElement> k = dropDownCity.getOptions();
		int c2 = k.size();
		System.out.println("No of city items" +c2);
		
		
		
		//image title
		driver.navigate().to("https://www.google.com.hk");
		System.out.println(driver.findElement(By.cssSelector("#hplogo")).getAttribute("alt"));

		//Frame web page
		driver.navigate().to("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.cssSelector("body > div > ul:nth-child(2) > li:nth-child(1) > a > span")).click();
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/ul[2]/li[2]/a")).click();
		System.out.println(driver.getCurrentUrl());
*/		
		
		//gmail password setup
		/*driver.manage().window().maximize();
		driver.findElement(By.tagName("input")).sendKeys("Nallu005");
		driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
		System.out.println("size" +driver.manage().window().getSize());
		System.out.println("cookies" +driver.manage().getCookies());
		System.out.println("size" +driver.manage().window().getSize());
		System.out.println("position" +driver.manage().window().getPosition());
		
		System.out.println("size" +driver.manage().window().getSize());
		System.out.println("position" +driver.manage().window().getPosition());
		System.out.println("class" +driver.manage().window().getClass());*/
		
		
		//my first ui automation
		/*System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles())
		System.out.println(driver.getPageSource());
		driver.findElement(By.id("lst-ib")).sendKeys("Amirthananthamai");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(2) > a")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#rg_s > div:nth-child(1) > a > img")).click();*/
		//driver.findElement(By.cssSelector("#irc_cc > div:nth-child(2) > div.irc_t.i30052 > div.irc_mic.r-iCFOEnScHUBQ > div.irc_mimg.irc_hic.iCFOEnScHUBQ-lvVgf-rIiHk > a > img")).click();
		//System.out.println(driver.getCurrentUrl());

		/*
		//webtable
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		//WebElement htmltable = driver.findElement(By.cssSelector("#leftcontainer > table"));
		//To print the content of the table
		//System.out.println(htmltable.getText());
		
		
		//To get rows count
		int rowsdata = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
		System.out.println("Table Rows: "+rowsdata);
		
		//to get Columns Count
		int columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/*")).size();
		System.out.println("Table Columns: "+columns);
		
		for(int a = 1; a <= columns; a++)
		{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[" + a +"]")).getText() + "  ");
		}
		System.out.println();
		
		
		for(int i=1; i <= rowsdata; i++)
		{
			for(int j=1; j <= columns; j++)
			{
				System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/*[" + j + "]")).getText() + "  ");
			}
			System.out.println();
		}
		*/
		
		
		//System.out.println(driver.findElements(By.cssSelector("#leftcontainer > table > tbody > tr:nth-child(1) > td:nth-child(1) > a")));
		driver.close();
		driver.quit();
	
}
}