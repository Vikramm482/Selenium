package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Try it Yourself")).click();
		Set<String>  handles=driver.getWindowHandles();
		System.out.println(handles);
		
		List<String> windows=new ArrayList<String>(handles);
		System.out.println(windows);
		
		String w=windows.get(1);
		System.out.println(w);
	
	}

}
