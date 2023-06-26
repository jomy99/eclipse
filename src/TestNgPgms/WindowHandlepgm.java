package TestNgPgms;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlepgm {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
}
@Test
public void testing()
{
	//getWindowHandle()-to get unique ID of current window
	String parentwindow=driver.getWindowHandle();//return string
	System.out.println("Parent titile:"+ driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	//getWindowHandles()-stores set of handles for all pages opened
	Set<String> allWindowHandles=driver.getWindowHandles();
	for(String handle:allWindowHandles)
	{
		System.out.println(handle);
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("jomy.thomas");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		}
	}
}
@AfterTest
public void end()
{
	//driver.close();
}
}
