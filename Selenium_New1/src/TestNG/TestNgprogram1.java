package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgprogram1 { //TestNg class
	
	@Test
	
	public void register()    //test case
	{
		Reporter.log("register test case executed",true); //test steps
	}
	
	@Test
	
	public void login()       //test case
	{
		Reporter.log("login test case executed",true);    //test steps
	}
	
	@Test
	
	public void addToCart()
	{
		Reporter.log("addtoCart test case executed",true);
	}

}
