package Assertion;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.WelcomePageAssignment22March;

public class BaseClass3April {
	
	public static WebDriver driver; 
	
	
@BeforeClass
	
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();          //initialization inside
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://demowebshop.tricentis.com/");
		
		FileInputStream fis= new FileInputStream("./TestData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		//System.out.println(URL);
		driver.get(URL);
		
	}
	
	
	@BeforeMethod
	
	public void login() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis2= new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		
		String emailTF = wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
		System.out.println(emailTF);
		
		String passwordTF = wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
		System.out.println(passwordTF);
		
		
		WelcomePagePOM3April wp = new WelcomePagePOM3April(driver);
		wp.getLoginLink().click();
		
		
		LoginPagePOM3April lp =new LoginPagePOM3April(driver);
		lp.getEmailTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue());
		lp.getPasswordTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue());
		lp.getLoginButton().click();
      
		
		HomePagePOM3April hp = new HomePagePOM3April(driver);
		hp.getBookLink().click();
		hp.getComputerLink().click();
		hp.getElectronicsLink().click();
		hp.getApparelLink().click();
		hp.getGiftsLink().click();
		
	}
	
	
	
	@AfterMethod
	
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	
	@AfterClass
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
