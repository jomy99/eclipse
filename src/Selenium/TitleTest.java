package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TitleTest {
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
	String exp="Google";
	String act=driver.getTitle();
	Assert.assertEquals(exp,act);
	System.out.println("Hello");
	//SoftAssert
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(exp, act);
	System.out.println("Pass");
}
@After
public void teardown()
{
	driver.close();
}
}
