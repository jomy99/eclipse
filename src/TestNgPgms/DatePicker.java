package TestNgPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
WebDriver driver;
String baseurl="https://www.expedia.co.in";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void url()
{
	driver.get(baseurl);
	driver.manage().window().maximize();
}
@Test
public void testing()
{
	driver.findElement(By.xpath("//*[@id=\"date_form_field-btn\"]")).click();
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"app-layer-search_form_date_picker_dialog\"]/section/div[2]/div[2]/div/div[1]/h2"));
		String month1=month.getText();
		if(month1.equals("August 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"app-layer-search_form_date_picker_dialog\"]/section/div[2]/div[1]/section[2]/section/svg")).click();
		}
	}
	//storing 1 to 31 in list
	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"app-layer-search_form_date_picker_dialog\"]/section/div[2]/div[2]/div/div[1]/table/tbody/tr/td/button"));
	//iterating one by one
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getAttribute("data-day");
		System.out.println(date);
		if(date.equals("16"))
		{
			dateelement.click();
			System.out.println("Date Selected");
		}
	}
}
}
