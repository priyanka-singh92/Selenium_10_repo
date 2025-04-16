package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment18March {
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Register in Just 2 Minutes | Freshers Registration | Start Applying Jobs | Free"))
		{
			System.out.println("Register page is displayed");
		}
		else
		{
			System.out.println("Register page is not displayed");
		}
		
       driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/Piku/Desktop/API Postman Interview Questions.pdf");
       
       WebElement cityDropdown = driver.findElement(By.id("currentCity"));
       
       
       //Select citySelect = new Select(cityDropdown);
       //citySelect.selectByVisibleText("Yadadri Bhuvanagiri");
       
       ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
       
       driver.findElement(By.xpath("//span[text()='Select City'")).click();
       driver.findElement(By.xpath("//li[text()=' Yadadri Bhuvanagiri ']")).click();
       
}
}
