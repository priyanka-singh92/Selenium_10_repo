package Select_Dropdown;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//WebElement monthDropdown = driver.findElement(By.id("month"));
		
		//Select monthSelect = new Select(monthDropdown);
		
	 //List<WebElement> allOptions = monthSelect.getOptions();
	 
	 //System.out.println(allOptions.size());
		
		//for(WebElement ele2:allOptions)
		//{
		//	System.out.println(ele2.getText());
		//}
	 
	 WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select yearSelect = new Select(yearDropdown);
		
	 List<WebElement> allOptions = yearSelect.getOptions();
	 
	 System.out.println(allOptions.size()); 
	 
	 for(WebElement ele:allOptions)
	 {
		 System.out.println(ele.getText());
	 }
	 
	 
	 
	 

}
}