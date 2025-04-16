package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment25Feb {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		boolean status = driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkBox.isEnabled());          //before entering data
		
		//driver.findElement(By.name("username")).sendKeys("piku1234");
		//driver.findElement(By.name("password")).sendKeys("typ@12345");
		//System.out.println(checkBox.isEnabled());          //after entering data
		
		

}
}
