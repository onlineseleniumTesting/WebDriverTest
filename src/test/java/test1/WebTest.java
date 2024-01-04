package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class WebTest {
  @Test(priority = 2) 
  public void test1() {
	  System.out.println("Functionality check for test1");
  }
  
  @Test(priority = 1) 
  public void test2(){
	  System.out.println("Functionality check test2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("Open the browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close the browser");
  }
  
  @BeforeTest
  public void beforeTest() {
		 System.out.println("Before test executing");
	  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("AFter test executing");
  }
  
  
  
}
