package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22March {
public static void main(String[] args) throws IOException  {
		
		FileInputStream fis= new FileInputStream("./TestData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		
        driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		FileInputStream fis2= new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		String firstName = wb.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
		System.out.println(firstName);
		
		String lastName = wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastName);
		
		String email = wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
		System.out.println(email);
		
		String password = wb.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
		System.out.println(password);
		
		String confirmPassword = wb.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
		System.out.println(confirmPassword);
		
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
        driver.findElement(By.id("register-button")).click();

}
}
