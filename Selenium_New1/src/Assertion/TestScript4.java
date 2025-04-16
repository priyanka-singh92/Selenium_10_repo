package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNG.BaseClass;

public class TestScript4 extends BaseClass
{
	@Test
	public void clickOnApparels()
	{
		HomePagePOM3April hp = new HomePagePOM3April(driver);
		hp.getApparelLink().click();
		
		
		//driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "Apparel & Shoes page is not displayed");
		Reporter.log("Apparel & Shoes page is displayed",true);
		
	}

}
