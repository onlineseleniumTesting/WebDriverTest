package test1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
  @Test
  @Parameters({"val1", "val2"})
  public void sum(int a, int b) {
	  int c = a + b;
	  System.out.println("Addition of 2 values are :"+c);
  }
}
