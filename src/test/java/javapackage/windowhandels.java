package javapackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandels 
{
	public static void main(String[] args) throws InterruptedException
	{ 
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		//Launch the application
		driver.get("http://www.w3schools.com/");//first window index=0
		//identify the element
		driver.findElement(By.linkText("http://www.w3schools.com/")).click();//second window index=1
		
		Set<String> wids=driver.getWindowHandles();
		
		System.out.println(wids);
		
		List<String> windows =new ArrayList<String>(wids);
		
		System.out.println(windows);
		// close the 2nd window
		driver.switchTo().window(windows.get(1));
		//index=1 means 2nd window
		driver.close();
		//close the first window
		driver.switchTo().window(windows.get(0));
		Thread.sleep(5000);
		driver.close();
	
	
	}
	
}
