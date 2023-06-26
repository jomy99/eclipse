package Selenium;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	
		public void beforeclass()
		{
			System.out.println("Before class");
		}
	
@Before
public void setup()
{
	System.out.println("Browser Opens");
}
@Test
public void testing()
{
	System.out.println("Testing Details");
}
@After
public void teardown()//teardown-process of deleting temporary data
{
	System.out.println("Browser Closes");
}
@AfterClass
public void afterclass()
{
	System.out.println("After class");
}
}
