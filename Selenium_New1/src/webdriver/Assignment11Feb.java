package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment11Feb {
	
	
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Welcome page is displayed");
		}
		else
		{
			System.out.println("Welcome page is not displayed");
		}
		driver.close();
	}

}


