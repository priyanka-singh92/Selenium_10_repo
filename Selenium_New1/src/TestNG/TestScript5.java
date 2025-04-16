package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript5 extends BaseClass
{
	@Test
	public void clickOnGiftCards()
	{
		driver.findElement(By.partialLinkText("GIFT")).click();
		
		if(driver.getTitle().equals("Demo Web Shop. Gift Cards"))
		{
			Reporter.log("Gift Cards page is displayed",true);
			
		}
		else
		{
			Reporter.log("Gift Cards page is not displayed",true);
		}
	}
}
