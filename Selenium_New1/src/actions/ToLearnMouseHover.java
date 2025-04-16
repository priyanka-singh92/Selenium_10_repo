package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		
		WebElement homeFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		act.moveToElement(homeFurniture).perform();
		
		WebElement kitchenDining = driver.findElement(By.xpath("//a[text()='Kitchen & Dining']"));
		act.moveToElement(kitchenDining).perform();
		
		driver.findElement(By.xpath("//a[text()='Cookware']")).click();
		
	}

}
