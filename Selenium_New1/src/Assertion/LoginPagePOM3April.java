package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM3April {
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement passwordTF;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
	
	
	
	
	public LoginPagePOM3April(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }




	public WebElement getEmailTF() {
		return emailTF;
	}




	public WebElement getPasswordTF() {
		return passwordTF;
	}




	public WebElement getLoginButton() {
		return loginButton;
	}


	
	
	
	
}
