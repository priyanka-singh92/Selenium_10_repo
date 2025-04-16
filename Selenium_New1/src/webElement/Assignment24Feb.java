package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment24Feb {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("piku");
		
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.clear();
		passwordTF.sendKeys("piku123");
		
		Rectangle rect2 = driver.findElement(By.xpath("//input[@value='Subscribe']")).getRect();
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		System.out.println(rect2.getX());
		System.out.println(rect2.getY());
		
		

}
}
