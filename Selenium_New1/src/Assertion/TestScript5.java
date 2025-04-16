package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNG.BaseClass;

public class TestScript5 extends BaseClass
{
	@Test
	public void clickOnGiftCards()
	{
		HomePagePOM3April hp = new HomePagePOM3April(driver);
		hp.getGiftsLink().click();
		
		
		//driver.findElement(By.partialLinkText("GIFT")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "Gift Cards page is not displayed");
		Reporter.log("Gift Cards page is displayed",true);
		
	}

}
