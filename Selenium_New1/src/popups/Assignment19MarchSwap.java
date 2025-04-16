package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment19MarchSwap {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/23/");
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
		    
		    
			
			String title = driver.getTitle();
			System.out.println(title);
			
		    if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!"))
		    {
		    	driver.switchT0.window(id);
		    }
	        
		    
		    Dimension size =driver.manage().window().getSize();
			System.out.println(size.getHeight());
			System.out.println(size.getWidth());
			
			driver.manage().window().setSize(new Dimension(800, 700));
			
}
	}
}
