package TestNgPgms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ebaysite {
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void testing()
	{
		//WebDriver wait=new WebDriver(driver,Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act= new Actions(driver);
		WebElement id= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		act.moveToElement(id).perform();
		WebElement mob=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		mob.click();
		
	}
	@AfterMethod
	public void after()
	{
		//driver.close();
	}
}
