package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Audi {
	
	 @Test       
		
		public void launch()
		{
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.audi.com/en/");
			Reporter.log("Audi launched successfully",true);
		}


}
