package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSourceFb {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
//driver.get("https://www.facebook.com/");
		
		//String sourceCode = driver.getPageSource();
		//System.out.println(sourceCode);
		
driver.get("https://demowebshop.tricentis.com/");
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	}
	}





