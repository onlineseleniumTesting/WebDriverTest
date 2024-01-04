package test1;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
	
	@DataProvider(name="dp-provider")
	public Object[][] dpMethod(){
	return new Object[][]{{"first-value"},{"second-value"},{"third-value"}};
	}
	
	
  @Test(dataProvider = "dp-provider")
  public void mytest(String val) {
	  System.out.println("Passed parameter is:"+val);
	  Reporter.log("Passed parameter is:"+val);
	  
  }
}
