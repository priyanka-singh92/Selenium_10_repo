package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleIframe {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		//driver.switchTo().frame(0);  //----->by using frame(int index) ----> used when we have single iframe
		
		driver.switchTo().frame("send-sms-iframe"); //-----> by using frame(String name/id) -----> it is used when we have multiple iframe
		
		driver.findElement(By.id("regEmail")).sendKeys("5678934");

}
}
