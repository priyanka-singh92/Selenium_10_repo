package Select_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select monthSelect = new Select(monthDropdown);
		
		monthSelect.selectByVisibleText("Jan");
		
		System.out.println(monthSelect.isMultiple());
		

}
}
