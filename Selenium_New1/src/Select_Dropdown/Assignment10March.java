package Select_Dropdown;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment10March {
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select monthSelect = new Select(months);
		

		List<WebElement> allSelectedOptions =monthSelect.getAllSelectedOptions();      //to capture all selected options
		System.out.println(allSelectedOptions.size());
		
		for(WebElement ele:allSelectedOptions)
		{
			System.out.println(ele.getText());
			
		

}
}
}
