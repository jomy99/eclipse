package Selenium;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99pgmclick {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void testing() throws InterruptedException
	{
	WebElement rclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	Actions act=new Actions(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	act.contextClick(rclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	WebElement elementOpen = driver.findElement(By.name("Cut"));
	elementOpen.click();
	Alert b= driver.switchTo().alert();
	Thread.sleep(5000);
	String g=b.getText();
	b.accept();
	System.out.println("1st Alert text: "+g);
	//act.doubleClick(doubleclick).perform();
	//Alert a= driver.switchTo().alert();
	//Thread.sleep(5000);
	//String s = a.getText();
	//a.accept();
	//System.out.println("Alert" +s);
	}
}
