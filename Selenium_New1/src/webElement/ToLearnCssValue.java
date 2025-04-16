package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssValue {
		public static void main(String[] args) {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/login");
				
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				
				//String color = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
				//System.out.println(color);
				
				//String fontsize = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-size");
				//System.out.println(fontsize);
				
				//String fontweight = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-weight");
				//System.out.println(fontweight);
				
				WebElement errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
				System.out.println(errorMsg);
				
				String color =errorMsg.getCssValue("color");
				System.out.println(color);
				
				
				
				
				

}
}
	
