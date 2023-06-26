package TestNgPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jobforher {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.jobsforher.com/women-returnee-jobs");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testing()
	
	{
		
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).isSelected();
		
	}
}
