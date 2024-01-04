package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent {
  @Test
  public void registration() {
	  System.out.println("This wil execute registration ");
//	  Assert.assertEquals(false, true);
  }

  @Test(dependsOnMethods = {"registration"})
  public void login() {
	  System.out.println("This wil execute Login and depends on Registration");
  }
}
