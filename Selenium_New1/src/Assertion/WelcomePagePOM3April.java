package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePagePOM3April {
	
	      //Declaration
			@FindBy(linkText = "Log in")
			private WebElement loginLink;
			
			
			//Initialization
			public WelcomePagePOM3April(WebDriver driver)
			  {
				  PageFactory.initElements(driver, this);
			  }

           //getters
			public WebElement getLoginLink() {
				return loginLink;
			}


			
			

}
