package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNG.BaseClass;


	public class TestScript1 extends BaseClass
	{
		@Test
		public void clickOnBooks()
		{
			
			HomePagePOM3April hp = new HomePagePOM3April(driver);
			hp.getBookLink().click();
			//driver.findElement(By.partialLinkText("BOOKS")).click();
			
			Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page is not displayed");
			Reporter.log("Books page is displayed",true);
			
		}

}
