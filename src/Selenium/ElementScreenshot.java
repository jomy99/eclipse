package Selenium;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testimg() throws IOException
	{
		WebElement s=driver.findElement(By.name("login"));
		
		File f=s.getScreenshotAs(OutputType.FILE);
		//copying to drive
		FileHandler.copy(f,new File("./Screenshot/element.png"));
	}
}
