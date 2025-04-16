package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

		
		//declaration
		@FindBy(name="q")
		private WebElement searchTF;
		
		//initialization
		public FlipkartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
		}

		public WebElement getSearchTF() {
			return searchTF;
		}
		

}

