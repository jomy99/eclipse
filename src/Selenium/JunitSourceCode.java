package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSourceCode {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver(); 
	driver.get("https://www.google.com");
}
@Test
public void testing()
{
	String s=driver.getPageSource();
	if(s.contains("Gmail"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@After
public void teardown()
{
	driver.close();
}
}
