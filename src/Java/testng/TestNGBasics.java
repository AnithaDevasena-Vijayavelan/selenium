package Java.testng;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setup(){
		System.out.println("Setup the system ptoperties");
	}
	
	@BeforeTest
	public void LaunchBrowser(){
		System.out.println("Launch the google chrome");
	}
	
	@BeforeClass
	public void enterurl(){
		System.out.println("Enter the URL");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Login using the credentials");
	}
	
	@Test
	public void Testcase1(){
		System.out.println("Test case1 with test steps, test data and verfication points");
	}
	
	@Test
	public void Testcase2(){
		System.out.println("Test case2 with test steps, test data and verfication points");
	}
	
	@Test
	public void Testcase3(){
		System.out.println("Test case3 with test steps, test data and verfication points");
	}
	@AfterMethod
	public void logout(){
		System.out.println("log out the application");
	}
	
	@AfterClass
	public void close(){
		System.out.println("close and quit the browser");
	}
	
	@AfterTest
	public void cookies(){
		System.out.println("Delete all the cookies of the browser");
	}
	
	@AfterSuite
	public void Report(){
		System.out.println("make a test report");
	}
	
	

}
