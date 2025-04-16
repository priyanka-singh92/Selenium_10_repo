package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment7March {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		 WebElement mapiframe = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));

				 driver.switchTo().frame(mapiframe);
				 
				 driver.switchTo().defaultContent();
				 
				 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
				 
				 driver.findElement(By.xpath("//input[@id='user']")).sendKeys("priyanka123@gmail.com");
				 
				 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");
				 
				 driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("abc@123");
				 
				 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Priyanka");
				 
				 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singh");
				 
				 driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 String timestamp = LocalDateTime.now().toString().replace(":", "_"); 
				 
				 TakesScreenshot ts = (TakesScreenshot) driver;
					
				 File temp = ts.getScreenshotAs(OutputType.FILE);
				 
				 File dest = new File("./screenshots/"+timestamp+".png");
				 
				 FileHandler.copy(temp, dest);

}
}
