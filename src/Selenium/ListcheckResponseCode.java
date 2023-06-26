package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListcheckResponseCode {
	ChromeDriver driver;
@Before
public void starting()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void testing()
{
	List<WebElement> Listlink=driver.findElements(By.tagName("a"));
	System.out.println(Listlink.size());
	for(WebElement li:Listlink)
	{
		String url=li.getAttribute("href");
		verify(url);
		
	}
	
}
private void verify(String url) {
	try {
		URL u=new URL(url);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("Success "+url);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Broken Link" +url);
		}
		else
		{
			System.out.println("Not reachable"+url);
		}
	
	} catch (IOException e) {
		
	}
}
}
