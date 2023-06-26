package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelecProgram {
	ChromeDriver driver;
		public SelecProgram(WebElement day) {
		// TODO Auto-generated constructor stub
	}
		@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void testing()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		SelecProgram s=new SelecProgram(day);
		//Select s=new Select(day);
		//s.selectByVisibleText("04");
		//s.selectByValue("02");
		//s.selectByIndex("03");
	}
	
	
	
}
