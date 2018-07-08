package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class tofugearvideo {

public static void main(String[] args) throws InterruptedException, FindFailed {
		
		
		System.setProperty("webdriver.chrome.driver","/Applications/Eclipse/xyz/chromedriver");	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tofugear.com/");
		
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement elm = driver.findElement(By.className("resizelistener"));
		String urlStr = elm.getAttribute("src");
		System.out.println("Video Url : " + urlStr);
		//driver.navigate().to(urlStr);
		System.out.println("click to play");
		elm.click();
		
		Thread.sleep(10000);
		System.out.println("click to pause");
		elm.click();
		
		
/*
		Screen s = new Screen();
		Pattern playbutton = new Pattern("play.png");
		System.out.println(ImagePath.getBundlePath());
		s.wait(playbutton,2000);
		s.click();
		s.click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   
		 //play video
		 js .executeScript("document.getElementById('player').getElementsByClassName('video-stream html5-main-video').play()");
		 Thread.sleep(5000);
		   
		 //pause playing video 
		 js .executeScript("document.getElementById(\"video\").pause()");
		   
		 //check video is paused
		 System.out.println(js .executeScript("document.getElementById(\"video\").paused"));
		   
		 js .executeScript("document.getElementById(\"video\").play()");
		   
		 // play video from starting
		 js .executeScript("document.getElementById(\"video\").currentTime=0");
		 Thread.sleep(5000);
		   
		 //reload video
		 js .executeScript("document.getElementById(\"video\").load()");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Click on play button
		jse.executeScript("jwplayer().play();");
		Thread.sleep(2000);
		//Pause
		jse.executeScript("jwplayer().pause()");
		Thread.sleep(2000);
		//Play
		jse.executeScript("jwplayer().play();");
		Thread.sleep(2000);
		// Set Volume
		Thread.sleep(2000);
		jse.executeScript("jwplayer().setVolume(50);");
		Thread.sleep(2000);
		//Mute Player
		jse.executeScript("jwplayer().setMute(true);");
		Thread.sleep(2000);
		//UnMute Player
		jse.executeScript("jwplayer().setMute(false);");
		Thread.sleep(2000);
		//Stop the player
		jse.executeScript("jwplayer().stop()");
		Thread.sleep(2000);

		driver.quit();

*/
		}

}
