package Xpath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	ChromeDriver driver;
@Test
public void test()
{
driver=new ChromeDriver();	
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//a[contains(@href,'/pages/create/?ref_type=registration_form')]")).click();
driver.findElement(By.xpath("//a[contains(@text(),'Forgotten password?')]")).click();
}
}
