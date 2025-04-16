package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	//Declaration
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		
		
		//Initialization
		public RegisterPage(WebDriver driver)
		  {
			  PageFactory.initElements(driver, this);
		  }


		
		//getters
		public WebElement getRegisterLink() {
			return registerLink;
		}
		  
		
		
}
