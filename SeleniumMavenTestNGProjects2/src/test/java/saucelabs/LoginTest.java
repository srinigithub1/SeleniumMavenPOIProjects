package saucelabs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LoginTest {
  @Test(dataProvider = "Data_login")
  public void Login(String uname, String pwd) {
	  System.out.println("the uname is: "+uname);
	  System.out.println("the pwd is: "+pwd);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("the before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("the after method is: ");
  }


  @DataProvider
  public Object[][] Data_login() {
    return new Object[][] {
      new Object[] { "SacueLabs1", "pwd6" },
      new Object[] { "SacueLabs2", "pwd5" },
      new Object[] { "SacueLabs3", "pwd4" },
      new Object[] { "SacueLabs4", "pwd3" },
      new Object[] { "SacueLabs5", "pwd2" },
      new Object[] { "SacueLabs6", "Pwd1" },
      
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("the before class ");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("the After class ");
  }

}
