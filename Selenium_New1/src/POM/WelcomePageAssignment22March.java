package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageAssignment22March {
	
	//Declaration
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		
		
	//Initialization (press control + space)
		  
		  
	 public WelcomePageAssignment22March(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	 }
		  
	//getters
	  public WebElement getRegisterLink()
	  {
		  return registerLink;
	  }  
		  

}
