package takesscreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment27Feb {
	
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.id("gender-female]")).click();
	

	driver.findElement(By.id("FirstName")).sendKeys("Priyanka");
	driver.findElement(By.id("LastName")).sendKeys("Singh");
	driver.findElement(By.id("Email")).sendKeys("piku.singh25@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("piku123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("piku123");
	
	
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	
	
	
}
}
