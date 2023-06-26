package Xpath;
///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div/input
//Relative Xpath- root node not required only current node needed
//syntax:
// //tagname[@attributename='value']
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void testing()
	{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("j.nmy");	
	}
	@After
	public void close()
	{
	driver.close();	
	}

}
//Navigation commands:
//1.backward
/*driver.navigate().back();
2.forward
driver.navigate().forward();
3.refresh
driver.navigate().refresh();
4.to a url
driver.navigate().to("url");*/
