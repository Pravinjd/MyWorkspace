package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ThirdTest {
	
	
  @Test
  public void test_login() {
	  System.out.println("inside login method");
  }
  
  @Test
  public void test_logout() {
	  System.out.println("inside logout method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside after method");

  }

}
