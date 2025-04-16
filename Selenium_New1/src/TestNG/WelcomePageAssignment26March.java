package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageAssignment26March {
	
	@FindBy(linkText = "Create an Account")
	private WebElement createAccountLink;
	
	
	public WelcomePageAssignment26March(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateAccountLink() {
		return createAccountLink;
	}
	
	
	

}
