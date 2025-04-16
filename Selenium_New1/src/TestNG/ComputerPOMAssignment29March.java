package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPOMAssignment29March {
	
	//Declaration
			@FindBy(xpath="//a[text()='Log in']")
			private WebElement loginLink;
			
			@FindBy(id="Email")
			private WebElement emailTF;
			
			
			@FindBy(id="Password")
			private WebElement passwordTF;
			

			
			@FindBy(xpath="//input[@value='Log in']")
			private WebElement loginButton;
			
			
			
			@FindBy(xpath="//a[contains(text(),'Computers')]")
			private WebElement computerLink;
			
			
			
			//Initialization
			public ComputerPOMAssignment29March(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}



			public WebElement getLoginLink() {
				return loginLink;
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



			public WebElement getComputerLink() {
				return computerLink;
			}

			


}
