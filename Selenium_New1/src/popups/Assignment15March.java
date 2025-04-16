package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15March {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		
		if(title.equals("Demo Web Shop"))
		{
			System.out.println("Home page is displayed");
		
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		
		Thread.sleep(2000);
		
		popup.accept();

}
}
