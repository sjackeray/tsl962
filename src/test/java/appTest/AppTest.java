package appTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import login.App;
public class AppTest {
  @Test(description="Login with Valid details")
  public void loginTest() throws Exception {
	  App ap=new App();
	boolean status=  ap.userLogin("userdemo", "password");
	Assert.assertTrue(status);
	
	
	
  }
  
  @Test(description="Login with InValid details")
  public void loginTestWithInvalid() throws Exception {
	  App ap=new App();
	boolean status=  ap.userLogin("userdemo", "password123");
	Assert.assertFalse(status);
	
	
	
  }
}
