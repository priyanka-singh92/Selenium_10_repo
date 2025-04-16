package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrollIntoView {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement latestcourse = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",latestcourse); //if used true --->result will be shown on top of the page
		
		js.executeScript("arguments[0].scrollIntoView(false)",latestcourse);  //if used false ---->result will be shown on bottom of the page
}
}
