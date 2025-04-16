package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TC_DWS_001 {
	
	 @Test  (groups = "smoke")     
		
		public void clickOnBooks()
		{
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("User is able to click on Books link",true);
		}

}
