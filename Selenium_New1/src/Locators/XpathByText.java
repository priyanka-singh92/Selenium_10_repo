package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		
		
		

}
}
