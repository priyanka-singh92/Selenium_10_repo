package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment20March {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		FileInputStream fis= new FileInputStream("./TestData/CommonData.properties");
		Properties prop = new Properties();	
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		
		String timestamp = LocalDateTime.now().toString().replace(":", "_"); 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshots/"+timestamp+".png");
		 
		 FileHandler.copy(temp, dest);

}
}