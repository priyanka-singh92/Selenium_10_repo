package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript 
{
  @Test
  public void login()
  {
	  Reporter.log("Open browser",true);
	  Reporter.log("Enter url",true);
	  Reporter.log("Click on login link",true);
	  Reporter.log("Enter credentials",true);
	  Reporter.log("Click on login button",true);
	  
	  Assert.assertEquals(true, false);   // intentionally failed the script
  }
}
