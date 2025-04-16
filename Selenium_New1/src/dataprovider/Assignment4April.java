package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment4April {
	
	@DataProvider
	public String[][] datasender()
	{
		String[][]data = {{"Rahul","Kumar","Rahul123@gmail.com","Rahul@1234","Rahul@1234"},{"Sneha","Sachdeva","SnehaS1234@gmail.com","Sachdeva@1234","Sachdeva@1234"},{"Baby","Sinha","BabySinha123@gmail.com","SinhaJi@1234","SinhaJi@1234"},{"Nisha","Singh","NishaSingh65@gmail.com","SinghJi@65","SinghJi@65"}};
		return data;
	}
	
      @Test(dataProviderClass = DataStorage.class, dataProvider ="datasender")
     public void login(String[] cred)
    {
	
	WebDriver driver=new ChromeDriver();          
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
	driver.findElement(By.id("LastName")).sendKeys(cred[1]);
	driver.findElement(By.id("Email")).sendKeys(cred[2]);
	driver.findElement(By.id("Password")).sendKeys(cred[3]);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
	driver.findElement(By.id("register-button")).click();
	

}
}
