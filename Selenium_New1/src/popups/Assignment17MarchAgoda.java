package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17MarchAgoda {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.agoda.com/en-gb/?cid=1753807&ds=lQ24etBt9DFxgWj7/");
		
		driver.findElement(By.xpath("//div[@data-selenium='checkInText']")).click();
		
		for ( ; ;)
			
				{
				try
			{
			
			driver.findElement(By.xpath("//div[text()='October 2025']/..//span[text()='2']")).click();
			driver.findElement(By.xpath("//div[text()='October 2025']/..//span[text()='10']")).click();
			
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
}
}
}
