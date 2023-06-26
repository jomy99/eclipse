package TestNgPgms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoit {
WebDriver driver;
@BeforeTest
public void btest()
{
	driver=new ChromeDriver();
}
	@Test
	public void testing() throws IOException, InterruptedException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\91890\\OneDrive\sample.exe");
	}
}
