package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnonationsSuite {
	
	@BeforeSuite                             //1. @BeforeSuit
	public void beforeSuit()
	{
      Reporter.log("@BeforeSuite",true);
	}
	
	
	@BeforeTest                              //3. @BeforeTest
	public void beforeTest()
	{
      Reporter.log("@BeforeTest",true);
	}
	
	
	@BeforeClass                            //5. @BeforeClass
	public void beforeClass()
	{
      Reporter.log("@BeforeClass",true);
	}
	
	
	@BeforeMethod                            //7. @BeforeMethod
	public void beforeMethod()
	{
      Reporter.log("@BeforeMethod",true);
	}
	
	
	@Test
	public void demo()
	{
      Reporter.log("@Test(demo) executed",true);
	}
	
	
	@Test
	public void launch()
	{
      Reporter.log("@Test(launch) executed",true);
	}
	
	
	
	@AfterMethod                               //8. @AfterMethod
	public void afterMethod()
	{
      Reporter.log("@AfterMethod",true);
	}
	
	
	@AfterClass                               //6. @AfterClass
	public void afterClass()
	{
      Reporter.log("@AfterClass",true);
	}
	
	
	
	@AfterTest                               //4. @AfterTest
	public void afterTest()
	{
      Reporter.log("@AfterTest",true);
	}
	
	@AfterSuite                               //2. @AfterSuite
	public void afterSuit()
	{
      Reporter.log("@AfterSuite",true);
	}
}
