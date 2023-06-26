package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreatePage;

public class CreateTest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void createtest()
{
	CreatePage ob=new CreatePage(driver);
	
	ob.create();
	ob.getstarted();
}
}
