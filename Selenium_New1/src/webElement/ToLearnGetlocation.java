package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetlocation {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		   //Point location = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		   
		   //System.out.println(location);
		   
		   //System.out.println(location.getX());
		   //System.out.println(location.getY());
		
		  Point location2 = driver.findElement(By.xpath("//input[@value='Subscribe']")).getLocation();
		System.out.println(location2.getX());
	    System.out.println(location2.getY());

		

}
}
