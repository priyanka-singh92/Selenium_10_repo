package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17Feb {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus"))
		{
			System.out.println("Home page is displayed");
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		System.out.println(alllink.size());

		driver.quit();
}
}
