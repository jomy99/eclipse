package TestNgPgms;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	ChromeDriver driver;
@BeforeSuite
public void bsuite()
{
	System.out.println("Before suite");
}
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	System.out.println("Browser opens");
}
@BeforeClass
public void bclass()
{
	System.out.println("before class");
}
@BeforeMethod
public void urloads()
{
	driver.get("https://google.com");
	System.out.println("URL loads....");
}
@Test
public void first()
{
	System.out.println("Test1 executes");
}
@Test(priority=1)
public void second()
{
	System.out.println("Test2 executes");
}
@AfterMethod
public void aftertest1()
{
System.out.println("After Method");	
}
@AfterClass
public void aclass()
{
	System.out.println("After class");
}
@AfterTest
public void aftertest2()
{
	System.out.println("Browser Closes");
}
@AfterSuite
public void asuite()
{
	driver.quit();
}
}
//No priority set then executes in alaphabetical order
//if priority is not set to a single test then that will get executed 1st
