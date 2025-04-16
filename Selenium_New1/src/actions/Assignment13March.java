package actions;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment13March {
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		Actions act=new Actions(driver);
		
		WebElement homeFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		act.moveToElement(homeFurniture).perform();
		
		WebElement kitchenDining = driver.findElement(By.xpath("//a[text()='Kitchen & Dining']"));
		act.moveToElement(kitchenDining).perform();
		
		driver.findElement(By.xpath("//a[text()='Cookware']")).click();
		
		WebElement popular = driver.findElement(By.xpath("//h2[text()='Popular Types of Cookware']"));
		
		act.scrollToElement(popular).perform();
		
		String timestamp = LocalDateTime.now().toString().replace(":", "_"); 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshots/"+timestamp+".png");
		 
		 FileHandler.copy(temp, dest);
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	       for(WebElement ele:allLinks)
	    	   System.out.println(ele.getText());
	       System.out.println(allLinks.size());
		
		

}
}
