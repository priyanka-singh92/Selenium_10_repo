package popups;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleModals {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[text()='March 2025']/../..//p[text()='26']")).click();
		
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		for ( ; ;)
		
		//while(true)
			{
			try
		{
		driver.findElement(By.xpath("//div[text()='August 2025']/../..//p[text()='15']")).click();
		break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
}
}
}
