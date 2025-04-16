package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	
	//Login declaration
	
	//@FindBy(linkText = "Log in")
	  @FindBy(xpath = "//a[text()='Login in']")
	  private WebElement loginLink;
	  
	  
	//Initialization (press control + space)
	  
	  
	  public WelcomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  //getters
	  public WebElement getREgisterLink()
	  {
		  return registerLink;
	  }
	  
      
	  //getters for Login
	  public WebElement getLoginLink()
	  {
		  return loginLink;
	  }
}
