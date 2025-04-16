package Select_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelectListBox {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///Users/Piku/Desktop/Multi_Select_Dropdown.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select carSelect = new Select(cars);
		
		carSelect.selectByIndex(0);
		carSelect.selectByValue("ferrari");
		carSelect.selectByVisibleText("Creta");
		
		Thread.sleep(2000);
		
		carSelect.deselectAll();
		carSelect.deselectByIndex(0);
		carSelect.deselectByValue("ferrari");
		carSelect.deselectByVisibleText("Volvo");
		
		System.out.println(carSelect.isMultiple());

}
}
