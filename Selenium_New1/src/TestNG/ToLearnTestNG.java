package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {  //TestNg class
	
	@Test
	public void demo()  //testcase      //creating this non static method for @Test
	{//test steps
		Reporter.log("Welcome to Testng",true); //Reporter->class,log->static method of reporter
	}

}
