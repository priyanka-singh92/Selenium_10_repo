package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18Feb {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		

		

}
}
