package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FBcreatePage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void testlogin()
{
	FBcreatePage ob=new FBcreatePage(driver);
	ob.setValues("joe.2@gmail.com","abc");
	ob.login();
}
}
