package TestNgPgms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class sample_dropdwn
{

ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	//driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}

@Test
public void testing() throws Exception
{ 
	
	driver.get("https://glitzindia.in/new-arrivals");
	//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS) ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	driver.findElement(By.xpath("//*[@id=\"latest-product-listing\"]/div[4]/div/div[1]/a[1]/img")).click();
	WebElement se = driver.findElement(By.id("adcartqnty"));
	Select s=new Select(se);
	s.selectByIndex(2);
	driver.findElement(By.xpath("//*[@id=\"btn-cart-add-quick-buy\"]")).click();
}

}
