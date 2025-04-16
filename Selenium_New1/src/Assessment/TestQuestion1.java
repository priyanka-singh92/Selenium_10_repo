package Assessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestQuestion1 {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.abhibus.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		
		WebElement checkBox = driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@type='checkbox']"));
		//System.out.println(checkBox.isSelected()); // ---->before clicking
		checkBox.click();
		System.out.println(checkBox.isSelected()); //------>after clicking
		
		
		
       
		//WebElement prices = driver.findElement(By.xpath("//strong[@class='h5 fare']"));
		
		  //List<WebElement> tagname = driver.findElements(By.tagName("strong"));;
		//System.out.println(tagname.getText());
       List<WebElement> allPrices = driver.findElements(By.tagName("strong"));
       for(WebElement ele:allPrices)
    	   System.out.println(ele.getText());
    	  
	}

}
