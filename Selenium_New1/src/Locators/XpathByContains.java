package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Contact uploading')]")).click();
		
		
		

}
}
