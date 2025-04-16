package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/23/");
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();   // to capture window ids
		
	for(String id:allWindowIds)
	{
		driver.switchTo().window(id);
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	    //driver.close();
	    
		String title = driver.getTitle();
		System.out.println(title);
		
	    if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	    {
	    	driver.close();
	    }
		//System.out.println(id);   //to print all ids one by one
	}
		

}
}

