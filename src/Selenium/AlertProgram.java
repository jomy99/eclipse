package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/91890/Documents/Testing/Class%20Notes/Program.html");
	}
	@Test
	public void testimg() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a= driver.switchTo().alert();
		 
		Thread.sleep(5000);
		String s = a.getText();
		System.out.println(s);
		
		if(s.equals("Hello! I am alert box!"))
		{
			 System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a.accept();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Jomy");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("JoevGeorge");
		
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	//to send value in alert box
	//driver.switchTo().alert().sendKeys("Value");
}
