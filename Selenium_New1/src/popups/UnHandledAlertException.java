package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnHandledAlertException {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		
		Alert popup = driver.switchTo().alert();
		

}
}