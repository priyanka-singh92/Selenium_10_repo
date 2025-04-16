package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TestScriptAssignment26March {
	
public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis= new FileInputStream("./TestData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		//System.out.println(URL);
		driver.get(URL);
		
		
		FileInputStream fis2= new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		
		WelcomePageAssignment26March wp = new WelcomePageAssignment26March(driver);
		wp.getCreateAccountLink().click();
		
		
		AccountPageAssignment26March ap =new AccountPageAssignment26March(driver);
		
		
		ap.getFirstNameTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(0).getStringCellValue());
        ap.getLastNameTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue());
        ap.getEmailTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue());
        ap.getPasswordTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(3).getStringCellValue());
        ap.getConfirmpasswordTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(4).getStringCellValue());
        ap.getCreateAccountButton().click();
        
        System.out.println("Account is created");
        
        
       String timestamp = LocalDateTime.now().toString().replace(":", "_");     
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshots/"+timestamp+".png");
		 
		 FileHandler.copy(temp, dest);

        

}
}
