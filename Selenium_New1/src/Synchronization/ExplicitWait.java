package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("560076");
		WebElement checkBtn = driver.findElement(By.id("Check"));
		
    // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));   // for TimeoutException
    
   
    wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
    
    checkBtn.click();
		
		
		

}

	

	
}
