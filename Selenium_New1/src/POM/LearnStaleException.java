package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnStaleException {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		FlipkartPage fp = new FlipkartPage(driver);
		fp.getSearchTF().sendKeys("mobiles",Keys.ENTER);
		
		Thread.sleep(2000);
		
		//fp.getSearchTF().clear();
		
		Actions act = new Actions(driver);
		
		act.keyDown(fp.getSearchTF(),Keys.COMMAND).keyDown("a").keyDown(Keys.BACK_SPACE).perform();
		act.keyUp(Keys.COMMAND).keyUp("a").keyUp(Keys.BACK_SPACE).perform();
		
		fp.getSearchTF().sendKeys("shoes");
		
		
		
		
		
		//WebElement searchTF = driver.findElement(By.name("q"));
		//searchTF.sendKeys("mobiles",Keys.ENTER);
		
		//searchTF.sendKeys("Shoes");
		
	}

}
