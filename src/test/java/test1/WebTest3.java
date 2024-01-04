package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest3 {
	WebDriver driver;
//  @Test(groups = {"demo1"})
  @Test
  public void stargintPoint() {
	  System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		String testTitle = "Register: Mercuy Tours";
		  String originalTitle = driver.getTitle();
		  Assert.assertEquals(testTitle, originalTitle);
	  
  }
//  @Test(groups = {"demo2"})
//  public void checkTitle() {
//	  String testTitle = "Register: Mercuy Tours";
//	  String originalTitle = driver.getTitle();
//	  Assert.assertEquals(testTitle, originalTitle);
//	  
//  }
//  
//  @Test
//  public void clickElement() {
//	  driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
//	  System.out.println("Cliked on submit elemnt on the mercury page");
//	  
//  }
//  
//  
  }
  
