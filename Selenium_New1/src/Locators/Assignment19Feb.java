package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment19Feb {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Contact uploading')]")).click();
		
		List<WebElement> headings = driver.findElements(By.tagName("head"));
		System.out.println(headings.size());

		
		

}

}
