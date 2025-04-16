package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("piku");
		
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.clear();
		passwordTF.sendKeys("piku123");
		


}
}
