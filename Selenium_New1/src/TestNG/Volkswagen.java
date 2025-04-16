package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Volkswagen {
	
	 @Test       
		
		public void launch()
		{
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.volkswagen.co.in/en.html");
			Reporter.log("Volkswagen launched successfully",true);
		}


}
