package TestNgPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class DragandDrop {
ChromeDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
}
@Test
public void testing()
{
	driver.manage().window().maximize();
	Actions act= new Actions(driver);
	WebElement id= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	act.moveToElement(id);
	id.sendKeys("ANUU");
	WebElement Sourcelocator=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement DestLocator=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	act.dragAndDrop(Sourcelocator, DestLocator).perform();
}
}
