package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNG.BaseClass;

public class TestScript2 extends BaseClass
{
	@Test
	public void clickOnComputers()
	{
		//driver.findElement(By.partialLinkText("COMPUTERS")).click();
		
		HomePagePOM3April hp = new HomePagePOM3April(driver);
		hp.getComputerLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computers page is not displayed");
		Reporter.log("Computers page is displayed",true);
	}

}
