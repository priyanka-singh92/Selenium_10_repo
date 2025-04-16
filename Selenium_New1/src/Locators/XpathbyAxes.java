package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAxes {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///Users/Piku/Desktop/Movie%20Table.html");
		
		String movie="Chaava";
		
		
	String collection = driver.findElement(By.xpath("//td[text()='"+movie+"']/following-sibling::td[1]")).getText();
	System.out.println(collection);
	
	String collection3 = driver.findElement(By.xpath("//td[text()='"+movie+"']/following-sibling::td[2]")).getText();
	System.out.println(collection3);
	
	String collection4 = driver.findElement(By.xpath("//td[text()='"+movie+"']/preceding-sibling::td[1]")).getText();
	System.out.println(collection4);
	
	
	
	
	
	//String collection2 = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
	//System.out.println(collection2);
	
}
}
