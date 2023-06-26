package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePage {
WebDriver driver;
//Object Repository
By crtpg=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By getstrt=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/div[2]/button/div/div");

public CreatePage(WebDriver driver) {
	this.driver=driver;
}

public void create()
{
	driver.findElement(crtpg).click();
	
}
public void getstarted()
{
	driver.findElement(getstrt).click();
}
}
