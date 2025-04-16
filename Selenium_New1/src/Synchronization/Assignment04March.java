package Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment04March {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 String timestamp = LocalDateTime.now().toString().replace(":", "_"); 
		
		WebElement successMsg = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));   
		   
	    wait.until(ExpectedConditions.elementToBeClickable(successMsg));
	    
	    successMsg.click();
	    
	
	    

		   File temp = driver.findElement(By.xpath("//p[@class='content']")).getScreenshotAs(OutputType.FILE);
		   
		   File dest = new File("./screenshots/"+timestamp+".png");
		   
		   FileHandler.copy(temp, dest);

}
}
