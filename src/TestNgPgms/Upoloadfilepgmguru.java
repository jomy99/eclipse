package TestNgPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Upoloadfilepgmguru {
	ChromeDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/upload/");
}
@Test
public void testing()
{
	WebElement s=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	s.sendKeys("C:\\Users\\91890\\Pictures\\Saved Pictures");
	WebElement m=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
	if(m.isSelected())
	{
		System.out.println("Check box is selected");
	}
	else
	{
		System.out.println("Check box is Not selected");
	}
	WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
	submit.click();
}
@AfterTest
public void closing()
{
	//driver.close();
}
}
