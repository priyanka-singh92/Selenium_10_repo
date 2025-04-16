package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {
public static void main(String[] args) throws IOException {
	
	//Step 1: Create FileInputStream object
	FileInputStream fis= new FileInputStream("./TestData/CommonData.properties");
	
	//Step 2: Create respective file type object
	Properties prop = new Properties();
	
	//Step 3: Call read methods
	prop.load(fis);
	String URL = prop.getProperty("url");
	System.out.println(URL);
	
	//System.out.println(prop.getProperty("url"));
	
	//System.out.println(prop.getProperty("username"));
	
	//System.out.println(prop.getProperty("password"));
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(URL);
	
	String UN = prop.getProperty("username");
	System.out.println(UN);
	
	String Pwd = prop.getProperty("password");
	System.out.println(Pwd);
	
   driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("Email")).sendKeys(UN);
	driver.findElement(By.id("Password")).sendKeys(Pwd);
	
	
}
}
