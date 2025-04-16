package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptAssignment29March {
	
public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis= new FileInputStream("./TestData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		driver.get(URL);
		
		

		FileInputStream fis2= new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		
		
		BookPOMAssignment29March bp = new BookPOMAssignment29March(driver);
		bp.getLoginLink().click();
		bp.getEmailTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue());
		bp.getPasswordTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue());
		bp.getLoginButton().click();
		bp.getBookLink().click();
		
		
		
		ComputerPOMAssignment29March comp = new ComputerPOMAssignment29March(driver);
		comp.getLoginLink().click();
		comp.getEmailTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue());
		comp.getPasswordTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue());
		comp.getLoginButton().click();
		comp.getComputerLink().click();
		
		
		
		BookSortPOMAssignment29March bsp = new BookSortPOMAssignment29March(driver);
		bsp.getLoginLink().click();
		bsp.getEmailTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue());
		bsp.getPasswordTF().sendKeys(wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue());
		bsp.getLoginButton().click();
		bsp.getBookLink().click();
		bsp.getPositionDropdown().click();
		
		
		WebElement bookDropdown = driver.findElement(By.xpath("//select[id='products-orderby']"));
		Select bookSelect=new Select(bookDropdown);
		bookDropdown.click();
		
		
		bookSelect.selectByVisibleText("Name: Z to A");
		
		System.out.println(bookDropdown.isSelected()); 
		System.out.println(bookSelect.isMultiple());
		
		//WebElement dropdown = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		//System.out.println(dropdown.isSelected());        //before clicking
		
		//dropdown.click();
		//System.out.println(dropdown.isSelected());        //after clicking
		
		
		
		

}
}
