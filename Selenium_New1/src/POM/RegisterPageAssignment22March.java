package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageAssignment22March {

	//Declaration
		@FindBy(id="gender-male")
		private WebElement genderMaleRadio;
			
			
		@FindBy(id="gender-female")
		private WebElement genderFemaleRadio;
		
		
		@FindBy(id="FirstName")
		private WebElement firstNameTF;
		
		@FindBy(id="LastName")
		private WebElement lastNameTF; 
		
		@FindBy(id="Email")
		private WebElement emailTF; 
		
		@FindBy(id="Password")
		private WebElement passwordTF; 
		
		@FindBy(id="ConfirmPassword")
		private WebElement confirmpasswordTF;
		
		@FindBy(id="register-button")
		private WebElement registerButton;
		
		
		//Initialization
				public RegisterPageAssignment22March(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}


				public WebElement getGenderMaleRadio() {
					return genderMaleRadio;
				}


				public WebElement getGenderFemaleRadio() {
					return genderFemaleRadio;
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


				public WebElement getRegisterButton() {
					return registerButton;
				}
				
				
}
