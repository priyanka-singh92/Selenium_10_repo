package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment01March {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		js.executeScript("arguments[0].click()", register);
		
		WebElement genderRadio = driver.findElement(By.id("gender-female"));
		js.executeScript("arguments[0].click()", genderRadio);
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		js.executeScript("arguments[0].value='Priyanka'", firstName);
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		js.executeScript("arguments[0].value='Singh'", lastName);
		
		WebElement emailTF = driver.findElement(By.id("Email"));
		js.executeScript("arguments[0].value='piku.singh12345@gmail.com'", emailTF);
		
		WebElement passwordTF = driver.findElement(By.id("Password"));
		js.executeScript("arguments[0].value='Piku2025'", passwordTF);
		
		WebElement cnfrmpasswordTF = driver.findElement(By.id("ConfirmPassword"));
		js.executeScript("arguments[0].value='Piku2025'", cnfrmpasswordTF);
		
		WebElement registerBtn = driver.findElement(By.id("register-button"));
		js.executeScript("arguments[0].click()", registerBtn);
		
		String timestamp = LocalDateTime.now().toString().replace(":", "_"); 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshots/"+timestamp+".png");
		 
		 FileHandler.copy(temp, dest);
		
		js.executeScript("history.go()");
		
		
		
		
		
		
		
		
		
		

}
}
