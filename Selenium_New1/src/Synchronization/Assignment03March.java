package Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment03March {
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//span[@class='MuiTouchRipple-root css-w0pj6f']")).click();

		List<WebElement> allimages = driver.findElements(By.tagName("img"));  //to find multiple elements
		System.out.println(allimages.size());
		
		String timestamp = LocalDateTime.now().toString().replace(":", "_"); 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshots/"+timestamp+".png");
		 
		 FileHandler.copy(temp, dest);


}
}
