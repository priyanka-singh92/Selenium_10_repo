package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Assignment12Feb {
	
	public static void main(String[] args)throws InterruptedException
	{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!"))
	{
		System.out.println("Welcome page is displayed");
	}
	else
	{
		System.out.println("Welcome page is not displayed");
	}
	
	

driver.manage().window().setPosition(new Point(600,300));

Dimension size =driver.manage().window().getSize();
System.out.println(size.getHeight());
System.out.println(size.getWidth());

driver.manage().window().setSize(new Dimension(400, 400));
Thread.sleep(2000);

driver.quit();

}
}
	


