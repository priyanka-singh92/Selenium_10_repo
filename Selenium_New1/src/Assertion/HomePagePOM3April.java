package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM3April {

	@FindBy(linkText = "BOOKS")
	private WebElement bookLink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement computerLink;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "APPAREL & SHOES")
	private WebElement apparelLink;
	
	@FindBy(linkText = "GIFT CARDS")
	private WebElement giftsLink;
	
	
	
	
	public HomePagePOM3April(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }




	public WebElement getBookLink() {
		return bookLink;
	}




	public WebElement getComputerLink() {
		return computerLink;
	}




	public WebElement getElectronicsLink() {
		return electronicsLink;
	}




	public WebElement getApparelLink() {
		return apparelLink;
	}




	public WebElement getGiftsLink() {
		return giftsLink;
	}
	
	
	
	
	

}
