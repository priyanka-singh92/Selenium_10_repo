package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15Feb {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Demo Web Shop. Login"))
		{
			System.out.println("Login page is displayed");
		}
		else
		{
			System.out.println("Login page is not displayed");
		}
		driver.findElement(By.id("Email")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.id("login-button")).click();	
		driver.quit();

		
		
}
}