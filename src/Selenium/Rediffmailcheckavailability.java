package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailcheckavailability {
	ChromeDriver driver;
@Before
public void starting()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void check()
{
	String s=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	String exp="Check availability";
	if(exp.equals(s))
	{
		System.out.println("Found Success");
	}
	else
{System.out.println("FAil");
}
}

}
