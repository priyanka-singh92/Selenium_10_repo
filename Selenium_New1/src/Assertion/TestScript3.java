package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNG.BaseClass;

public class TestScript3 extends BaseClass
{
	@Test
	public void clickOnElectronics()
	{
		HomePagePOM3April hp = new HomePagePOM3April(driver);
		hp.getElectronicsLink().click();
		
		//driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page is not displayed");
		Reporter.log("Electronics page is displayed",true);
		
	}

}
