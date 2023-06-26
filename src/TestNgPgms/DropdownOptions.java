package TestNgPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownOptions {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void testing()
{
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s=new Select(day);
	s.selectByVisibleText("04");
	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s2=new Select(month);
	s2.selectByIndex(4);
	//WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	//Select s3=new Select(month);
	//s3.selectByValue("2002");
	List<WebElement>op=s.getOptions();
	System.out.println(op.size());
	System.out.println("List of all day");
	for(WebElement li:op)
	{
		String options=li.getText();
		System.out.println(options);
	}
	List<WebElement>oop=s2.getOptions();
	System.out.println(oop.size());
	System.out.println("List of all month");
	for(WebElement li:oop)
	{
		String options=li.getText();
		
		System.out.println(options);
	}
	
}
}
