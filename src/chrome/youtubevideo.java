package chrome;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.basics.Debug;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class youtubevideo {
public static void main(String[] args) throws FindFailed {
		
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=8fSV8BXbBDE");
		
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Screen s = new Screen();
		//String clazz = "chrome.youtubevideo";
		//String imgFolder = "/images";
        //String img = "googlesearch.png";
	
		//ImagePath.addImagePath(new File(basepath, relativePath).getAbsolutePath());
        //ImagePath.add(clazz+imgFolder);
		//ImagePath.setBundlePath("/Applications/Eclipse/Amirtha/selenium/chrome/src/chrome");
		Pattern pause  = new Pattern("pause.png");
		//Pattern pausebutton = new Pattern("pause.png");
		//System.out.println(ImagePath.getBundlePath());
		s.find("pause.png");
		s.click();
		s.click();
		
		Pattern play  = new Pattern("play.png");
		s.wait(play,5000);
		s.click();
		
		s.click();
		//driver.close();
		//driver.quit();
}
*/

	 /* public static void main(String[] args) throws FindFailed {
	    Debug.setDebugLevel(3);
	    Screen s = new Screen();
	    s.find(s.userCapture().getFile()).highlight(2);
	  }*/

	
}
