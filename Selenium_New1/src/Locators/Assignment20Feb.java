package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20Feb {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.redbus.in/");
		
		//driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
		//driver.findElement(By.xpath("//p[text()='SBC (Bangalore) to MAS (Chennai)']/..//button[text()='Search Train']")).click();//p[text()='SBC (Bangalore) to MAS (Chennai)'/../..//button[text()='Search Train']
		//driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 13')]/../..//span[contains(text(),'9% off')]")).click();
}
}
