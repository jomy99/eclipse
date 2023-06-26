//To get the list of all links in a web page

package List;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void testing()
{
	List<WebElement> list1=driver.findElements(By.tagName("a"));
	System.out.println(list1.size());
}

}
