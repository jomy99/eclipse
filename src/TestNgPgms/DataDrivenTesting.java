package TestNgPgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	ChromeDriver driver;
@BeforeTest
public void setup()
{
	
	driver=new ChromeDriver();
}
@Test
public void testing() throws IOException
{
	FileInputStream f=new FileInputStream("C://Users//91890//Documents//Testing//Class Notes/Book1.xlsx");
	try (XSSFWorkbook wb = new XSSFWorkbook(f)) {
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		for(int i=1;i<rowCount;i++)
		{
			String uname=sh.getRow(i).getCell(0).getStringCellValue();
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("User name=" +uname);
			System.out.println("Password= "+pass);
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys(uname);
			driver.findElement(By.name("pass")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			String actual=driver.getCurrentUrl();
			String exp="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028";
			if(actual.equals(exp))
			{
				System.out.println("Passes");
			}
			else
			{
				System.out.println("fail");
			}
		}
	}
}
}
