package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstPgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
driver.quit();
	}

}
