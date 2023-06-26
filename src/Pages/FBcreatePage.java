package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBcreatePage {
WebDriver driver;
//object Repository
By fbemail=By.id("email");
By fbpassword=By.id("pass");
By fblogin=By.name("login");
	
public FBcreatePage(WebDriver driver) {
	this.driver=driver;
}
public void setValues(String email,String password)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).sendKeys(password);
}
public void login()
{
	driver.findElement(fblogin).click();
}

}
