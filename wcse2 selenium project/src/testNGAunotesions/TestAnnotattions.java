package testNGAunotesions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotattions {
  @Test
  public void f() {
	 Reporter.log("Test Case1",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method",true);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterclass",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforetest",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("aftertest",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suite",true);
  }
  @Test
  public void h() {
	 Reporter.log("Test Case2",true);
  }
  @Test
  public void g() {
	 Reporter.log("Test Case3",true);
  }

}
