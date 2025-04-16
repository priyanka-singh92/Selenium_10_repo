package POM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Facebook")).click();

		 Set<String> allWindowIds = driver.getWindowHandles();
		 
		 System.out.println(allWindowIds);
		 Thread.sleep(2000);
		 
		 
		 //WebElement hiddenEle = driver.findElement(By.xpath("//input[@name='firstname'"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].value='Priyanka'", hiddenEle);
			
			WebElement createAccount = driver.findElement(By.xpath("//span[text()='Create new account'])"));
			js.executeScript("arguments[0].click()", createAccount);
		 
			WebElement hiddenEle = driver.findElement(By.xpath("//input[@name='firstname'"));
			js.executeScript("arguments[0].value='Priyanka'", hiddenEle);
			
		 //driver.findElement( By.xpath("//span[text()='Create new account']")).click();
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanka");
		
}
}