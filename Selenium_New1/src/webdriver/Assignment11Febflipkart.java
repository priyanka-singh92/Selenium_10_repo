package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11Febflipkart {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		driver.get("https://www.flipkart.com/noise-colorfit-icon-2-1-8-display-bluetooth-calling-ai-voice-assistant-smartwatch/p/itmd4cd819eadb9f?pid=SMWGEH7VGYMGCP3V&lid=LSTSMWGEH7VGYMGCP3VXIJHDY&marketplace=FLIPKART&store=ajy%2Fbuh&srno=b_1_1&otracker=browse&fm=organic&iid=en_RbLcRhBfWL3EvlJV6tyCCk1vRWCUmgb0MuHCu1_DBzDKfJwY8pKVdfvpUKsjIYm4z1oXimnIWor7nYWM7SDuEA%3D%3D&ppt=browse&ppn=browse&ssid=zrdlx9zx7k0000001739334793603");
		Thread.sleep(20000);
	
	driver.findElement(By.id("compare")).click();
	
	driver.quit();
		
}
}
