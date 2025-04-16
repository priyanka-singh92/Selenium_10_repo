package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageAssignment26March {
	
	
	@FindBy(id="firstname")
	private WebElement firstNameTF;
	
	@FindBy(id="lastname")
	private WebElement lastNameTF; 
	
	@FindBy(id="email_address")
	private WebElement emailTF; 
	
	@FindBy(id="password")
	private WebElement passwordTF; 
	
	@FindBy(id="password-confirmation")
	private WebElement confirmpasswordTF;
	
	@FindBy(xpath="//span[text()='Create an Account'")
	private WebElement createAccountButton;
	
	
	public AccountPageAssignment26March(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstNameTF() {
		return firstNameTF;
	}


	public WebElement getLastNameTF() {
		return lastNameTF;
	}


	public WebElement getEmailTF() {
		return emailTF;
	}


	public WebElement getPasswordTF() {
		return passwordTF;
	}


	public WebElement getConfirmpasswordTF() {
		return confirmpasswordTF;
	}


	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	

}
