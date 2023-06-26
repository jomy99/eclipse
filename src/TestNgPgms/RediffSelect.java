package TestNgPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffSelect {
ChromeDriver driver;
@BeforeMethod
public void setup()
{
	driver= new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void testing()
{
	if(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected())
	{
		System.out.println("Gender radio button is enabled");
	}
	else
	{
		System.out.println("Gender radio button is not enabled");
	}
}
@Test
public void test2()
{
	if(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed())
	{
		System.out.println("Logo is dispalyed");
	}
	else
	{
		System.out.println("Logo is not displayed");
	}
}
@Test
public void test2ng()
{
	if(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled())
	{
		System.out.println("Gender radio button is enabled");
	}
	else
	{
		System.out.println("Gender radio button is not enabled");
	}
}
@AfterMethod
public void aftermeth()
{
	driver.close();
}

}
