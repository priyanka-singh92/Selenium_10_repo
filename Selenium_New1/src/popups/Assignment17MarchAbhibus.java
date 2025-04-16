package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17MarchAbhibus {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Thread.sleep(3000);

}
}
